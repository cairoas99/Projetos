package bild.OrdensDeCompra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdensDeCompraElementMap {

	@FindBy(xpath = "/html/body/div[1]/header/button")
	protected WebElement navigation;

	@FindBy(xpath = "//span[text()='Compras e Suprimentos']")
	protected WebElement menuCompras;

	@FindBy(xpath = "//span[text()='Ordens de compra']")
	protected WebElement menuOrdensDeCompras;

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[3]/input")
	protected WebElement informarObra;
	
	@FindBy(xpath = "//input[@class='form-control'][3]")
	protected WebElement filtrar;

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tbody/tr/td[1]")
	protected WebElement idOrdemDeCompra;

	@FindBy(xpath = "//button[@class='btn btn-success  ']")
	protected WebElement btnAprovar;

	@FindBy(xpath = "/html/body/div[5]/div[7]/div/button")
	protected WebElement aprovar;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/button[1]")
	protected WebElement fecharOc;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement simFecharOC;
	
}
