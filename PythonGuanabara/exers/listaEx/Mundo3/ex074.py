from random import randint
nros = (randint(1, 10),randint(1, 10),randint(1, 10),randint(1, 10),randint(1, 10))
print(nros)
m = (sorted(nros))
maior = m[-1]
menor = m[0]
print(f'Maior: {maior}')
print(f'Menor: {menor}')