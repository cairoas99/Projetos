print('## Aluguel de Carros ##')
d = int(input('Quantos dia ficou com o Carro: '))
km = float(input('Rodou quantos km: '))

t = (d * 60) + (km * .15)

print('O total a pagar é de R$: {:.2f}'.format(t))