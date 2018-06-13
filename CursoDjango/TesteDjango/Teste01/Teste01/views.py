from django.http import HttpResponse
from django.shortcuts import render
import datetime

def home(request):
    now = datetime.datetime.now()
    html = "<html><body>It is now %s.</body></html>" % now
    return HttpResponse(html)

def hello(request):
    return render(request, 'index.html')

def article(request, year):
    return HttpResponse(f'O ano digitado foi: {year}')

def soma(request,v1, v2):
    return HttpResponse(f'a soma dos valores {v1} e {v2} é: {v1 + v2}')

def lerDoBanco(nome):
    lista_nomes = [
        {'nome': 'Ana', 'idade': 20},
        {'nome': 'Pedro', 'idade': 25},
        {'nome': 'Joaquim', 'idade': 27}
    ]

    print('lista_nomes: '+ str(lista_nomes))

    for pessoa in lista_nomes:
        if pessoa['nome'] == nome:
            return pessoa
    else:
        print(pessoa)
        print(nome + ' - - ' + pessoa['nome'])
        return {'nome': 'não encontrado', 'idade': 0}

def fname(request, nome):
    result = lerDoBanco(nome)
    print(result)
    if result['idade'] > 0:
        return HttpResponse(f'A pessoa foi encontrada, ela tem ' + str(result['idade'])+' anos')
    else:
        return HttpResponse('Pessoa não encontrada')

def fname2(request, nome):
    idade = lerDoBanco(nome)['idade']
    return render(request, 'pessoa.html', {'v_idade': idade})