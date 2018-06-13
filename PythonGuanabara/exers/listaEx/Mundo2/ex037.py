num = int(input('Insira um numero: '))
print('#*'*4+'MENU'+'*#'*4)
print('# 1 - Binario      #')
print('# 2 - Octal        #')
print('# 3 - Hexadecimal  #')
opc = int(input('####################\n\nInsira a opção: '))

if opc == 1:
    print(bin(num)[2:])
elif opc == 2:
    print(oct(num)[2:])
elif opc == 3:
    print(hex(num)[2:])
else:
    print('Opção invalida')