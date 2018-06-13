package bild.OrdensDeCompra;

import bild.Utils;
import bild.Obra.ObraPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OrdensDeCompraSteps {

	OrdensDeCompraPage pageOrdensDeCompra = new OrdensDeCompraPage();

	@Given("acessar o menu Compra >> Ordens de Compra")
	public void acessarMenuCompraOrdensDeCompra() throws InterruptedException  {
		String nomeDaObra = ObraPage.getVariableYouWantToUse();
		pageOrdensDeCompra.acessarMenuCompraOrdensDeCompra(nomeDaObra);
		Utils.logPrint("Ordens De Compra","acessar o menu Compra");
	}

	@And("na tela de Ordens de Compra eu pesquiso pela Obra")
	public void pesquisarObraEmAberto() throws InterruptedException  {
		pageOrdensDeCompra.pesquisarObraEmAberto();
		Utils.logPrint("Ordens De Compra","na tela de Ordens de Compra eu pesquiso pela Obra");
	}

	@And("na tela de Ordens de Compra eu clico para visualizar O.C")
	public void visualizarOCEmAberto() throws InterruptedException  {
		pageOrdensDeCompra.visualizarOCEmAberto();
		Utils.logPrint("Ordens De Compra","na tela de Ordens de Compra eu clico para visualizar O.C");
	}

	@When("na tela de Detalhe eu clico em Fechar O.C")
	public void clicarEmFecharOC() throws InterruptedException  {
		pageOrdensDeCompra.clicarEmFecharOC();
		Utils.logPrint("Ordens De Compra","na tela de Detalhe eu clico em Aprovar");
	}

	@And("confirmo a operacao")
	public void confirmarOperacaoDeFecharOC() throws InterruptedException {
		pageOrdensDeCompra.confirmarOperacaoDeFecharOC();
		Utils.logPrint("Ordens De Compra","confirmar a operacao");
	}

	@Given("Ordens de Compra em aprovacao")
	public void acessarMenu() throws InterruptedException  {
		pageOrdensDeCompra.acessarMenu();
	}

	@And("pesquisar pela Obra em aprovacao")
	public void pesquisarObraEmAprovacao() throws InterruptedException  {
		String nomeDaObra = ObraPage.getVariableYouWantToUse();
		pageOrdensDeCompra.pesquisarObraEmAprovacao(nomeDaObra);
	}

	@And("visualizar O.C em Aprovacao")
	public void visualizarOCEmAprovacao() throws InterruptedException  {
		pageOrdensDeCompra.visualizarOCEmAprovacao();
	}

	@When("na tela de Detalhe eu clico em Aprova O.C em aprovacao")
	public void clicarEmAprovarOC() throws InterruptedException  {
		pageOrdensDeCompra.clicarEmAprovarOC();
	}

	@And("valida aprovacao")
	public void confirmarOperacaoQCEmAprovacao() throws InterruptedException  {
		pageOrdensDeCompra.confirmarOperacaoQCEmAprovacao();
	}

}
