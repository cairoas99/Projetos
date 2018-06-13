import random

a1 = input('Insira o nome do 1º aluno: ')
a2 = input('Insira o nome do 2º aluno: ')
a3 = input('Insira o nome do 3º aluno: ')
a4 = input('Insira o nome do 4º aluno: ')

lista = [a1, a2, a3, a4]

n = random.randrange(1, 4, 1)

print('Aluno escolhido foi {}'.format(lista[n]))

