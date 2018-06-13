from selenium import webdriver as driver
from time import sleep

class tipologia_map(object):
    chromedriver = driver.Chrome()

    def email_login(self):
        return self.chromedriver.find_element_by_id('email')

    def senha_login(self):
        return self.chromedriver.find_element_by_id('password')

    def btn_acessar(self):
        return self.chromedriver.find_element_by_id('btn-login')

    def btn_perfil(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/header/nav/div/ul/li[2]/a')

    def btn_administrativo(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/header/nav/div/ul/li[2]/ul/li[2]/div[1]/a')

    def btn_BildDoc(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="sidebar-wrapper"]/section/ul/li[1]/a')

    def btn_tiposQC(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="sidebar-wrapper"]/section/ul/li[1]/ul/li[3]/a')

    def btn_adicionar(self):
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/div[3]/section/a')

    def nome_tipologia(self):
        return self.chromedriver.find_element_by_id('nome')

    def btn_salva_tipologia(self):
        # return self.chromedriver.find_element_by_class_name('btn btn-success pull-right flat btn-save-tipologia')
        return self.chromedriver.find_element_by_xpath('/html/body/div[1]/div[3]/div/div/div/div/form/div[2]/button')