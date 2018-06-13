import random

jkp = ['Pedra', 'Papel', 'Tesoura']


opj = 0


while opj > -1:

    opm = random.randrange(0, 2, 1)
    print('1 - Pedra')
    print('2 - Papel')
    print('3 - Tesoura')
    print('0 - Sair')
    opj = int(input('Escolha qual vai jogar '))
    opj = opj - 1
    print('')
    if opj >= 0 and opj <= 2:
        if opm == opj:
            print('Empate')
        elif opm == 0:
            if opj == 2:
                print('A maquina ganhou')
            else:
                print('Jogador ganhou')
        elif opm == 1:
            if opj == 0:
                print('A maquina ganhou')
            else:
                print('O jogador ganhou')
        else:
            if opj == 1:
                print('A maquina ganhou')
            else:
                print('O jogador ganhou')

        print('Maquina: {}\nJogador: {}'.format(jkp[opm], jkp[opj]))
        a = input('Pressione enter para repetir')
    elif (opj == -1):
        print('Tchau!')
    else:
        print('Opção invalida!!')

    print('')

