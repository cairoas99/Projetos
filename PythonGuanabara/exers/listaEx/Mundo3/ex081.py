lista = list()

while True:
    lista.append(float(input('Insira um valor: ')))
    cont = str(input('Deseja continuar? (S/N) '))
    if str(cont).lower() == 'n':
        break


print(f'Você insriu {len(lista)} numeros')
lista.sort(reverse=True)
print(f'Em ordem decrescente {lista}')
if 5 in lista:
    print('O numero 5 foi inserido')
else:
    print('O numero 5 não foi inserido')