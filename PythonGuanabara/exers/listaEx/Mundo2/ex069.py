sexo = opc = ''
idade = qt18 = qth = qtm20 = 0

while True:
    print(':'*30)
    while True:
        sexo = str(input('Digite o sexo (m/f):'))
        if sexo.lower() == 'f':
            break
        elif sexo.lower() == 'm':
            break
    idade = int(input('Dogite a idade: '))

    if idade > 18:
        qt18 += 1

    if sexo.lower() == 'm':
        qth += 1
    elif sexo.lower() == 'f':
        if idade < 20:
            qtm20 += 1
    sexo = ''

    while True:
        opc = str(input('Deseja continuar (s/n)? '))
        if opc.lower() == 's':
            break
        elif opc.lower() == 'n':
            break

    if opc.lower() == 'n':
        break
    else:
        opc = ''
print(':'*35)
print(f'Qt Maiores de 18 anos: {qt18}\nQt Homens: {qth}\nQt Mulheres com menos de 20 anos: {qtm20}')