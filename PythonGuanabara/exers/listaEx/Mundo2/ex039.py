import datetime
agora = datetime.datetime.now()

nasc = int(input('Ano de nascimento: '))

idd = agora.year - nasc

if idd < 18:
    print('Ainda vai se alistar faltam {} anos'.format(18 - idd))
elif idd == 18:
    print('Hora de se alistar')
else:
    print('Passou {} anos do tempo certo'.format(idd - 18))