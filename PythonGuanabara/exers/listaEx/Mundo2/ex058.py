import random

ctg = 0
n = random.randrange(0, 10, 1)
u = 99

while u != n:
    ctg += 1
    u = int(input('Tente acertar o numero de 0 a 10: '))
    if u == n:
        print('Parabens!\nVoce acertou com {} tentativas'.format(ctg))
    else:
        print('Errou')