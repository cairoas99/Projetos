vel = int(input('insira a velocidade em Km/h: '))

if vel <= 80:
    print('Ok, dentro da velocidade pertmitida!')
else:
    km = vel - 80
    print('!Ultrapassou a velocidade permitida em {}Km/h'.format(km))
    print('Multa no valor de R$: {:.2f}'.format(km*7))
