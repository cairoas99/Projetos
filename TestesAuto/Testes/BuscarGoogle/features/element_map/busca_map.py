#Element Mapper
from selenium import webdriver as driver
from random import randrange
from time import sleep
from selenium.webdriver import ActionChains

class busca_map(object):
    chromedriver = driver.Chrome()

    def abre_PopUp(self, texto):
        self.chromedriver.execute_script(f"window.alert('{texto}');")
        sleep(5)
        alert = self.chromedriver.switch_to_alert()
        alert.accept()

    def buscar(self):
        return self.chromedriver.find_element_by_id('lst-ib')

    def clicar_shopping(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="hdtb-msb-vis"]/div[2]/a')

    def grade(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="taw"]/div[1]/div/div/a/span')

    def ordenar(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="taw"]/div[1]/div/div/div[1]/g-dropdown-menu/g-popup/div[1]/div/span')
