#Element Mapper
from selenium import webdriver as driver
from random import randrange
from time import sleep
from selenium.webdriver import ActionChains

class busca_map(object):
    chromedriver = driver.Chrome()

    def input_search(self):
        return self.chromedriver.find_element_by_id('search-query')

    def filtra_sel(self):
        return self.chromedriver.find_element_by_id('search-filter')

    def filtra_todos(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="search-filter"]/option[1]')

    def filtra_frete(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="search-filter"]/option[2]')
    
    def qt_result(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/div/h4').text
        
    def clica_produto(self):
        prod = randrange(1, 40, 1)
        return self.chromedriver.find_element_by_xpath(f'//*[@id="wrapper"]/section/section/span/ul/li[{2}]/figure/span/a')

    def manda_carrinho(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section[2]/section/article[3]/div/section')
    
    def input_cep(self):
        return self.chromedriver.find_element_by_id('zipcode')

    def remove_produto(self):
        return self.chromedriver.find_element_by_xpath("//input[@value='Remover']")

    def retornar(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/article/a')

    def clica_cadastrar(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/header/nav/ul/li[2]/ul/li[3]/a[1]')

    def input_nome(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/label[1]/input')
    
    def input_email(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/label[2]/input')

    def input_cemail(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/label[3]/input')
    
    def input_senha(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/label[4]/input')
    
    def clicar_fim(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/input[4]')
    
    def perfil(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/header/nav/ul/li[2]/ul/li[3]/label/span')
    
    def login(self):
        return self.chromedriver.find_element_by_id('login-link')

    def login_email(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/label[1]/input')

    def login_senha(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/label[2]/input')

    def fim_login(self):
        return  self.chromedriver.find_element_by_xpath('//*[@id="wrapper"]/section/section/form/input[4]')

    def minha_conta(self):
        return  self.chromedriver.find_element_by_xpath('//*[@id="user-profile-menu"]/li[1]/a')

    def abre_PopUp(self, texto):
        self.chromedriver.execute_script(f"window.alert('{texto}');")
        sleep(5)
        alert = self.chromedriver.switch_to_alert()
        alert.accept()

    def procura(self, busca):

        while True:
            if(self.chromedriver.find_element_by_class_name('link-product ellipsis').text == busca):
                self.chromedriver.execute_script(f"window.alert('Produto encontrado');")
                sleep(5)
                alert = self.chromedriver.switch_to_alert()
                alert.accept()
                break
            else:
                break