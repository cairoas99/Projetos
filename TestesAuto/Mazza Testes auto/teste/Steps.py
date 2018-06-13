from behave import Given, step, then

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