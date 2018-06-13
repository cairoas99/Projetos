#Steps.py, que recebem a feature do Behave
from behave import Given, step, then
from time import sleep

from features.pages.busca_page import busca_page


busca_page = busca_page()

@Given ('acesso o site "{site}"')
def acessar_site(context, site):
    busca_page.acessar_site(site)


@step ('busco por "{produto}"')
def buscar_produto(context, produto):
    busca_page.buscar_produto(produto)

@then ('filtro por frete gratis')
def filtra_frete(context):
    busca_page.filtra_frete()

@then ('pego a quantidade de resultados')
def qt_result(context):
    quantidade = busca_page.qt_result()
    busca_page.chama_PopUp(quantidade)

@then ('clico em um produto')
def clica_produto(context):
    busca_page.clica_produto()
    sleep(2)

@then ('mando para o carrinho')
def manda_carrinho(context):
    busca_page.manda_carrinho()

@then ('calculo o frete "{cep}"')
def calcula_frete(context, cep):
    busca_page.calcula_frete(cep)

@then ('remove o produto')
def remove_produto(context):
    busca_page.remove_produto()

@then ('retorno para o inicio')
def retornar(context):
    busca_page.retornar()

@then ('clica para cadastrar')
def clica_cadastrar(context):
    busca_page.clica_cadastrar()

@then ('cadastro nome: "{nome}" email: "{email}" senha: "{senha}"')
def cadastro(context, nome, email, senha):
    busca_page.cadastro(nome, email, senha)

@then ('abro aba do perfil')
def perfil(context):
    busca_page.perfil()

@then ('clico para logar com email:"{email}" senha: "{senha}"')
def logar(context, email, senha):
    busca_page.login()
    sleep(0.5)
    busca_page.logar(email, senha)

@then ('clico em minha conta')
def minha_conta(context):
    busca_page.minha_conta()

@then ('procuro "{busca}"')
def procura(context, busca):
    busca_page.procura(busca)