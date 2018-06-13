from behave import *
from time import sleep

from ..pages.obra_page import obra_page


obra_page = obra_page()

@Given ('Acesso o site "{site}"')
def acessar_site(context, site):
	obra_page.acessar_site(site)

@When ('Realizo login com email "{email}" e senha "{senha}"')
def logar(context, email, senha):
	obra_page.logar(email, senha)

@Then ('vou para home')
def home(context):
	obra_page.home()

@Given('acessar o menu Compra >> Ordens de Compra')
def acessa_menu_compras(context):
	obra_page.acessa_menu_compras()

@Then('acesso calendario')
def acessa_calendario(context):
	obra_page.acessa_calendario()

@Then('na tela calendario clico em ordens de compra')
def clicar_comprar(context):
	obra_page.clica_ordens_compra()

@Then('na tela de Ordens de Compra eu clico para visualizar O.C')
def vizualiza_oc(context):
	obra_page.vizualiza_oc()

@Then('vizualizando oc clico em editar')
def edita_oc(context):
	obra_page.clica_editar()

@Then('na tela de Detalhe eu clico em Fechar O.C e confirmo')
def clica_fechar_oc(context):
	obra_page.clica_fechar_oc()

@Then('volto para calendario')
def volta_calendario(context):
	obra_page.home()
	obra_page.acessa_menu_compras()
	obra_page.acessa_calendario()
	obra_page.clica_ordens_compra()

@Then('busco pela situacao "{situacao}"')
def buscar_situacao(context, situacao):
	obra_page.buscar_situacao(situacao)

@Then('na tela de Ordens de Compra eu clico para visualizar O.C2')
def vizualiza_oc(context):
	obra_page.vizualiza_oc2()