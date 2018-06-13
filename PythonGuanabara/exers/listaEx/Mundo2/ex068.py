from random import  randrange
maq = jog = soma = qtj = 0
opc = ''

while True:
    print('_'*40)
    opc = str(input('Quer jogar par ou impar (p/i) ou outro para sair: '))
    jog = int(input('Digite o numero: '))
    maq = randrange(0, 100, 1)
    soma = maq + jog
    print(f'Você jogou {jog}, e a maquina {maq} Total de {soma} que é ' + 'Par' if soma % 2 == 0 else 'Impar')
    if opc.lower() == 'p':
        if soma % 2 == 0:
            print('Ganhou')
            qtj += 1
        else:
            if qtj == 0:
                print('Perdeu')
            else:
                print(f'Perdeu, mas ganhou {qtj} consecutivas')
            break
    elif opc.lower() == 'i':
        if soma % 2 != 0:
            print('Ganhou')
            qtj += 1
        else:
            if qtj == 0:
                print('Perdeu')
            else:
                print(f'Perdeu, mas ganhou {qtj} consecutivas')
            break
    else:
        print('Opção invalida')
        break