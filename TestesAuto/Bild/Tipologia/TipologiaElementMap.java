package bild.Tipologia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TipologiaElementMap {

	@FindBy(xpath = "//li[@class='dropdown user user-menu']")
	protected WebElement dropDowAdministrativo;

	@FindBy(xpath = "/html/body/div[1]/header/nav/div/ul/li[2]/ul/li[2]/div[1]/a")
	protected WebElement administrativo;

	@FindBy(xpath = "//span[text()='BildDoc']")
	protected WebElement tipologia;

	@FindBy(xpath = "//span[text()='Tipos de Q.C.']")
	protected WebElement tipologias;

	@FindBy(xpath = "/html/body/div[1]/div[3]/section/a")
	protected WebElement botaoNovo;

	@FindBy(xpath = "//button[@class='btn btn-success pull-right flat']")
	protected WebElement salvar;

	@FindBy(xpath = "//div[@class='alert-success']")
	protected WebElement mensagemSucesso;

	// Scenario de Deletar
	@FindBy(xpath = "//input[@class='form-control input-sm']")
	protected WebElement btnPesquisar;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
	protected WebElement btnExcluir;

	@FindBy(xpath = "//button[text()='Sim, Remover!']")
	protected WebElement confirmar;
	
	protected WebElement nome;
}
