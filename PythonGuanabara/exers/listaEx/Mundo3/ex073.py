bras =('Flamengo','Cruzeiro','Grêmio','São Paulo','Internacional','Sport','Palmeiras','Corinthians','Fluminense',
    'Atlético-MG','América-MG','Botafogo','Vasco','Chapecoense','Santos','Atlético-PR','Vitória','Bahia','Paraná','Ceará')

while True:
    print('****MENU*****')
    print('A - 5 primeiros')
    print('B - Ultimos quatro')
    print('C - Ordem alfabetica')
    print('D - colocação da Chapecoense')
    print('Z - Sair')
    opc = str(input('Escolha a opção:'))

    if opc.lower() == 'a':
        print(bras[:6])
    elif opc.lower() == 'b':
        print(bras[-4:])
    elif opc.lower() == 'c':
        print(sorted(bras))
    elif opc.lower() == 'd':
        print(bras.index('Chapecoense') + 1)
    elif opc.lower() == 'z':
        break
    else:
        print('Opção invalida tente novamente')