tupla = (int(input('Insira um valor: ')),
         int(input('Insira um valor: ')),
         int(input('Insira um valor: ')),
         int(input('Insira um valor: ')))

qt9 = 0
pos3 = 99
par = []

for n in tupla:
    if n == 9:
        qt9 +=1
    elif n % 2 == 0:
        par.append(n)
    elif n == 3:
        pos3 = tupla.index(3) +1

print(f'Quantidade de 9s: {qt9}')
if pos3 == 99:
    print('O numero 3 não apareceu!')
else:
    print(f'Posição do 1º 3: {pos3}')
print(f'Numeros pares: {par}')