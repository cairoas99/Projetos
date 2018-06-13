nome = str(input('Insira seu nome completo: '))
nome = nome.strip()

print('O nome tem Silva?'.format('SILVA' in nome.upper()))