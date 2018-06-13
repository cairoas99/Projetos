d = float(input('insira a distancia da viagem em Km: '))
c = 0

print('Custo da viagem R$: {:.2f}'.format((d*.5)if d <= 200 else (d*.45)))