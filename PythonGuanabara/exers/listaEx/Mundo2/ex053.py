frase = str(input('Insira a frase (sem acentos): '))
frase =  frase.lower()
teste = frase.split()
teste2 = ''
print(teste)
for c in range(0, len(teste), 1):
    teste2 = (teste2 +''+ teste[c])
print(teste2)
teste3 = ''
for c in range(len(teste2)-1, -1, -1):
    teste3 = teste3 +''+ teste2[c]
print(teste3)

if teste3 == teste2:
    print('É Palindromo')
else:
    print('Não é palindromo')