import subprocess
import sys
import os
import zipfile
from datetime import datetime

# 檢查命令行參數數量
if len(sys.argv) != 3:
    print("請提供兩個提交點的 commit hash")
    sys.exit(1)

# 提取命令行參數
commit_hash_start = sys.argv[2]
commit_hash_end = sys.argv[1]

# 獲取今天的日期
today_date = datetime.now().strftime("%Y%m%d")

print("起點:" + commit_hash_start)
print("終點:" + commit_hash_end)

try:
    # 設定環境變數處理中文字元
    env = os.environ.copy()
    env['LC_ALL'] = 'C.UTF-8'
    
    # 第一個命令：產生差異清單txt
    print("產生差異清單txt")
    diff_tree_command = f"git diff-tree -r --no-commit-id --name-status --text --diff-filter=ACDMRT {commit_hash_start} {commit_hash_end}"
    
    result = subprocess.run(diff_tree_command, shell=True, capture_output=True, text=True, encoding='utf-8', env=env)
    if result.returncode != 0:
        print(f"產生差異清單失敗: {result.stderr}")
        sys.exit(1)
    
    # 寫入差異清單檔案
    with open(f"fileList_{today_date}.txt", "w", encoding='utf-8') as f:
        f.write(result.stdout)
    
    # 第二個命令：使用 Python zipfile 處理壓縮檔（避免中文檔名問題）
    print("產生差異檔壓縮檔")
    
    # 獲取變更的檔案清單
    files_command = f"git diff-tree -r --no-commit-id --name-only --diff-filter=ACMRT {commit_hash_start} {commit_hash_end}"
    files_result = subprocess.run(files_command, shell=True, capture_output=True, text=True, encoding='utf-8', env=env)
    
    if files_result.returncode != 0:
        print(f"獲取檔案清單失敗: {files_result.stderr}")
        sys.exit(1)
    
    files = [f for f in files_result.stdout.strip().split('\n') if f]
    
    # 使用 Python zipfile 建立壓縮檔
    zip_filename = f"diff_{today_date}.zip"
    with zipfile.ZipFile(zip_filename, 'w', zipfile.ZIP_DEFLATED) as zipf:
        success_count = 0
        total_count = len(files)
        
        for file in files:
            try:
                # 使用 git show 獲取特定 commit 的檔案內容
                show_command = ['git', 'show', f'{commit_hash_end}:{file}']
                file_result = subprocess.run(show_command, capture_output=True, env=env)
                
                if file_result.returncode == 0:
                    # 將檔案內容寫入壓縮檔
                    zipf.writestr(file, file_result.stdout)
                    success_count += 1
                else:
                    print(f"警告: 無法取得檔案 '{file}' (可能已被刪除)")
                    
            except Exception as e:
                print(f"處理檔案 '{file}' 時發生錯誤: {e}")
                continue
        
        print(f"成功壓縮 {success_count}/{total_count} 個檔案")
    
    # 第三個命令：備份git語法
    print("備份git語法")
    original_diff_tree_command = f"git diff-tree -r --no-commit-id --name-status --text --diff-filter=ACDMRT {commit_hash_start} {commit_hash_end} > fileList_{today_date}.txt"
    original_archive_command = f"git archive --format=zip --output=diff_{today_date}.zip HEAD $(git diff-tree -r --no-commit-id --name-only --diff-filter=ACMRT {commit_hash_start} {commit_hash_end})"
    
    with open(f"diff_{today_date}.txt", "w", encoding='utf-8') as f:
        f.write("原始指令（可能因中文檔名而失敗）:\n")
        f.write(original_diff_tree_command)
        f.write("\n")
        f.write(original_archive_command)
        f.write("\n\n")
        f.write("修正後使用的指令:\n")
        f.write(diff_tree_command + f" > fileList_{today_date}.txt")
        f.write("\n")
        f.write("使用 Python zipfile 模組建立壓縮檔以處理中文檔名")
        f.write("\n\n")
        f.write("OLD:" + commit_hash_start)
        f.write("\n")
        f.write("NEW:" + commit_hash_end)
        f.write("\n\n")
        f.write(f"處理檔案清單:\n")
        for file in files:
            f.write(f"  {file}\n")
    
    print("Git命令執行完成")
    
except subprocess.CalledProcessError as e:
    print(f"Git 命令執行失敗: {e}")
    print(f"返回代碼: {e.returncode}")
    if hasattr(e, 'stderr') and e.stderr:
        print(f"錯誤訊息: {e.stderr}")
    sys.exit(1)
except Exception as e:
    print(f"執行過程中發生錯誤: {e}")
    sys.exit(1)