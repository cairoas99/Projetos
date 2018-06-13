a = float(input('Insira sua altura em cm: '))
p = float(input('Insira seu peso em Kg: '))
a = a/100

imc = p/(a**2)
txt = ''

if imc <18.5:
    txt = ('Abaixo do peso')
elif imc < 25:
    txt = ('Peso ideal')
elif imc < 30:
    txt = ('Sobrepeso')
elif imc < 40:
    txt =('Obesidade')
else:
    txt =('Obesidade Morbida')
print('Seu IMC é {:.2f}, que classifica {}'.format(imc, txt))