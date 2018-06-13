casa = float(input('Valor da casa R$: '))
sala = float(input('Salario R$: '))
anos = float(input('Quantoss anos: '))

qtpar = int(anos * 12)
pmin = sala * .3
vlpar = casa / qtpar

if vlpar > pmin:
    print('\033[1;31mEmprestimo negado\no valor das parcelas({} de R$: {:.2f}) excede 30% do salario\033[m'.format(qtpar, vlpar))
else:
    print('\033[1;36mEmprestimo aprovado\nSerão {} parcelas no valor de R$: {:.2f}\033[m'.format(qtpar, vlpar))