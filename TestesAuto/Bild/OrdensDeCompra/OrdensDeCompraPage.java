package bild.OrdensDeCompra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bild.TestRule;
import bild.Login.LoginPage;

public class OrdensDeCompraPage extends OrdensDeCompraElementMap {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	String obra;
	Actions action;

	public OrdensDeCompraPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 300);
		action = new Actions(driver);
	}

	public void acessarMenuCompraOrdensDeCompra(String nomeDaObra) throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		navigation.click();
		Thread.sleep(3000);
		menuCompras.click();
		js.executeScript("document.body.style.zoom='100%'");
		obra = nomeDaObra;

		wait.until(ExpectedConditions.visibilityOf(menuOrdensDeCompras));
		menuOrdensDeCompras.click();
	}

	public void pesquisarObraEmAberto() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(19000);

		informarObra.sendKeys(obra);
		/*
		 * List<WebElement> li = driver.findElements(By.xpath(
		 * "//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[5]/input")); li.get(4).clear();
		 * li.get(4).click(); li.get(4).sendKeys("Em Aberto");
		 * li.get(4).sendKeys(Keys.TAB);
		 */

		WebElement situacao = driver.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[5]/input"));
		situacao.sendKeys("Em Aberto");
	}

	public void visualizarOCEmAberto() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2500);
		String id = idOrdemDeCompra.getText();

		WebElement visualizar = driver.findElement(By.xpath("//a[@href='ordens-de-compra/carrinho?id=" + id + "']"));
		jsClick(visualizar);

	}

	public void clicarEmFecharOC() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		fecharOc.click();
	}

	public void confirmarOperacaoDeFecharOC() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		simFecharOC.click();
	}

	public void acessarMenu() throws InterruptedException {
		this.acessarMenuCompraOrdensDeCompra(obra);
	}

	public void pesquisarObraEmAprovacao(String obra) throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(22000);
		informarObra.sendKeys(obra);

		/*
		 * List<WebElement> li =
		 * driver.findElements(By.xpath("//input[@class='form-control']"));
		 * wait.until(ExpectedConditions.visibilityOfAllElements(li));
		 * li.get(4).clear(); li.get(4).click(); li.get(4).sendKeys("Em Aprova��o");
		 * li.get(4).sendKeys(Keys.TAB);
		 */

		WebElement situacao = driver.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[5]/input"));
		situacao.sendKeys("Em Aprovação");
	}

	public void visualizarOCEmAprovacao() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(idOrdemDeCompra));
		String id = idOrdemDeCompra.getText();

		WebElement visualizar = driver.findElement(By.xpath("//a[@href='ordens-de-compra/detalhes/" + id + "']"));
		jsClick(visualizar);
	}

	public void clicarEmAprovarOC() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(1500);
		btnAprovar.click();
	}

	public void confirmarOperacaoQCEmAprovacao() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(1100);
		
		aprovar.click();
		action.sendKeys(Keys.ESCAPE);
		driver.navigate().refresh();
		action.sendKeys(Keys.F5);
		driver.navigate().back();
	}

	public void jsClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

}
