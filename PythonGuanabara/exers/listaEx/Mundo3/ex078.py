valores = []
maior = menor = 0
for i in range(0, 5):
    valores.append(int(input(f'Insira um numero na posição {i}: ')))
    if i == 0:
        maior = menor = valores[0]
    else:
        if valores[i] > maior:
            maior = valores[i]
        if valores[i] < menor:
            menor = valores[i]


print('#' * 45)
print(f'Você digitou os valores: {valores}')

print(f'Maior valor inserido: {maior} nas posições: ', end='')
for i, v in enumerate(valores):
    if v == maior:
        print(f'{i}..')
print()

print(f'Menor valor inserido: {menor} nas posições ')