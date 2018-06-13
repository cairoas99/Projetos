idd = int(input('Idade: '))

if idd <= 9:
    print('MIRIM')
elif idd <= 14:
    print('INFANTIL')
elif idd <= 19:
    print('JUNIOR')
elif idd <= 20:
    print('SENIOR')
else:
    print('MASTER')