package bild.Contrato;

import java.util.List;

import bild.TestRule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContratoElementMap {

	@FindBy(xpath = "/html/body/div[1]/header/button/span")
	protected WebElement navigation;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[4]/a")
	protected WebElement Contratos;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[4]/ul/li[2]/a")
	protected WebElement menuContratos;
	
	@FindBy(xpath = "//span[@id='select2-obra_id-container']")
	protected WebElement selecionarObra;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	protected WebElement inputObra;
	
	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	protected WebElement confirmarObra;

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tbody/tr")
	protected List<WebElement> tableContratos;
	
	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tbody/tr/td[1]")
	protected WebElement contratoDaObra;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-lg btn-flat']")
	protected WebElement btnAprovarContrato;
	
	@FindBy(xpath = "//button[@class='confirm']")
	protected WebElement btnConfirmarAprovacao;
	
	@FindBy(xpath = "//input[@class='form-control']")
	protected WebElement selecionarArquivo;
	
	@FindBy(xpath = "//button[@class='btn btn-flat btn-success btn-block']")
	protected WebElement btnEnviarLiberar;
	
	@FindBy(xpath = "//div[@class='sweet-overlay']")
	protected WebElement pagina;
	
	@FindBy(xpath = "//div[@class='btn-group']")
	protected WebElement visualizar;
	
	@FindBy(xpath = "//p[@class='form-control input-lg highlight text-center']")
	protected WebElement numeroContrato;



	//Scenario: Reapropriar insumo =====================================================================================

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[6]/input")
	protected WebElement inputFiltrarStatus;

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tbody/tr[1]/td[7]/a")
	protected WebElement btnVisualizarContrato;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[4]/div/table/tbody/tr[1]/td[12]/button[1]")
	protected WebElement btnReapropriar;

	@FindBy(xpath = "//*[@id=\"modal-reapropriar\"]/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div/ins")
	protected WebElement radioSelecionarItemParaReapropriar;

	@FindBy(xpath = "//*[@id=\"select2-insumo_reapropriado-container\"]")
	protected WebElement dropDestinoReapropriacao;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	protected WebElement inputDestinoReapropriacao;

	@FindBy(xpath = "//*[@id=\"modal-reapropriar\"]/div/div/div[2]/div[2]/div/input")
	protected WebElement inputQuantidadeReapropriacao;

	@FindBy(xpath = "//*[@id=\"modal-reapropriar\"]/div/div/div[3]/button[2]")
	protected WebElement btnSalvarReapropriacao;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnConfirmarSalvarReapropriacao;

	protected List<WebElement> tabelaReapropriacoes;


	//Scenario: Distrato ===============================================================================================

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[4]/div/table/tbody/tr[1]/td[12]/button[2]")
	protected WebElement btnDistrato;

	@FindBy(xpath = "//*[@id=\"modal-distrato\"]/div/div/div[2]/table/tbody/tr/td[3]/div/input")
	protected WebElement inputQuantidadeADistratar;

	@FindBy(xpath = "//*[@id=\"modal-distrato\"]/div/div/div[3]/button[2]")
	protected WebElement btnSalvarDistrato;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnConfirmarSalvarDistrato;


	//Scenario: Contrato reajuste ======================================================================================

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div[4]/div/table/tbody/tr[1]/td[12]/button[3]")
	protected WebElement btnReajuste;

	@FindBy(xpath = "//*[@id=\"modal-reajuste\"]/div/div/div[2]/table/tbody/tr/td[3]/div/input")
	protected  WebElement inputQuantidadeReajuste;

	@FindBy(xpath = "//*[@id=\"modal-reajuste\"]/div/div/div[3]/button[2]")
	protected WebElement btnSalvarReajuste;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnConfirmarSalvarReajuste;

}
