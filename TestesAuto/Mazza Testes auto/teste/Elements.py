from selenium import webdriver as driver


class buscar_carro_map(object):
    chromedriver = driver.Chrome()

    def input_search(self):
        return self.chromedriver.find_element_by_id('lst-ib')

    def btn_imagens(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="hdtb-msb-vis"]/div[2]/a')