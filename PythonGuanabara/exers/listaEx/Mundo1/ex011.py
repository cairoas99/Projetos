l = float(input('Largura da parede (em metros): '))
a = float(input('Altura da parede (em metros): '))
area = l*a
tinta = area/2

print('A area de sua parede é {:.2f}m2 ({:.2f}m X {:.2f}m)'.format(area, l, a))
print('Serão necessarios {:.1f}l de tinta para pintar a parede'.format(tinta))