n1 = float(input('Insira a 1ª nota: '))
n2 = float(input('Insira a 2ª nota: '))
m = (n1 + n2) / 2

if m < 5:
    print('Reprovado com media: {:.1f}'.format(m))
elif m >= 5 and m < 7:
    print('Recuperação com media: {:.1f}'.format(m))
else:
    print('Aprovado com media: {:.1f}'.format(m))