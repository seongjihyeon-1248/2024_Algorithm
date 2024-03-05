t = int(input())

# 각 대회별 상금표
def f_rank(rank):
    if rank == 1:
        return 5000000
    elif 1 < rank <= 3:
        return 3000000
    elif 3 < rank <= 6:
        return 2000000
    elif 6 < rank <= 10:
        return 500000
    elif 10 < rank <= 15:
        return 300000
    elif 15 < rank <= 21:
        return 100000
    else: return 0
    
def s_rank(rank):
    if rank == 1:
        return 5120000
    elif 1 < rank <= 3:
        return 2560000
    elif 3 < rank <= 7:
        return 1280000
    elif 7 < rank <= 15:
        return 640000
    elif 15 < rank <= 31:
        return 320000
    else: return 0

for _ in range(t):
    f_try, s_try = map(int, input().split())
    print(f_rank(f_try) + s_rank(s_try))
