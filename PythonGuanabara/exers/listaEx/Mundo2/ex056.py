fem20 = 0
idade = 0
velho = 0
pessoa = []
pessoas = []

pessoas = [['a', 45, 'm'], ['b',12 ,'f'], ['c',21 , 'm'], ['d', 23, 'f'], ['e',54 , 'm'], ['f',11 , 'f']]
'''
for c in range(0, 4):
    print('='*4+'{:>4}'+'='*4+''.format(c+1))
    pessoa.append(str(input('Nome: ')))
    pessoa.append(int(input('Idade: ')))
    pessoa.append(str(input('Sexo(m/f): ')))
    pessoas.append(pessoa)
    pessoa = []
    
'''
print(pessoas)
for c in range(0, 4):
    idade +=pessoas[c][1]
print('Media de idade: {}'.format(idade/len(pessoas)))

for c in range(0,4):
    if pessoas[c][2].lower() == 'm':
        if pessoas[c][1] > velho:
            velho = pessoas[c][1]
            hv = c

print('O homem mais velho tem {} anos e se chama {}'.format(pessoas[hv][1], pessoas[hv][0]))

for c in range(0,4):
    if pessoas[c][2].lower() == 'f':
        if pessoas[c][1] < 20:
            fem20 += 1

print('Feminino - 20: {}'.format(fem20))