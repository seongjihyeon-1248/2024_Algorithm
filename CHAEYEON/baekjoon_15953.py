t = int(input())

# 각 대회별 상금표
def f_rank(rank):
    if rank == 1:
        return 5000000
    elif rank > 1 & rank < 4:
        return 3000000
    elif rank > 3 & rank < 7:
        return 2000000
    elif rank > 6 & rank < 11:
        return 500000
        rank > 10 & rank < 16: 300000,
        rank > 15 & rank < 22: 100000,

def s_rank(rank):
    return {
        rank == 1 : 5120000,
        rank > 1 & rank < 4: 2560000,
        rank > 3 & rank < 8: 1280000,
        rank > 7 & rank < 17: 640000,
        rank > 16 & rank < 32: 320000,
    }.get(rank, 0)()

for _ in range(t):
    f_try, s_try = map(int, input().split())
    print(f_rank(f_try) + s_rank(s_try))
