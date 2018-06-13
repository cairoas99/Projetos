ano = int(input('Insira o ano: '))

print('É Bisexto!' if (((ano % 4) == 0 and (ano % 100) != 0) or (ano % 400) == 0) else 'Não é Bisexto')