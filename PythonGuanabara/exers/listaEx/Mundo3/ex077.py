palavras = ('casa', 'carro', 'computador', 'garrafa', 'celular', 'porta')


v = ''
for p in palavras:
    for l in p:
        if l == 'a' or l == 'e' or l == 'i' or l == 'o' or l == 'u':
            v = v + ' ' + l
    print(f'A palavra {p} tem as vogais:{v}')
    v = ''