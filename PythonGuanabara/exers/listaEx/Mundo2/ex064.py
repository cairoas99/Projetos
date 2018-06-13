n = 0
soma = 0
qt = 0

while n != 999:
    n = int(input('Insira um numero: '))
    if n != 999:
        soma += n
        qt += 1
print('Soma: {} \nNumeros inseridos: {}'.format(soma, qt))