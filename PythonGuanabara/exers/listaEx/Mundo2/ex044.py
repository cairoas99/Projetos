prod = float(input('Valor do produto R$: '))

print('####### FORMAS DE PAGAMENTO #######')
print('# 1 - A vista Dinheiro ou Cheque) #')
print('# 2 - A vista Cartão              #')
print('# 3 - Ate 2X no Cartão            #')
print('# 4 - 3X ou mais no Cartão        #')
print('###################################\n')

opc = int(input('Escolha a forma de pagamento: '))

if opc == 1:
    print('Valor a pagar R$: {:.2f}'.format(prod * .9))
elif opc == 2:
    print('Valor a pagar R$: {:.2f}'.format(prod * .95))
elif opc == 3:
    print('Valor a pagar R$: {:.2f}'.format(prod))
elif opc == 4:
    print('Valor a pagar R$: {:.2f}'.format(prod * 1.2))
else:
    print('Opção invalida')