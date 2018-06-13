package bild.Contrato;

import java.awt.AWTException;

import bild.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContratoSteps {

	ContratoPage page = new ContratoPage();

	@Given("acessar a tela de Contrato")
	public void acesarTelaDeContrato() throws InterruptedException {
		page.acesarTelaDeContrato();
		Utils.logPrint("Contrato", "acessar a tela de Contrato");
	}

	@And("selecionar a obra")
	public void selecionarContratoDaObra() {
		page.selecionarContratoDaObra();
		Utils.logPrint("Contrato", "selecionar a obra");
	}

	@When("eu clicar para visualizar o contrato da obra")
	public void visualizarContratoDaObra() throws InterruptedException {
		page.visualizarContratoDaObra();
		Utils.logPrint("Contrato", "eu clicar para visualizar o contrato da obra");
	}

	@And("aprovar o contrato da obra")
	public void aprovarContratoDaObra() throws InterruptedException, AWTException {
		page.aprovarContratoDaObra();
		Utils.logPrint("Contrato", "aprovar o contrato da obra");
	}

	@Then("selecionar o arquivo de contrato assinado")
	public void selecionarArquivo() throws InterruptedException {
		page.selecionarArquivo();
		Utils.logPrint("Contrato", "selecionar o arquivo de contrato assinado");
	}

	@And("clicar em enviar e liberar")
	public void clicarEnviarELiberar() {
		page.clicarEnviarELiberar();
		Utils.logPrint("Contrato", "clicar em enviar e liberar");
	}

	@And("clicar para baixar contrato completo")
	public void baixarContrato() throws InterruptedException {
		page.baixarContrato();
		Utils.logPrint("Contrato", "clicar para baixar contrato completo");
	}

	@And("clicar para baixar espelho do contrato")
	public void baixarEspelhoContrato() throws InterruptedException {
		page.baixarEspelhoContrato();
		Utils.logPrint("Contrato", "clicar para baixar espelho do contrato");
	}

	@And("clicar para baixar minuta assinada pelo fornecedor")
	public void baixarMinutaAssinada() throws InterruptedException {
		page.baixarMinutaAssinada();
		Utils.logPrint("Contrato", "clicar para baixar minuta assinada pelo fornecedor");
	}




	//Scenario: Reapropriar insumo =====================================================================================

	@Given ("entro na tela de Contrato para reapropriar")
	public void entrarTelaContratoParaReapropriar() throws InterruptedException {
        page.entrarTelaContratoParaReapropriar();
	}

	@And ("busco pelo contrato para reapropriar")
	public void buscarContratoParaReapropriar(){
        page.buscarContratoParaReapropriar();
	}

	@Then ("clico para visualizar o contrato para reapropriar")
	public void clicarVisualizarContratoParaReapropriar(){
        page.clicarVisualizarContratoParaReapropriar();
	}

	@And ("clico para reapropriar o insumo")
	public void clicarReapropriar(){
        page.clicarReapropriar();
	}

	@Then ("seleciono um item para reapropriar")
	public void selecionarItemParaReapropriar(){
        page.selecionarItemParaReapropriar();
	}

	@And ("informo o destino da reapropriacao")
	public void informarDestinoReapropriacao(){
        page.informarDestinoReapropriacao();
	}

	@And ("defino a quantidade")
	public void definirQuantidadeReapropriacao(){
        page.definirQuantidadeReapropriacao();
	}

	@Then ("clico em salvar a reapropriacao")
	public void clicarSalvarReapropriacao(){
        page.clicarSalvarReapropriacao();
	}

	@And ("clico para confirmar a reapropriacao")
	public void clicarConfirmarReapropriacao(){
        page.clicarConfirmarReapropriacao();
	}

	@Then ("entro nas reapropriacoes")
	public void entrarTelaReapropriacoesParaVerificar(){
        page.entrarTelaReapropriacoesParaVerificar();
	}

	@And ("verifico se a reapropriacao existe")
	public void verificarApropriacaoRecemCriada(){
        page.verificarApropriacaoRecemCriada();
	}

	@And ("verifico se o valor foi removido do item reapropriado")
	public void verificarSeValorReapropriadoFoiRemovido(){
        page.verificarSeValorReapropriadoFoiRemovido();
	}




	//Scenario: Distrato ===============================================================================================

	@Given ("entro na tela de Contrato para distratar")
	public void entrarTelaContratoParaDistrato() throws InterruptedException {
        page.entrarTelaContratoParaDistrato();
	}

	@And ("busco pelo contrato para distratar")
	public void buscarContratoParaDistrato(){
        page.buscarContratoParaDistrato();
	}

	@Then ("clico para visualizar o contrato para distratar")
	public void clicarVisualizarContratoParaDistrato(){
        page.clicarVisualizarContratoParaDistrato();
	}

	@And ("clico para fazer um distrato")
	public void clicarDistrato(){
        page.clicarDistrato();
	}

	@And ("insiro a quantidade para distratar a reapropriacao")
	public void inserirQuantidadeDistrato(){
        page.inserirQuantidadeDistrato();
    }

	@Then ("clico em salvar o distrato da reapropriacao")
    public void clicarSalvarDistrato(){
	    page.clicarSalvarDistrato();
    }

	@And ("clico para aprovar o distrato")
    public void clicarAprovarDistrato(){
        page.clicarAprovarDistrato();
    }

	@And ("confirmo a aprovacao do distrato")
    public void confirmarAprovacaoDistrato(){
        page.confirmarAprovacaoDistrato();
    }

	@And ("entro na tela de distrato")
    public void entrarTelaDistratoParaVerificar(){
        page.entrarTelaDistratoParaVerificar();
    }

	@Then ("verifico se o valor voltou para o item de origem da reapropriacao")
    public void verificarSeValorDistratradoVoltouParaItemOrigem(){
        page.verificarSeValorDistratradoVoltouParaItemOrigem();
    }




    //Scenario: Contrato reajuste ======================================================================================

    @Given ("entro na tela de Contrato para reajustar reapropriacao")
    public void entrarTelaContratoParaReajuste() throws InterruptedException {
        page.entrarTelaContratoParaReajuste();
    }

    @And ("busco pelo contrato para reajustar reapropriacao")
    public void buscarContratoParaReajuste(){
        page.buscarContratoParaReajuste();
    }

    @Then ("clico para visualizar o contrato para reajustar reapropriacao")
    public void clicarVisualizarContratoParaReajuste(){
        page.clicarVisualizarContratoParaReajuste();
    }

    @And ("clico para fazer um reajuste")
    public void clicarReajuste(){
        page.clicarReajuste();
    }

    @And ("insiro o valor a ser adicionado no item")
    public void inserirValorReajuste(){
        page.inserirValorReajuste();
    }

    @And ("clico em salvar o reajuste")
    public void clicarSalvarReajuste(){
        page.clicarSalvarReajuste();
    }

    @Then ("clico para aprovar o reajuste")
    public void clicarAprovarReajuste(){
        page.clicarAprovarReajuste();
    }

    @And ("entro na tela de reapropriacao")
    public void entrarTelaReapropriacaoParaVerificarReajuste(){
        page.entrarTelaReapropriacaoParaVerificarReajuste();
    }

    @Then ("verifico se o valor foi removido do item de origem e inserido no item destino")
    public void verificarSeValorReajustadoFoiRemovidoDoItemOrigem(){
        page.verificarSeValorReajustadoFoiRemovidoDoItemOrigem();
    }
}
