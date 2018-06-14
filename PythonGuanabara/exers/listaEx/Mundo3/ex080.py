valores = list()

for i in range(0, 5):
    aux =(float(input('Insira um numero')))
    if i == 0:
        valores.append(aux)
    else:
        if aux <= valores[0]:
            valores.insert(0, aux)
        elif aux >= valores[len(valores)-1]:
            valores.append(aux)
        elif valores[0] < aux < valores[len(valores)-1]:
            if i == 2:
                valores.insert(1, aux)
            else:
                valores.insert((len(valores)-2), aux)


print(valores)