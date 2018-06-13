from selenium import webdriver as driver
from time import sleep

class obra_map(object):
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

    def btn_ordens_compra(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/div/div/div/div/div[1]/div[2]/div/div[2]/a')
        #return self.chromedriver.find_element_by_id('btn btn-primary btn-block btn-ordens-compra')

    def btn_vizualizar(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="dataTableBuilder"]/tbody/tr[4]/td[7]/a[2]')

    def btn_vizualizar2(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="dataTableBuilder"]/tbody/tr[9]/td[7]/a')

    def btn_editar(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/div[1]/section/div/a[2]')

    def btn_fechar_oc(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/div/section/div/button[1]')

    def btn_confirma_fechar(self):
        return self.chromedriver.find_element_by_class_name('confirm')

    def busca_situacao(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="dataTableBuilder"]/tfoot/tr/th[5]/input')