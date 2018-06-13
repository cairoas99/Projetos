from time import sleep


from features.element_map.login_map import login_map


class login_page(login_map):

    def acessar_site(self, site):
        super().chromedriver.get(site)

    def logar(self, email, senha):
        super().email_login().send_keys(email)
        sleep(1)
        super().senha_login().send_keys(senha)
        sleep(1)
        super().btn_acessar().click()