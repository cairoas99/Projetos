package bild.Compra;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bild.TestRule;
import bild.Login.LoginPage;

public class CompraPage extends CompraElementMap {

	JavascriptExecutor js;
	WebDriver driver;
	WebDriverWait wait;
	String obra;

	public CompraPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 500);
	}

	public void acessarMenuComprasCanlendarioDeCompras(String nomeDaObra) throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		navigation.click();
		Thread.sleep(2000);
		menuCompras.click();
		obra = nomeDaObra;
		Thread.sleep(1500);
		menuCalendarioDeCompras.click();
	}

	public void selecionoObraEInsumos() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(14000);
		selecionarObra.click();
		digitarObra.sendKeys(obra);
		digitarObra.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void clicarEmComprar() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(30000);
		btnComprar.click();
	}

	public void clicarEmComprarSaldoTotal() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		btnComprarSaldo.click();
	}

	public void fecharOC() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		wait.until(ExpectedConditions.visibilityOf(btnFecharOc));
		if (!btnFecharOc.isDisplayed()) {
			driver.navigate().refresh();
		}

		btnFecharOc.click();
	}

	public void confirmarCompra() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		wait.until(ExpectedConditions.visibilityOf(btnConfirmar));
		btnConfirmar.click();
	}
}
