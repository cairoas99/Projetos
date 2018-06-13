package bild.Fornecedor;

import bild.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FornecedorSteps {

	FornecedorPage page = new FornecedorPage();

	@Given("acessar a tela de Fornecedor")
	public void acessarTelaFornecedor() throws InterruptedException {
		page.acessarTelaFornecedor();
		Utils.logPrint("Fornecedor","Acessando a tela de Fornecedor");
	}

	@And("clicar no botao Novo de Fornecedor")
	public void clicarBotaoNovoFornecedor() {
		page.clicarBotaoNovoFornecedor();
		Utils.logPrint("Fornecedor","Clicando no botão novo para criar um Fornecedor");
	}

	@When("na tela de cadastro Fornecedor informo os dados")
	public void informaDadosFornecedor() throws InterruptedException {
		page.informaDadosFornecedor();
		Utils.logPrint("Fornecedor","Informando os dados obrigatorios do Fornecedor");
	}

	@Then("clico no botao Salvar Fornecedor")
	public void salvarFornecedor() {
		page.salvarFornecedor();
		Utils.logPrint("Fornecedor","Salvando o Fornecedor");
	}
}
