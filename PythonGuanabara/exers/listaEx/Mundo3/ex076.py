listagem = ('Lapis', 1,
            'Borracha', 1.5,
            'Caneta', 2.1,
            'Post IT', 3.5)
print('-'*32)
print(f'{"Listagem de preços" :^32}')
for c in range(0 , len(listagem)-1, 2):
    print(f'{listagem[c]:.<25}R$:{listagem[c+1]:<6.2f}')