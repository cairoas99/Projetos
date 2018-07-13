lista = list()
pares = list()
impares = list()

while True:
    lista.append(float(input('Insira um valor: ')))
    cont = str(input('Deseja continuar? (S/N) '))
    if lista[-1] % 2 == 0:
        pares.append(lista[-1])
    else:
        impares.append(lista[-1])
    if str(cont).lower() == 'n':
        break

print(f'Valores inseridos: {lista}')
print(f'Pares: {pares}')
print(f'Impares: {impares}')