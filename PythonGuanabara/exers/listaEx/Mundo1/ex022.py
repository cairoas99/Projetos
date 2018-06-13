nome = str(input('Digite seu nome completo: '))
print("""Seu nome em maiuscula é: {}
Seu nome em minusculas é: {}
Seu nome ao todo te {} letras
Seu 1º nome é {} e tem {} letras""".format(nome.upper(), nome.lower(), len(nome) - nome.count(' '), nome.split()[0], len(nome.split()[0])))
