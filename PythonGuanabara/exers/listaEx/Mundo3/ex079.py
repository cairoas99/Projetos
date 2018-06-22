 valores = list()

while True:
    aux = (float(input('Insira um valor: ')))
    if valores.count(aux) == 0:
        valores.append(aux)
    else:
        print('Valor ja inserido, não vou adicionar!')

    #if aux not in valores: #Resolução guanabara
    #    valores.append(aux)
    #else:
    #    print('Valor ja inserido, não vou adicionar!')

    cont = str(input('Deseja continuar? (S/N) '))
    if cont.lower() == 'n':
        break

valores.sort()
print(f'Você adicionou os valores: {valores}')