valores = list()

for i in range(0, 5):
    aux =(float(input('Insira um numero')))


    if  i == 0 or aux >= valores[-1]:
        valores.append(aux)
        print('Adicionado no final da lista')
    else:
        pos = 0
        while pos < len(valores):
            if aux <= valores[pos]:
                valores.insert(pos, aux)
                print(f'Adicionado na posição {pos}')
                break
            pos += 1

print(valores)