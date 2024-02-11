# python으로 제출했을 때는 시간 초과
# pypy3로 수정해야 함

import sys
import math

n, k = map(int, sys.stdin.readline().split())
pref = list(map(int, sys.stdin.readline().split()))

def variance(selection):
    dis = 0
    avg = sum(selection)/len(selection)
    for d in selection:
        dis += (d-avg)**2
    return dis/len(selection)

answer = list()
for i in range(n-k+1):
    for j in range(n-k-i+1):
        tmp = pref[i:i+k+j]
        a = variance(tmp)
        answer.append(a)
print(math.sqrt(min(answer)))