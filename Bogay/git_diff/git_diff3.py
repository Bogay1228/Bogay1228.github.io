import subprocess
import sys
import os
import zipfile
from datetime import datetime
import locale

# 設定系統編碼
def setup_encoding():
    """設定適當的編碼環境"""
    try:
        # 嘗試設定為 UTF-8
        locale.setlocale(locale.LC_ALL, 'C.UTF-8')
    except locale.Error:
        try:
            # 備選方案
            locale.setlocale(locale.LC_ALL, '')
        except locale.Error:
            pass

def safe_decode(byte_data):
    """安全解碼位元組資料，處理各種編碼問題"""
    encodings = ['utf-8', 'utf-8-sig', 'big5', 'cp950', 'gbk', 'cp936']
    
    for encoding in encodings:
        try:
            return byte_data.decode(encoding)
        except (UnicodeDecodeError, UnicodeError):
            continue
    
    # 如果所有編碼都失敗，使用 errors='replace' 強制解碼
    return byte_data.decode('utf-8', errors='replace')

def run_git_command(command, binary_output=False):
    """執行 git 命令並處理編碼問題"""
    try:
        # 設定環境變數
        env = os.environ.copy()
        env.update({
            'LC_ALL': 'C.UTF-8',
            'LANG': 'C.UTF-8',
            'GIT_CONFIG_NOSYSTEM': '1',
            'PYTHONIOENCODING': 'utf-8'
        })
        
        if isinstance(command, str):
            result = subprocess.run(
                command, 
                shell=True, 
                capture_output=True, 
                env=env,
                cwd=os.getcwd()
            )
        else:
            result = subprocess.run(
                command, 
                capture_output=True, 
                env=env,
                cwd=os.getcwd()
            )
        
        if result.returncode != 0:
            error_msg = safe_decode(result.stderr) if result.stderr else "未知錯誤"
            return None, error_msg
        
        if binary_output:
            return result.stdout, None
        else:
            output = safe_decode(result.stdout)
            return output, None
            
    except Exception as e:
        return None, f"執行命令時發生錯誤: {str(e)}"

# 檢查命令行參數數量
if len(sys.argv) != 3:
    print("使用方法: python git_diff2.py <新commit> <舊commit>")
    print("範例: python git_diff2.py HEAD HEAD~1")
    sys.exit(1)

# 設定編碼環境
setup_encoding()

# 提取命令行參數
commit_hash_start = sys.argv[2]  # 舊的 commit
commit_hash_end = sys.argv[1]    # 新的 commit

# 獲取今天的日期
today_date = datetime.now().strftime("%Y%m%d")

print(f"起點(舊): {commit_hash_start}")
print(f"終點(新): {commit_hash_end}")

try:
    # 第一步：產生差異清單txt
    print("正在產生差異清單...")
    diff_tree_command = f"git diff-tree -r --no-commit-id --name-status --text --diff-filter=ACDMRT {commit_hash_start} {commit_hash_end}"
    
    diff_output, error = run_git_command(diff_tree_command)
    if error:
        print(f"產生差異清單失敗: {error}")
        sys.exit(1)
    
    # 寫入差異清單檔案
    list_filename = f"fileList_{today_date}.txt"
    with open(list_filename, "w", encoding='utf-8-sig') as f:  # 使用 BOM 確保 Windows 正確顯示
        f.write(diff_output)
    
    print(f"差異清單已儲存至: {list_filename}")
    
    # 第二步：獲取變更的檔案清單
    print("正在獲取檔案清單...")
    files_command = f"git diff-tree -r --no-commit-id --name-only --diff-filter=ACMRT {commit_hash_start} {commit_hash_end}"
    files_output, error = run_git_command(files_command)
    
    if error:
        print(f"獲取檔案清單失敗: {error}")
        sys.exit(1)
    
    files = [f.strip() for f in files_output.strip().split('\n') if f.strip()]
    
    if not files:
        print("沒有找到變更的檔案")
        sys.exit(0)
    
    print(f"找到 {len(files)} 個變更的檔案")
    
    # 第三步：建立壓縮檔
    print("正在建立壓縮檔...")
    zip_filename = f"diff_{today_date}.zip"
    
    with zipfile.ZipFile(zip_filename, 'w', zipfile.ZIP_DEFLATED, compresslevel=6) as zipf:
        success_count = 0
        error_files = []
        
        for i, file in enumerate(files, 1):
            print(f"處理檔案 {i}/{len(files)}: {file}")
            
            try:
                # 使用 git show 獲取特定 commit 的檔案內容
                show_command = ['git', 'show', f'{commit_hash_end}:{file}']
                file_content, error = run_git_command(show_command, binary_output=True)
                
                if error:
                    print(f"  警告: 無法取得檔案內容 - {error}")
                    error_files.append(f"{file}: {error}")
                    continue
                
                # 將檔案加入壓縮檔，確保路徑正確
                zipf.writestr(file, file_content)
                success_count += 1
                print(f"  ✓ 已加入壓縮檔")
                
            except Exception as e:
                error_msg = f"處理檔案時發生錯誤: {str(e)}"
                print(f"  ✗ {error_msg}")
                error_files.append(f"{file}: {error_msg}")
                continue
        
        print(f"\n成功壓縮 {success_count}/{len(files)} 個檔案")
        if error_files:
            print(f"失敗檔案數: {len(error_files)}")
    
    print(f"差異檔案壓縮檔已儲存至: {zip_filename}")
    
    # 第四步：建立說明檔案
    print("正在建立說明檔案...")
    info_filename = f"diff_{today_date}.txt"
    
    with open(info_filename, "w", encoding='utf-8-sig') as f:
        f.write("=== Git 差異分析報告 ===\n")
        f.write(f"分析時間: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")
        f.write(f"起點(舊): {commit_hash_start}\n")
        f.write(f"終點(新): {commit_hash_end}\n")
        f.write(f"變更檔案數: {len(files)}\n")
        f.write(f"成功處理: {success_count}\n")
        f.write(f"處理失敗: {len(error_files)}\n\n")
        
        f.write("=== 使用的 Git 命令 ===\n")
        f.write("差異清單:\n")
        f.write(f"  {diff_tree_command}\n\n")
        f.write("檔案清單:\n")
        f.write(f"  {files_command}\n\n")
        f.write("檔案內容:\n")
        f.write(f"  git show <commit>:<filepath>\n\n")
        
        f.write("=== 變更檔案清單 ===\n")
        for file in files:
            f.write(f"  {file}\n")
        
        if error_files:
            f.write("\n=== 處理失敗的檔案 ===\n")
            for error_file in error_files:
                f.write(f"  {error_file}\n")
        
        f.write("\n=== 原始 Git Archive 命令 (可能因中文檔名失敗) ===\n")
        original_command = f"git archive --format=zip --output=diff_{today_date}.zip {commit_hash_end} $(git diff-tree -r --no-commit-id --name-only --diff-filter=ACMRT {commit_hash_start} {commit_hash_end})"
        f.write(f"  {original_command}\n")
    
    print(f"說明檔案已儲存至: {info_filename}")
    print("\n=== 執行完成 ===")
    print(f"產生的檔案:")
    print(f"  - {list_filename}")
    print(f"  - {zip_filename}")
    print(f"  - {info_filename}")
    
except KeyboardInterrupt:
    print("\n使用者中斷執行")
    sys.exit(1)
except Exception as e:
    print(f"執行過程中發生錯誤: {e}")
    import traceback
    traceback.print_exc()
    sys.exit(1)