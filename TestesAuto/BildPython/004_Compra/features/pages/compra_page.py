from time import sleep

from selenium.webdriver.common.keys import Keys
from ..element_map.compra_map import compra_map



class compra_page(compra_map):

    def acessar_site(self, site):
        super().chromedriver.get(site)

    def logar(self, email, senha):
        super().email_login().send_keys(email)
        sleep(1)
        super().senha_login().send_keys(senha)
        sleep(1)
        super().btn_acessar().click()

    def home(self):
        super().btn_home().click()
        sleep(2)

    def acessa_menu_compras(self):
        super().btn_menu().click()
        sleep(1)
        super().btn_compras().click()

    def acessa_calendario(self):
        sleep(2)
        super().btn_calendario().click()

    def seleciona_obra(self, obra):
        sleep(2)
        super().seleciona_obra().click()
        sleep(1)
        super().input_obra().send_keys(obra)
        sleep(2)
        super().input_obra().send_keys(Keys.ENTER)
        sleep(5)

    def clica_comprar(self):
        super().btn_comprar().click()
        sleep(5)

    def comprar_saldo(self):
        sleep(5)
        super().btn_comprar_saldo().click()

    def fechar_oc(self):
        sleep(5)
        super().btn_fechar_oc().click()

    def confirma(self):
        sleep(5)
        super().btn_confirma().click()