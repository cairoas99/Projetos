import math

co = float(input('Insira a medida do cateto oposto: '))
ca = float(input('Insira a medida do cateto adjacente: '))

hip = math.hypot(co, ca)

print('A hipotenusa vai medir: {:.2f}'.format(hip))
