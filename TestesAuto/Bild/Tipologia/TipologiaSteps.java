package bild.Tipologia;

import bild.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TipologiaSteps {

	TipologiaPage pageTipologia = new TipologiaPage();

	@Given("acessei o menu Administrativo >> Tipologia")
	public void acessarMenuAdministrativoTipologia() throws InterruptedException {
		pageTipologia.acessarMenuAdministrativoTipologia();
		Utils.logPrint("Tipologia","Acessar a tela de Topologia");
	}

	@When("na tela de Tipologia informos os dados da Tipologia")
	public void informarDadosDaTipologia() throws InterruptedException {
		pageTipologia.informarDadosDaTipologia();
		Utils.logPrint("Tipologia","Informando os dados da Tipologia");
	}

	@And("na tela de Tipologia clico em Salvar")
	public void clicoEmSalvar() {
		pageTipologia.clicoEmSalvar();
		Utils.logPrint("Tipologia","Salvando a Tipologia");
	}

	/*
	 * @Then("na tela de Tipologia lista validar mensagem de sucesso") public void
	 * validarMensagemDeSucesso() { boolean blnExibiuMensagemDeSucesso =
	 * pageTipologia.validarMensagemDeSucesso(); if (blnExibiuMensagemDeSucesso) {
	 * Utils.logPass("Tipologia cadastrada com sucesso"); } else {
	 * Utils.logFail("Erro ao cadastrar Tipologia"); }
	 * 
	 * Assert.assertTrue("Não exibiu a mensagem de sucesso",
	 * blnExibiuMensagemDeSucesso); }
	 */

}
