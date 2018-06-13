num = ctg = maior = menor = soma = 0
cont = ''

while cont.lower() != 'n':
    num = int(input('Insira um numero inteiro: '))
    soma += num
    if ctg == 0:
        maior = num
        menor = num
    else:
        if num >= maior:
            maior = num
        elif num <= menor:
            menor = num
    ctg += 1

    cont = str(input('Deseja continuar (s/n)? '))
print(f'Media: {soma:.2f}\nMaior: {maior}\nMenor: {menor}')