package bild.Compra;

import bild.Utils;
import bild.Obra.ObraPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CompraSteps {

	CompraPage pageCompra = new CompraPage();

	@Given("acessei o menu Compras >> Calendario de Compras")
	public void acessarMenuComprasCanlendarioDeCompras() throws InterruptedException {
		String nomeDaObra = ObraPage.getVariableYouWantToUse();
		pageCompra.acessarMenuComprasCanlendarioDeCompras(nomeDaObra);
		Utils.logPrint("Compra","Acessando o menu Compras");
	}

	@And("na tela de Calendario eu seleciono a Obra")
	public void selecionoObraEInsumos() throws InterruptedException {
		pageCompra.selecionoObraEInsumos();
		Utils.logPrint("Compra","Acessando o menu Calendario de Compras");
	}

	@And("na tela de Calendario eu clico em Comprar")
	public void clicarEmComprar() throws InterruptedException {
		pageCompra.clicarEmComprar();
		Utils.logPrint("Compra","na tela de Calendario eu clico em Comprar");
	}

	@When("na tela de Comprar Insumos eu clico em comprar saldo de todos insumos")
	public void clicarEmComprarSaldoTotal() throws InterruptedException {
		pageCompra.clicarEmComprarSaldoTotal();
		Utils.logPrint("Compra","Comprar saldo de todos insumos");
	}

	@And("na tela de ordem de compra eu clico em Fechar O.C")
	public void fecharOC() {
		// pageCompra.fecharOC();
	}

	@And("quando aparecer alert eu confirmo a compra")
	public void confirmarCompra() {
		// pageCompra.confirmarCompra();
	}
}
