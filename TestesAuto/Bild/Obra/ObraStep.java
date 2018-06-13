package bild.Obra;

import bild.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ObraStep {

	ObraPage pageObra = new ObraPage();

	@Given("acessei o menu Cadastros >> Obra")
	public void acessarMenuCadastroObra() throws InterruptedException {
		pageObra.acessarMenuCadastroObra();
		Utils.logPrint("Obra","Acessando a tela de Obras");
	}

	@And("cadastrar nova obra")
	public void cadastrarObra() throws InterruptedException {
		pageObra.cadastrarObra();
		Utils.logPrint("Obra","Clicando no botão Novo");
	}

	@When("na tela de Obra eu informo os dados da Obra")
	public void informarDadosDaObra() throws InterruptedException {
		pageObra.informarDadosDaObra();
		Utils.logPrint("Obra","Informando os dados da Obra");
	}

	@And("na tela de Obra eu clico em salvar")
	public void clicarEmSalvar() {
		pageObra.clicarEmSalvar();
		Utils.logPrint("Obra","Salvando a Obra");
	}

	@And("na tela de importar orcamento")
	public void acessarTelaDeImportarOrcamento() throws InterruptedException {
		pageObra.acessarTelaDeImportarOrcamento();
		Utils.logPrint("Obra","Acessa tela de Importação");
	}

	@And("seleciono a obra para importacao")
	public void selecionaObraParaImportacao() throws InterruptedException {
		pageObra.selecionaObraParaImportacao();
		Utils.logPrint("Obra","Seleciona a obra para importação");
	}

	@And("seleciono o arquivo de importacao")
	public void selecionarArquivoDeImportacao() throws InterruptedException {
		pageObra.selecionarArquivoDeImportacao();
		Utils.logPrint("Obra","Seleciona o arquivo para importação");
	}

	@And("clico em importacao orcamento")
	public void salvarImportacaoOrcamento() throws InterruptedException {
		pageObra.salvarImportacaoOrcamento();
		Utils.logPrint("Obra","Salva a importacao da Obra");
	}

	@And("acessar tela de Bild_Cronograma da Obra")
	public void acessarBildCronograma() throws InterruptedException {
		pageObra.acessarBildCronograma();
	}

	@And("selecionar a Obra para realizar o cronograma")
	public void selecionarObraCronograma() throws InterruptedException {
		pageObra.selecionarObraCronograma();
	}

	@And("selecioar o template do cronograma")
	public void selecionarTemplateCronograma() throws InterruptedException {
		pageObra.selecionarTemplateCronograma();
	}

	@And("selecionar o arquivo para importacao")
	public void selecionarArquivodDeImportacao() throws InterruptedException {
		pageObra.selecionarArquivodDeImportacao();
	}

	@And("acessar tela Cronograma da Obra e Relacionamento de orcamento")
	public void acessarCronogramaRelacionamentoOrcamento() throws InterruptedException {
		pageObra.acessarCronogramaRelacionamentoOrcamento();
	}

	@And("selecionar a Obra para fazer relacionamento")
	public void selecionarObraRelacionamento() throws InterruptedException {
		pageObra.selecionarObraRelacionamento();
	}

	@And("selecionar a tarefa da Obra")
	public void selecionarTarefaDaObra() throws InterruptedException {
		pageObra.selecionarTarefaDaObra();
	}

	@And("selecionar o grupo de insumos da obra")
	public void selecionarInsumosDaObra() throws InterruptedException {
		pageObra.selecionarInsumosDaObra();
	}

	@And("selecionar novo insumo da obra")
	public void selecionarNovaTarefa() throws InterruptedException {
		pageObra.selecionarNovaTarefa();
	}
	
	@And("relacionar obra a carteira")
	public void relacionarObraACarteira() throws InterruptedException {
		pageObra.relacionarObraCarteira();
	}
	
}
