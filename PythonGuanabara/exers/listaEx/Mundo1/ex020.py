import random

a0 = str(input('Aluno 1: '))
a1 = str(input('Aluno 1: '))
a2 = str(input('Aluno 1: '))
a3 = str(input('Aluno 1: '))

alunos = [a0, a1, a2, a3]

random.shuffle(alunos)

print('A ordem será: {}'.format(alunos))