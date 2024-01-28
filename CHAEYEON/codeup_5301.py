N, K, P = map(int, input().split())
bread = list(map(int, input().split()))
bundle = [bread[i * K : (i + 1) * K] for i in range((len(bread) + K - 1) // K)]

result = N
for b in bundle:
    if b.count(0) >= P:
        result -= 1

print(result)