from behave import Given, step, then
from time import sleep

from features.pages.busca_page import busca_page

page = busca_page()

@Given ('acesso o site "{site}"')
def acessar_site(context, site):
    page.acessar_site(site)


@step ('busco por "{busca}"')
def buscar(context, busca):
    page.buscar(busca)


@then ('clico em shopping')
def clicar_shopping(context):
    page.clicar_shopping()

@then ('mostro em formato de grade')
def grade(context):
    page.grade()