frase = str(input('Insira uma frase: '))
frase = frase.strip()
frase = frase.lower()
print('A letra A aparece na frase {} vezes'.format(frase.count('a')))
print('A letra A aparece na frase pela 1º vez no {}º caracter '.format(frase.find('a')))
print('A letra A aparece na frase pela 1º vez no {}º caracter '.format(frase.rfind('a')))

