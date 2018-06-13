m1 = float(input('Insira a medida do lado A:'))
m2 = float(input('Insira a medida do lado B:'))
m3 = float(input('Insira a medida do lado C:'))

if(m1 == m2 and m2 == m3):
    print('\033[1;36mForma um triangulo\033[m')
else:
    if (m1 > m2 and m1 > m3):
        if(m2 + m3 < m1):
            print('\033[1;31mNão forma um triangulo\033[m')
        else:
            print('\033[1;36mForma um triangulo\033[m')
    else:
        if (m2 > m1 and m2 > m3):
            if (m1 + m3 < m2):
                print('\033[1;31mNão forma um triangulo\033[m')
            else:
                print('\033[1;36mForma um triangulo\033[m')
        else:
            if (m3 > m2 and m3 > m1):
                if (m2 + m1 < m3):
                    print('\033[1;31mNão forma um triangulo\033[m')
                else:
                    print('\033[1;36mForma um triangulo\033[m')
