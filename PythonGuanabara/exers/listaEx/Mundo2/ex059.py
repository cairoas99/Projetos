n1 = float(input('Insira o 1º numero: '))
n2 = float(input('Insira o 2º numero: '))
opc = 0

while opc != 5:
    print('=#'*14 + '=')
    print('1 - Somar')
    print('2 - Multiplicar')
    print('3 - Maior')
    print('4 - Novos numeros')
    print('5 - Sair')
    opc = int(input('Qual a opção escolhida? '))

    print('=#' * 14 + '=')

    if opc == 1:
        print('Resultado da soma: {:.2f}'.format(n1 + n2))
    elif opc == 2:
        print('Resultado da multiplicação: {:.2f}'.format(n1 * n2))
    elif opc == 3:
        if n1 > n2:
            print('O maior numero é {:.2f}'.format(n1))
        elif n1 == n2:
            print('Os numeros são iguais')
        else:
            print('O maior numero é {:.2f}'.format(n2))
    elif opc == 4:
        n1 = float(input('Insira o 1º numero: '))
        n2 = float(input('Insira o 2º numero: '))
    elif opc == 5:
        print('Tchau!')
    else:
        print('Opção invalida')