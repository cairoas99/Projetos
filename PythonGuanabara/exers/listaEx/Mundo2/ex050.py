soma = 0
inpt = 0
for c in range(0, 6):
    inpt = int(input('Insira um numero: '))
    if(inpt % 2 == 0):
        soma += inpt
print('Soma dos numeros pares: {}'.format(soma))