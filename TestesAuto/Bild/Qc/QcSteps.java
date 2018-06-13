package bild.Qc;

import bild.Obra.ObraPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QcSteps {

	QcPage pageQC = new QcPage();

	@Given("acesso o menu Suprimentos >> Q.C")
	public void acessarMenuSuprimentosQC() throws InterruptedException {
		String nomeDaObra = ObraPage.getVariableYouWantToUse();
		pageQC.acessarMenuSuprimentosQC(nomeDaObra);
	}

	@And("clico em criar novo quadro de concorrencia")
	public void criarQuadrodeConcorrencia() {
		pageQC.criarQuadrodeConcorrencia();
	}

	//@And("escolha a obra")
	//public void escolherObra() throws InterruptedException {
	//	pageQC.escolherObra();
	//}

	@When("na tela seleciono os insumos para criar o quadro de concorrencia")
	public void selecionarInsumos() throws InterruptedException {
		pageQC.selecionarInsumos();
	}

	@And("clico em criar q.c")
	public void clicarEmCriarQC() throws InterruptedException {
		pageQC.clicarEmCriarQC();
	}

	@And("seleciono os fornecedores")
	public void selecionarFornecedores() throws InterruptedException {
		pageQC.selecionarFornecedores();
	}

	@And("seleciono a equalizacao tecnica")
	public void selecionarEqualizacaoTecnica() throws InterruptedException {
		pageQC.selecionarEqualizacaoTecnica();
	}

	@And("seleciono o template de minuta")
	public void selecionarTemplateDeMinuta() throws InterruptedException {
		pageQC.selecionarTemplateDeMinuta();
	}

	@And("seleciono os insumos da QC")
	public void selecionarInsumosDaQC() throws InterruptedException {
		pageQC.selecionarInsumosDaQC();
	}

	@And("clico em salvar QC")
	public void clicarEmSalvar() throws InterruptedException {
		pageQC.clicarEmSalvar();
	}

	@Given("enviar para validacao")
	public void enviarParaValidacao() throws InterruptedException {
		pageQC.enviarParaValidacao();
	}

	@Then("aprovar Q.C concorrencia")
	public void aprovarQC() throws InterruptedException {
		pageQC.aprovarQC();
	}

	@And ("clico e confirmo para abrir concorrencia")
	public void clicarAbrirConcorrencia(){
		pageQC.clicarAbrirConcorrencia();
	}

	@And ("clico em Lancar Valores")
	public void clicarLancarValores(){
		pageQC.clicarLancarValores();
	}

	@Then ("seleciono o fornecedor, valor unitario, tipo de frete, porcentagens, tipo da NF, equalizacao tecnica, condicao de pagamento")
	public void inserirDadosQC(){
		pageQC.inserirDadosQC();
	}

	@And ("clico para salvar os valores do fornecedor")
	public void clicarSalvarValoresFornecedor(){
		pageQC.clicarSalvarValoresFornecedor();
	}

	@Then ("busco pela QC recem criada")
    public void buscarQcRecemCriada(){
        pageQC.buscarQcRecemCriada();
    }
	@And ("clico para avaliar a QC")
    public void avaliarQC(){
        pageQC.avaliarQC();
    }
	@And ("clico para informar vencedor")
    public void informarVencedor(){
        pageQC.informarVencedor();
    }
	@And ("clico para finalizar QC")
    public void finalizarQC(){
        pageQC.finalizarQC();
    }
	@And ("clico para confirmar a finalizacao de QC")
    public void confirmarFinalizacaoQC(){
        pageQC.confirmarFinalizacaoQC();
    }
	@And ("preencho os campos de condicoes comerciais")
    public void preencherCondicoesComerciais(){
        pageQC.preencherCondicoesComerciais();
    }
	@And ("clico para gerar contrato")
    public void gerarContrato(){
        pageQC.gerarContrato();
    }
	@And ("verifico se o contrato foi gerado")
    public void verificarContratoGerado(){
        pageQC.verificarContratoGerado();
    }

    @Then ("clico para visualizar a minuta de contrato")
    public void clicarVisualizarMinutaContrato(){
        pageQC.clicarVisualizarMinutaContrato();
    }

    @And ("clico para aprovar a minuta")
    public void clicarAprovarMinuta(){
        pageQC.clicarAprovarMinuta();
    }

}
