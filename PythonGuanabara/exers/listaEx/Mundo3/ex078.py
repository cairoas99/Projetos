valores = list()

for i in range(0, 5):
    valores.append(float(input('Insira um numero')))

mostra = valores[:]
mostra.sort()

print(mostra)
print(valores)

print(f'Maior valor inserido: {mostra[4]} na posição {valores.index(mostra[4])}')
print(f'Menor valor inserido: {mostra[0]} na posição {valores.index(mostra[0])}')

