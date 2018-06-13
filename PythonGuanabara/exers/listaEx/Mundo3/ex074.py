from random import randrange
nros = (randrange(1, 10, 1),randrange(1, 10, 1),randrange(1, 10, 1),randrange(1, 10, 1),randrange(1, 10, 1))
print(nros)
m = (sorted(nros))
maior = m[-1]
menor = m[0]
print(f'Maior: {maior}')
print(f'Menor: {menor}')