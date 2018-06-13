package bild.AbrirConcorrencia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bild.TestRule;
import bild.Login.LoginPage;

public class AbrirConcorrenciaPage extends AbrirConcorrenciaElementMap {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	String obra;

	public AbrirConcorrenciaPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 500);
	}

	public void pesquisarObraAbrirConcorrencia(String nomeDaObra) throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		navigation.click();
		menuSuprimentos.click();
		obra = nomeDaObra;
		menuQC.click();
	}

	public void informarObraEStatus() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		filtrarObra("Aprovado");
	}

	public void clicarNoBotaoDeAbriConcorrencia() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		btnAbrirConcorrencia.click();
	}

	public void confirmarInicioConcorrencia() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		btnSimIniciarConcorrencia.click();
	}

	public void confirmarOperacaoDeConcorrencia() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		btnOk.click();
	}

	public void clicarNoBotaoInformarValores() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		this.filtrarObra("Em Negocia��o");

		WebElement obra = driver.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr/td[1]"));
		String idObra = obra.getText();

		WebElement btnInformarValores = driver.findElement(By.xpath(
				"//a[@href='http://bildsys.fcmoreno.com.br/quadro-de-concorrencia/" + idObra + "/informar-valor']"));
		wait.until(ExpectedConditions.visibilityOf(btnInformarValores));
		btnInformarValores.click();
	}

	public void informarFornecedores() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		selecionarFornecedor.click();
		informarFornecedor.sendKeys("Votoratim Siderurgica S.A");
		informarFornecedor.sendKeys(Keys.ENTER);
	}

	public void informarValoresUnitario() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		List<WebElement> rows = driver
				.findElements(By.xpath("//*[@id=\"informar-valores-form\"]/div[2]/div/table/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {
			WebElement txtValorUnitario = rows.get(i)
					.findElement(By.xpath(".//input[@class='form-control js-calc-price money']"));
			txtValorUnitario.sendKeys("1200");
		}

	}

	public void informarFrete() throws InterruptedException {
		frete.click();
	}

	public void informarPorcentagem() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		servicoMaoDeObra.sendKeys("5000");
		servicoContratada.sendKeys("5000");
	}

	public void informarNota() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		nota.click();
	}

	public void confirmarQueEstouCiente() throws InterruptedException {
		estouCiente.click();
	}

	public void infomarCondicaoDePagamento() throws InterruptedException {
		condicaoDePagamento.click();
		informarCondicao.sendKeys("45/90 Dias - 45/90");

		informarCondicao.sendKeys(Keys.ENTER);
	}

	public void salvarAbertuaDeQC() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		btnSalvar.click();
		btnSalvarPrecos.click();
	}

	public void avaliarQC() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		this.filtrarObra("Em Negocia��o");

		WebElement obra = driver.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr/td[1]"));
		String idObra = obra.getText();
		WebElement avaliarQC = driver.findElement(
				By.xpath("//a[@href='http://bildsys.fcmoreno.com.br/quadro-de-concorrencia/" + idObra + "/avaliar']"));
		avaliarQC.click();
	}

	public void informarVencedorOuNovaRodada() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		bntVencedorOuNovaRodada.click();
	}

	public void finalizarQC() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		finalizarQC.click();

		marcarDesmarcarTudo.click();

		finalizar.click();

		confirmarFinalizar.click();
	}

	public void filtrarObra(String status) {
		js.executeScript("document.body.style.zoom='100%'");
		List<WebElement> li = driver.findElements(By.xpath("//input[@class='form-control']"));

		li.get(1).clear();
		li.get(2).clear();

		li.get(1).click();
		li.get(1).sendKeys(obra);
		li.get(1).sendKeys(Keys.ENTER);

		li.get(2).click();
		li.get(2).sendKeys(status);
		li.get(2).sendKeys(Keys.ENTER);
	}

	public void informarCondicoesComerciais() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		txtDiasDePagamentoNumero.sendKeys("30");
		txtDiasDePagamentoExtenso.sendKeys("Trinta dias");
		txtMesesValidadeNumero.sendKeys("12");
		txtMesesValidadeExtenso.sendKeys("Doze meses");
		txtAnosDeGarantia.sendKeys("5 anos");
		txtDetalhamentoPreco.sendKeys("42424");
	}

	public void gerarContratoFornecedor() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(btnGerarContrato));
		btnGerarContrato.click();
	}

	public void imprimirContratoQC() {
		/*
		 * js.executeScript("document.body.style.zoom='100%'"); filtrarObra("Fechado");
		 * 
		 * WebElement obra =
		 * driver.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr/td[1]"));
		 * String idObra = obra.getText();
		 * 
		 * WebElement contrato = driver.findElement(By.xpath(
		 * "//a[@href='http://bildsys.fcmoreno.com.br/quadro-de-concorrencia/" + idObra
		 * + "/gerar-contrato']")); contrato.click();
		 */
	}

	public void exibirContrato() {
		js.executeScript("document.body.style.zoom='100%'");
		btnExibirContrato.click();
	}

	public void aprovarContratoDoQC() {
		js.executeScript("document.body.style.zoom='100%'");
		btnAprovarContrato.click();
	}

	public void confirarContratoDoQC() {
		js.executeScript("document.body.style.zoom='100%'");
		confirmarContrato.click();
	}
}
