#Element Mapper
from selenium import webdriver as driver


class buscar_carro_map(object):
    chromedriver = driver.Chrome()

    def input_search(self):
        return self.chromedriver.find_element_by_id('lst-ib')

    def btn_imagens(self):
        #return self.chromedriver.find_element_by_xpath('//*[@id="hdtb-msb-vis"]/div[2]/a')
        return self.chromedriver.find_element_by_xpath('//*[@id="hdtb-msb-vis"]/div[3]/a')
        #return self.chromedriver.find_element_by_xpath('//*[@id="hdtb-msb-vis"]/div[4]/a')
    
    

    def img_1a_img(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="rg_s"]/div[1]/a/div[1]')

    def clicar_link(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="irc_cb"]')