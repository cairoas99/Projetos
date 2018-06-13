extenso = ('ZERO','UM','DOIS','TRES','QUATRO','CINCO',
           'SEIS','SETE','OITO','NOVE','DEZ',
           'ONZE','DOZE','TREZE','QUATORZE','QUINZE',
           'DEZESSEIS','DEZESSETE','DEZOITO','DEZENOVE','VINTE')

while True:
    num = int(input('Insira um numero entre 0 e 20: '))

    if 20 >= num >= 0:
        print(f'Voc^digitou o numero {extenso[num]}')
        break
    else:
        print('Opção invalida')