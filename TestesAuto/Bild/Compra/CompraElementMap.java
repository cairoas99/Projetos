package bild.Compra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompraElementMap {

	@FindBy(xpath = "/html/body/div[1]/header/button")
	protected WebElement navigation;

	@FindBy(xpath = "//span[text()='Compras e Suprimentos']")
	protected WebElement menuCompras;

	@FindBy(xpath = "//span[text()='Calendário de Compras']")
	protected WebElement menuCalendarioDeCompras;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	protected WebElement selecionarObra;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	protected WebElement digitarObra;

	@FindBy(xpath = "//*[@id=\"btn-comprar-calendario\"]")
	protected WebElement btnComprar;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div/button")
	protected WebElement btnComprarSaldo;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/div/div[2]/button[1]")
	protected WebElement btnFecharOc;

	@FindBy(xpath = "//button[@class='confirm']")
	protected WebElement btnConfirmar;
}
