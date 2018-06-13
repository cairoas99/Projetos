num = int(input('Insira o numero para fazer a tabuada: '))

for c in range(0, 11):
    print('|{} x {:2} = {:>4}|'.format(num, c, num * c))