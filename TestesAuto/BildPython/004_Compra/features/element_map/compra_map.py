from selenium import webdriver as driver
from time import sleep

class compra_map(object):
    chromedriver = driver.Chrome()

    def email_login(self):
        return self.chromedriver.find_element_by_id('email')

    def senha_login(self):
        return self.chromedriver.find_element_by_id('password')

    def btn_acessar(self):
        return self.chromedriver.find_element_by_id('btn-login')

    def btn_home(self):
        return self.chromedriver.find_element_by_class_name('navbar-app-name')

    def btn_menu(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/header/button')

    def btn_compras(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="sidebar-wrapper"]/section/ul/li[3]/a')

    def btn_calendario(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="sidebar-wrapper"]/section/ul/li[3]/ul/li[1]/a/i')

    def seleciona_obra(self):
        return self.chromedriver.find_element_by_id('select2-select_obra-container')

    def input_obra(self):
        return self.chromedriver.find_element_by_class_name('select2-search__field')

    def btn_comprar(self):
        return self.chromedriver.find_element_by_id('btn-comprar-calendario')

    def btn_comprar_saldo(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div[9]/button')

    def btn_fechar_oc(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/div/section/div/button[1]')

    def btn_confirma(self):
        return self.chromedriver.find_element_by_class_name('confirm')