expre = str(input('Insira a expressão: '))
pilha = []

for a in expre:
    if a in '(':
        pilha.append(a)
    elif a in ')':
        if len(pilha) > 0:
            pilha.pop()
        else:
            pilha.append(a)
            break

if len(pilha) == 0:
    print('Expressão correta')
else:
    print('Expressão incorreta')