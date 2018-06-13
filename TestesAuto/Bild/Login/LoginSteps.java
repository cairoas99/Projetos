package bild.Login;

import bild.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	LoginPage page = new LoginPage();

	@Given("Eu entro na pagina de login")
	public void efetuarLogin() {
		page.efetuarLogin();
		Utils.logPrint("Login","Realizando login no sistema");
	}

	@When("Envio o email e senha do usuario")
	public void entrarPaginaDeLogin(){
		page.enviarEmailESenha();
		Utils.logPrint("Login", "Enviar email e senha do usuário");
	}

	@Then("Eu devo estar logado")
	public void efetuarLogout() {
	}
}
