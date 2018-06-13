package bild.Fornecedor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bild.TestRule;
import bild.GeradorCpfCnpj.*;
import bild.Login.LoginPage;

public class FornecedorPage extends FornecedorElementMap {

	WebDriver driver;
	JavascriptExecutor js;
	GeraCpfCnpj gerarCpnj = new GeraCpfCnpj();

	public FornecedorPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;
	}

	public void acessarTelaFornecedor() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		navigation.click();
		Thread.sleep(2000);
		menuCadastros.click();
		menuFornecedores.click();
	}

	public void clicarBotaoNovoFornecedor() {
		js.executeScript("document.body.style.zoom='100%'");
		btnNovo.click();
	}

	public void informaDadosFornecedor() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		String cnpj =  gerarCpnj.cnpj(true);
		
		numero1.sendKeys(cnpj);
		nome.sendKeys("Fornecedor Selenium");
		email.sendKeys("fornecedor_selenium@gmail.com.br");
		telefone.sendKeys("24560990");
		Thread.sleep(3000);
	}

	public void salvarFornecedor() {
		btnSalvarFornecedor.click();
	}
}
