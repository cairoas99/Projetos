nome = baran = opc = ''
preco = mais = barav = total = 0

while True:
    nome = str(input('Insira o nome do produto: '))
    while True:
        preco = float(input('Insira o preço do produto R$: '))
        if preco > 0:
            break
    if total > 0:
        if preco < barav:
            baran = nome
            barav = preco
    else:
        barav = preco
        baran = nome

    if preco >1000:
        mais += 1
    total += preco

    nome = ''
    preco = 0

    while True:
        opc = str(input('Deseja continuar (s/n)? '))
        if opc.lower() == 's':
            break
        elif opc.lower() == 'n':
            break
    if opc.lower() == 'n':
        break

print(f'Total gasto R$: {total:.2f}\nCustam mais de R$:1000,00: {mais}\nProduto mais barato foi {baran}, custando R$: {barav:.2f}')