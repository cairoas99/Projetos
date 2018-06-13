sal = float(input('Insira o salario R$: '))
aum = 0

if sal > 1250:
    aum = sal * 1.1
else:
    aum = sal * 1.15

print('Salario com aumento R$: {:.2f}'.format(aum))