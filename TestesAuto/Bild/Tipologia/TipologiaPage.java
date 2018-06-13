package bild.Tipologia;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import bild.TestRule;
import bild.Login.LoginPage;

public class TipologiaPage extends TipologiaElementMap {

	WebDriver driver;
	Faker faker = new Faker();
	String tipologiaText;
	JavascriptExecutor js;
	WebDriverWait wait;

	public TipologiaPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 300);
	}

	public void acessarMenuAdministrativoTipologia() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		dropDowAdministrativo.click();
		administrativo.click();
		js.executeScript("document.body.style.zoom='100%'");

		tipologia.click();
		js.executeScript("document.body.style.zoom='100%'");
		wait.until(ExpectedConditions.visibilityOf(tipologias));
		tipologias.click();
		js.executeScript("document.body.style.zoom='100%'");

		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(botaoNovo));
		botaoNovo.click();
	}

	public void informarDadosDaTipologia() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		nome.sendKeys("Topologia " + faker.name().firstName() + " Selenium");
		tipologiaText = nome.getAttribute("value");
	}

	public void clicoEmSalvar() {
		js.executeScript("document.body.style.zoom='100%'");
		jsClick(salvar);
	}

	public boolean validarMensagemDeSucesso() {
		try {
			synchronized (TestRule.getDriver()) {
				TestRule.getDriver().wait(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String strMensagemExibida = mensagemSucesso.getText();
		if (strMensagemExibida.contains("Tipologia salvo com sucesso.")) {
			return true;
		} else {
			return false;
		}
	}

	public void selecionarTipologiaParaDeletar() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		acessarMenuAdministrativoTipologia();
		informarDadosDaTipologia();
		clicoEmSalvar();
		btnPesquisar.sendKeys(tipologiaText);
		btnExcluir.click();

		js.executeScript("document.body.style.zoom='100%'");
		Set<String> RecipeHandle = driver.getWindowHandles();
		System.out.println(RecipeHandle);
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}

		confirmar.click();
	}

	public void clicarNoBotaoDeDeletar() {
		js.executeScript("document.body.style.zoom='100%'");
		btnExcluir.click();
	}

	public void confirmarOperacaoDeDeletar() {

	}

	public void jsClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
}
