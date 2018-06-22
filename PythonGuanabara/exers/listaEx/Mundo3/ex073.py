bras =('Flamengo','Cruzeiro','Grêmio','São Paulo','Internacional','Sport','Palmeiras','Corinthians','Fluminense',
    'Atlético-MG','América-MG','Botafogo','Vasco','Chapecoense','Santos','Atlético-PR','Vitória','Bahia','Paraná','Ceará')

print(f'{"MENU":^20}')

print('*#'*10)
print('A - 5 primeiros')
for c in range(0,4):
    print(f'{c+1}º - {bras[c]}')
#print(bras[:6])

print('*#'*10)
print('B - Ultimos quatro')
for c in range(-4, 0):
    print(f'{bras.index(bras[c])+1}º - {bras[c]}')
#print(bras[-4:])

print('*#'*10)
print('C - Ordem alfabetica')
for c in range(0, len(bras)):
    print(f'{c+1}º - {sorted(bras)[c]}')
#print(sorted(bras))

print('*#'*10)
print('D - colocação da Chapecoense')
print(f'{bras.index("Chapecoense") + 1}ª')

