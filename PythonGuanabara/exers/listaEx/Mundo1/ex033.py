n1 = int(input('Insira um numero inteiro: '))
n2 = int(input('Insira um numero inteiro: '))
n3 = int(input('Insira um numero inteiro: '))


if n1 == n2 or n1 == n3 or n2 == n3:
    print('Insira valores diferentes!')
else:
    if n1 > n2 and n1 > n3:
        print('Maior: {}'.format(n1))
        if n2 < n3:
            print('Menor: {}'.format(n2))
        else:
            print('Menor: {}'.format(n3))
    else:
        if n2 > n3 and n2 > n1:
            print('Maior: {}'.format(n2))
            if n1 < n3:
                print('Menor: {}'.format(n1))
            else:
                print('Menor: {}'.format(n3))
        else:
            if n3 > n2 and n3 > n1:
                print('Maior: {}'.format(n3))
                if n2 < n1:
                    print('Menor: {}'.format(n2))
                else:
                    print('Menor: {}'.format(n1))