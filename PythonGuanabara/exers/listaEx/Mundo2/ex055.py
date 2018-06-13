maior = 0
menor = 0
peso = 0
pesos = []
for c in range(1, 6):
    peso = (float(input('Peso da {}ª pessoa: '.format(c))))
    if c == 1:
        menor = peso
        maior = peso
    else:
        if peso > maior:
            maior = peso

        if peso < menor:
            menor = peso

print('Maior peso: {}'.format(maior))
print('Menor peso: {}'.format(menor))