from selenium import webdriver as driver
from time import sleep

class login_map(object):
    chromedriver = driver.Chrome()

    def email_login(self):
        return self.chromedriver.find_element_by_id('email')

    def senha_login(self):
        return self.chromedriver.find_element_by_id('password')

    def btn_acessar(self):
        return self.chromedriver.find_element_by_id('btn-login')

