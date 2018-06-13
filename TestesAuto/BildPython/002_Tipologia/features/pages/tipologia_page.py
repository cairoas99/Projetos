from time import sleep

from features.element_map.tipologia_map import tipologia_map


class tipologia_page(tipologia_map):

    def full(self):
        super().chromedriver.maximize_window()

    def fecha(self):
        sleep(5)
        super().chromedriver.back()
        sleep(5)
        super().chromedriver.close()

    def acessar_site(self, site):
        super().chromedriver.get(site)

    def logar(self, email, senha):
        super().email_login().send_keys(email)
        sleep(1)
        super().senha_login().send_keys(senha)
        sleep(1)
        super().btn_acessar().click()

    def acessa_administrativo(self):
        super().btn_perfil().click()
        sleep(1)
        super().btn_administrativo().click()

    def acessa_tipologia(self):
        super().btn_BildDoc().click()
        sleep(2)
        super().btn_tiposQC().click()

    def adicionar(self, nome):
        super().btn_adicionar().click()
        sleep(2)
        super().nome_tipologia().send_keys(nome)
        sleep(2)
        super().btn_salva_tipologia().click()