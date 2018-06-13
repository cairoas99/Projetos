ent = int(input('Insira um numero: '))
num = ent
cont = num-1


while cont > 0:
    num = num * cont
    cont -= 1
print('Usando while, o fatorial de {} é {}'.format(ent, num))

num = ent
cont = num-1

for cont in range (num-1, 0, -1):
    num = num * cont
    cont -= 1
print('\nUsando for, o fatoril de {} é {}'.format(ent, num))