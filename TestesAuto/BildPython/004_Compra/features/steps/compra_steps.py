from behave import *
from time import sleep

from ..pages.compra_page import compra_page


compra_page = compra_page()

@Given ('Acesso o site "{site}"')
def acessar_site(context, site):
	compra_page.acessar_site(site)

@When ('Realizo login com email "{email}" e senha "{senha}"')
def logar(context, email, senha):
	compra_page.logar(email, senha)

@Then ('vou para home')
def home(context):
	compra_page.home()

@Then('acessei o menu Compras >> Calendario de Compras')
def acessa_menu_compras(context):
	compra_page.acessa_menu_compras()

@Then('acesso calendario')
def acessa_calendario(context):
	compra_page.acessa_calendario()

@Then('na tela de Comprar Insumos seleciono a obra "{obra}"')
def seleciono_obra(context, obra):
	compra_page.seleciona_obra(obra)

@Then('na tela de Comprar Insumos clico em comprar')
def clicar_comprar(context):
	compra_page.clica_comprar()

@Then('na tela de insumos clico em comprar saldo de todos insumos')
def comprar_saldo(context):
	compra_page.comprar_saldo()

@Then('na tela de oc clico em fechar oc')
def fechar_oc(context):
	compra_page.fechar_oc()

@Then('no PopUp de confirmação clico em sim')
def confirmar(context):
	compra_page.confirma()