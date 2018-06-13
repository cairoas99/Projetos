import random

n = random.randrange(0, 5, 1)

u = int(input('Tente acertar o numero de 0 a 5: '))
print('Parabens!' if u == n else 'Errou, o numero era: {}'.format(n))