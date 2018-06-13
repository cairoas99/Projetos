from behave import *

from ..pages.login_page import login_page

login_page = login_page()

@Given ('Acesso o site "{site}"')
def acessar_site(context, site):
    login_page.acessar_site(site)

@When ('Realizo login com email "{email}" e senha "{senha}"')
def logar(context, email, senha):
    login_page.logar(email, senha)