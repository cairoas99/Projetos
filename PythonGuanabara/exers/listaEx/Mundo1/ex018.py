import math

a = float(input('Digite o angulo desejado: '))

r = math.radians(a)

s = math.sin(r)
c = math.cos(r)
t = math.tan(r)

print('\nO angulo de {:.2f} tem: \n{:>4}Seno de: {:.2f}\n{:>4}Cosseno de: {:.2f}\n{:>4}Tangente de : {:.2f}'.format(a,'' , s,'', c,'', t))