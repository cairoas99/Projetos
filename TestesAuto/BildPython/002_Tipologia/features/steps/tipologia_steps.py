from behave import *
from time import sleep

from features.pages.tipologia_page import tipologia_page


tipologia_page = tipologia_page()

@Given ('Acesso o site "{site}"')
def acessar_site(context, site):
    tipologia_page.acessar_site(site)

@When ('Realizo login com email "{email}" e senha "{senha}"')
def logar(context, email, senha):
	tipologia_page.logar(email, senha)

@Then("acessei o menu Administrativo")
def acessa_administrativo(context):
	tipologia_page.acessa_administrativo()

@Then("acesso tela de tipologia")
def acessa_tipologia(context):
	tipologia_page.acessa_tipologia()

@Then('adiciono tipologia "{nome}"')
def adicionat_tipologia(context, nome):
	tipologia_page.adicionar(nome)

@Then('coloco em full')
def full(context):
	tipologia_page.full()

@Then('fecho a janela')
def fecha(context):
	tipologia_page.fecha()