from selenium.webdriver.common.keys import Keys

from features.element_map.buscar_carro_map import buscar_carro_map


class buscar_carro_page(buscar_carro_map):

    def acessar_site_busca(self, site_buscas):
        super().chromedriver.get(site_buscas)

    def buscar_modelo_carro(self, modelo_carro):
        super().input_search().send_keys(modelo_carro)
        super().input_search().send_keys(Keys.ENTER)

    def acessar_imagens_carro(self):
        super().btn_imagens().click()