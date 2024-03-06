import sys

n = int(sys.stdin.readline())

for _ in range(n):
    target = int(sys.stdin.readline())
    cnt = 0
    i = 5
    while i <= target:
        cnt += target//i
        i *= 5
    print(cnt)