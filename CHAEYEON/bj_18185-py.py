def buy_one(n):
    global result
    result += 3 * x[n]

def buy_two(n):
    global result
    m = min(x[n:n+2])
    x[n] -= m
    x[n+1] -= m
    result += 5* m    

def buy_three(n):
    global result
    m = min(x[n:n+3])
    x[n] -= m
    x[n+1] -= m
    x[n+2] -= m
    result += 7* m
    
import sys
N = int(sys.stdin.readline())
x = list(map(int, sys.stdin.readline().split())) + [0,0]
result = 0
for i in range(len(x)-2):
    if x[i+1] > x[i+2]: 
        m = min(x[i], x[i+1] - x[i+2])
        x[i] -= m
        x[i+1] -= m
        result += 5*m 
        buy_three(i) 
        buy_one(i) 
    else :
        buy_three(i)
        buy_two(i)
        buy_one(i)
print(result)