import subprocess
import sys
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

# 定義Git命令
diff_tree_command = f"git diff-tree -r --no-commit-id --name-status --text --diff-filter=ACDMRT {commit_hash_start} {commit_hash_end} > fileList_{today_date}.txt"
archive_command = f"git archive --format=zip --output=diff_{today_date}.zip HEAD $(git diff-tree -r --no-commit-id --name-only --diff-filter=ACMRT {commit_hash_start} {commit_hash_end})"

print("起點:"+commit_hash_start)
print("終點:"+commit_hash_end)
# 執行第一個Git命令
print("產生差異清單txt")
subprocess.run(diff_tree_command, shell=True, check=True)

# 執行第二個Git命令
print("產生差異檔壓縮檔")
subprocess.run(archive_command, shell=True, check=True)

# txt檔案
print("備份git語法")
with open(f"diff_{today_date}.txt", "w") as f:
    f.write(diff_tree_command)
    f.write("\n")
    f.write("\n")
    f.write(archive_command)
    f.write("\n")
    f.write("\n")
    f.write("OLD:"+commit_hash_start)
    f.write("\n")
    f.write("NEW:"+commit_hash_end)
print("Git命令執行完成")
