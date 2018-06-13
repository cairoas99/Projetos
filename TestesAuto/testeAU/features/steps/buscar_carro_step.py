#Steps.py, que recebem a feature do Behave
from behave import Given, step, then
from time import sleep

from features.pages.buscar_carro_page import buscar_carro_page


buscar_carro_page = buscar_carro_page()

@Given ('acesso o site de buscas "{site_buscas}"')
def acessar_site_busca(context, site_buscas):
    buscar_carro_page.acessar_site_busca(site_buscas)

@step ('busco pelo modelo "{modelo_carro}" de carro')
def buscar_modelo_carro(context, modelo_carro):
    buscar_carro_page.buscar_modelo_carro(modelo_carro)


@then("clico para ver as imagens do carro")
def acessar_imagens_carro(context):
    buscar_carro_page.acessar_imagens_carro()

@then("clico na primeira imagem")
def abrir_1a_imagem(context):
    buscar_carro_page.abrir_1a_imagem()

@then("abro o link da imagem")
def clicar_link(context):
    sleep(5)
    buscar_carro_page.clicar_link()