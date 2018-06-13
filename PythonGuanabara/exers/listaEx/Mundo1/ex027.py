nome = str(input('Insira seu nome completo: '))
lista = nome.split()

print('Seu primeiro nome é: {}'.format(lista[0]))
print('Seu ultimo nome é  : {}'.format(lista[len(lista)-1]))