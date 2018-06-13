num = soma = qt = 0

while True:
    num = int(input('Insira um numero(999 para parar de inserir): '))
    if num == 999:
        break
    soma += num
    qt += 1
print(f'Foram inseridos {qt} numeros\nA soma dos numeros inseridos é {soma}')