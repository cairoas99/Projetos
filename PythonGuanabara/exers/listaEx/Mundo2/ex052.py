num = int(input('Insira um numero: '))
a = ''

for c in range(2, num):
    if(num % c == 0):
        a = ('Não é primo')
if(a == ''):
    print('É primo')
else:
    print(a)