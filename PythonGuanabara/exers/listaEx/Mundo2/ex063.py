n = int(input('Insira um numero: '))
c = 0

def fib(x):
    if x == 1 or x == 2:
        return 1
    elif x > 0:
        return (fib(x-1)+fib(x-2))

print(fib(n))