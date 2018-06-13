maior = 0
menor = 0

for c in range(1, 8):
    idade = int(input('{} - Digite sua idade: '.format(c)))
    if(idade >= 21):
        maior += 1
        print('Maior')
    else:
        menor += 1
        print('Menor')

print('Maiores de 18 anos: {}'.format(maior))
print(('menores de 18 anos: {}'.format(menor)))