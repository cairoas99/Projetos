package bild.AbrirConcorrencia;

import bild.Obra.ObraPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AbrirConcorrenciaSteps {

	AbrirConcorrenciaPage page = new AbrirConcorrenciaPage();

	@Given("na tela de QC pesquisar pela obra para abrir concorrencia")
	public void pesquisarObraAbrirConcorrencia() throws InterruptedException {
		String nomeDaObra = ObraPage.getVariableYouWantToUse();
		page.pesquisarObraAbrirConcorrencia(nomeDaObra);
	}

	@And("na tela de QC informo o nome da obra e o status")
	public void informarObraEStatus() throws InterruptedException {
		page.informarObraEStatus();
	}

	@When("na tela de obra clicar no botao Abrir Concorrencia")
	public void clicarNoBotaoDeAbriConcorrencia() throws InterruptedException {
		page.clicarNoBotaoDeAbriConcorrencia();
	}

	@And("confirmo que quero iniciar a concorrencia")
	public void confirmarInicioConcorrencia() throws InterruptedException {
		page.confirmarInicioConcorrencia();
	}

	@And("confirmo novamente")
	public void confirmarOperacaoDeConcorrencia() throws InterruptedException {
		page.confirmarOperacaoDeConcorrencia();
	}

	@Then("na tela de QC clicar no botao Informar valores")
	public void clicarNoBotaoInformarValores() throws InterruptedException {
		page.clicarNoBotaoInformarValores();
	}

	@And("na tela de informar valores seleciono os fornecedores")
	public void informarFornecedores() throws InterruptedException {
		page.informarFornecedores();
	}

	@And("informo os valores unitario")
	public void informarValoresUnitario() throws InterruptedException {
		page.informarValoresUnitario();
	}

	@And("informo o tipo de frete")
	public void informarFrete() throws InterruptedException {
		page.informarFrete();
	}

	@And("informo os valores de porcentagem")
	public void informarPorcentagem() throws InterruptedException {
		page.informarPorcentagem();
	}

	@And("informo o tipo de nota")
	public void informarNota() throws InterruptedException {
		page.informarNota();
	}

	@And("afirmar que estou ciente")
	public void confirmarQueEstouCiente() throws InterruptedException {
		page.confirmarQueEstouCiente();
	}

	@And("informo a condicao de pagamento")
	public void infomarCondicaoDePagamento() throws InterruptedException {
		page.infomarCondicaoDePagamento();
	}

	@And("salvar abertura de quadro de concorrencia")
	public void salvarAbertuaDeQC() throws InterruptedException {
		page.salvarAbertuaDeQC();
	}

	@And("avaliar quadro de concorrencia")
	public void avaliarQC() throws InterruptedException {
		page.avaliarQC();
	}

	@And("informar vencedor ou nova rodada")
	public void informarVencedorOuNovaRodada() throws InterruptedException {
		page.informarVencedorOuNovaRodada();
	}

	@And("finalizar quadro de concorrencia")
	public void finalizarQC() throws InterruptedException {
		page.finalizarQC();
	}

	@And("informo as conficoes comerciais")
	public void informarCondicoesComerciais() throws InterruptedException {
		page.informarCondicoesComerciais();
	}

	@And("clico em gerar contrato deste fornecedor")
	public void gerarContratoFornecedor() throws InterruptedException {
		page.gerarContratoFornecedor();
	}
	
	@And("gerar imprimir contrato")
	public void imprimirContratoQC() {
		page.imprimirContratoQC();
	}

	@And("clicar em exibir contrato")
	public void exibirContrato() {
		page.exibirContrato();
	}

	@And("clicar em aprovar contrato do QC")
	public void aprovarContratoDoQC() {
		page.aprovarContratoDoQC();
	}

	@And("confirmar aprovacao do contrato do QC")
	public void confirarContratoDoQC() {
		page.confirarContratoDoQC();
	}
}
