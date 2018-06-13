from time import sleep

from selenium.webdriver.common.keys import Keys
from features.element_map.ordem_compra_map import ordem_compra_map



class ordem_compra_page(ordem_compra_map):

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


    def clica_ordens_compra(self):
        sleep(3)
        super().btn_ordens_compra().click()
        sleep(5)

    def vizualiza_oc(self):
        sleep(4)
        super().btn_vizualizar().click()

    def vizualiza_oc2(self):
        sleep(4)
        super().btn_vizualizar2().click()

    def clica_editar(self):
        sleep(3)
        super().btn_editar().click()

    def clica_fechar_oc(self):
        sleep(3)
        super().btn_fechar_oc().click()
        sleep(4)
        super().btn_confirma_fechar().click()

    def buscar_situacao(self, situacao):
        sleep(3)
        super().busca_situacao().send_keys(situacao)
        sleep(2)
        super().busca_situacao().send_keys(Keys.ENTER)