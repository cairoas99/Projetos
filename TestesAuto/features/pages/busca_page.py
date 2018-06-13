#Pages.py, que são chamadas pela Step.py e manipulam o webdriver
from selenium.webdriver.common.keys import Keys
from time import sleep

from features.element_map.busca_map import busca_map


class busca_page(busca_map):

    def acessar_site(self, site):
        super().chromedriver.get(site)

    def buscar_produto(self, produto):
        super().input_search().send_keys(produto)
        super().input_search().send_keys(Keys.ENTER)

    def filtra_frete(self):
        super().filtra_frete().click()

    def qt_result(self):
        texto = super().qt_result()
        numero = texto.split()
        print(texto)
        return numero[0]

    def clica_produto(self):
        super().clica_produto().click()

    def manda_carrinho(self):
        super().manda_carrinho().click()

    def calcula_frete(self, cep):
        super().input_cep().send_keys(cep)
        super().input_cep().send_keys(Keys.ENTER)

    def remove_produto(self):
        super().remove_produto().click()

    def retornar(self):
        super().retornar().click()

    def clica_cadastrar(self):
        super().clica_cadastrar().click()

    def cadastro(self, nome, email, senha):
        super().input_nome().send_keys(nome)
        super().input_email().send_keys(email)
        super().input_cemail().send_keys(email)
        super().input_senha().send_keys(senha)
        super().clicar_fim().click()

    