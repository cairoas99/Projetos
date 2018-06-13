#Pages.py, que são chamadas pela Step.py e manipulam o webdriver
from selenium.webdriver.common.keys import Keys
from time import sleep


from features.element_map.busca_map import busca_map


class busca_page(busca_map):

    def acessar_site(self, site):
        super().chromedriver.get(site)

    def chama_PopUp(self, texto):
        super().abre_PopUp(texto)

    def buscar(self, busca):
        super().buscar().send_keys(busca)
        sleep(2)
        super().buscar().send_keys(Keys.ENTER)

    def clicar_shopping(self):
        super().clicar_shopping().click()

    def grade(self):
        super().grade().click()

    def ordenar(self):
        super().ordenar().click()
        sleep(2)
