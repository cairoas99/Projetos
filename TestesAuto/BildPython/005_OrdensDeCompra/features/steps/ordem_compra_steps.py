from behave import *
from time import sleep

from features.pages.ordem_compra_page import ordem_compra_page


ordem_compra_page = ordem_compra_page()

@Given ('Acesso o site "{site}"')
def acessar_site(context, site):
	ordem_compra_page.acessar_site(site)

@When ('Realizo login com email "{email}" e senha "{senha}"')
def logar(context, email, senha):
	ordem_compra_page.logar(email, senha)

@Then ('vou para home')
def home(context):
	ordem_compra_page.home()

@Given('acessar o menu Compra >> Ordens de Compra')
def acessa_menu_compras(context):
	ordem_compra_page.acessa_menu_compras()

@Then('acesso calendario')
def acessa_calendario(context):
	ordem_compra_page.acessa_calendario()

@Then('na tela calendario clico em ordens de compra')
def clicar_comprar(context):
	ordem_compra_page.clica_ordens_compra()

@Then('na tela de Ordens de Compra eu clico para visualizar O.C')
def vizualiza_oc(context):
	ordem_compra_page.vizualiza_oc()

@Then('vizualizando oc clico em editar')
def edita_oc(context):
	ordem_compra_page.clica_editar()

@Then('na tela de Detalhe eu clico em Fechar O.C e confirmo')
def clica_fechar_oc(context):
	ordem_compra_page.clica_fechar_oc()

@Then('volto para calendario')
def volta_calendario(context):
	ordem_compra_page.home()
	ordem_compra_page.acessa_menu_compras()
	ordem_compra_page.acessa_calendario()
	ordem_compra_page.clica_ordens_compra()

@Then('busco pela situacao "{situacao}"')
def buscar_situacao(context, situacao):
	ordem_compra_page.buscar_situacao(situacao)

@Then('na tela de Ordens de Compra eu clico para visualizar O.C2')
def vizualiza_oc(context):
	ordem_compra_page.vizualiza_oc2()