package bild.Fornecedor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FornecedorElementMap {

	@FindBy(xpath = "//a[@class='sidebar-toggle']")
	protected WebElement navigation;

	@FindBy(xpath = "//span[text()='Cadastros']")
	protected WebElement menuCadastros;

	@FindBy(xpath = "//span[text()='Fornecedores']")
	protected WebElement menuFornecedores;
	
	@FindBy(css = "[href='http://bildsys.fcmoreno.com.br/fornecedores/create']")
	protected WebElement btnNovo;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-flat btn-lg pull-right']")
	protected WebElement btnSalvarFornecedor;
	
	protected WebElement numero1;
	
	protected WebElement nome;
	
	protected WebElement email;
	
	protected WebElement telefone;
}

