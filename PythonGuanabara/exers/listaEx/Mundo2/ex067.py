num = ctg = 0
while True:
    num = int(input('Insira um numero para fazer a tabuada ( negativo para parar): '))
    print('='*62)
    if num < 0 :
        break

    for c in range(0, 11, 1):
        print(f'{num:^4} X {c:^4} = {num*c :^5}')
    print('=' * 62)