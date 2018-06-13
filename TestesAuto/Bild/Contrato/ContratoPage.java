package bild.Contrato;

import java.awt.*;
import java.util.Iterator;

import bild.Utils;
import cucumber.api.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import bild.TestRule;
import bild.Login.LoginPage;

import javax.rmi.CORBA.Util;

public class ContratoPage extends ContratoElementMap {

	WebDriver driver;
	JavascriptExecutor js;
	double valorReapropriacao = 0;
	String strValorDoItemParaReapropriar;
	double valorDoItemParaReapropriar = 0;
	String strValorItemReapropriado;
	double valorItemReapropriado = 0;
	
	public ContratoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;		
	}

	public void acesarTelaDeContrato(){
		//js.executeScript("document.body.style.zoom='100%'");

        Utils.sleep(2000);
		navigation.click();
		Utils.sleep(2000);
		Contratos.click();
		Utils.sleep(2000);
		menuContratos.click();
	}

	public void selecionarContratoDaObra() {
		js.executeScript("document.body.style.zoom='100%'");
		selecionarObra.click();
		inputObra.sendKeys("Edificio Lab");
		confirmarObra.click();
	}

	public void visualizarContratoDaObra() throws InterruptedException {
		Thread.sleep(3000);
		String numeroContrato = contratoDaObra.getText();
		//WebElement visualizar = driver.findElement(By.xpath("//a[@href='http://bildsys.fcmoreno.com.br/contratos/" + numeroContrato + "']"));
		                        
		visualizar.click();
	}

	public void aprovarContratoDaObra() throws InterruptedException, AWTException {
		js.executeScript("document.body.style.zoom='100%'");
		btnAprovarContrato.click();
		Thread.sleep(1500);
		btnConfirmarAprovacao.click();
		driver.navigate().to("http://bildsys.fcmoreno.com.br/contratos");
	}

	public void selecionarArquivo() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		selecionarContratoDaObra();
		driver.navigate().refresh();
		js.executeScript("document.body.style.zoom='100%'");	
		visualizar.click();
		selecionarArquivo.sendKeys("C://Users//Tiago Penha//Desktop//minuta_61.pdf");		
	}

	public void clicarEnviarELiberar() {
		js.executeScript("document.body.style.zoom='100%'");
		btnEnviarLiberar.click();
	}

	public void baixarContrato() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		WebElement btnBaixarContrato = driver.findElement(By.xpath("//a[@href='http://bildsys.fcmoreno.com.br/contratos/" + numeroContrato.getText() + "/imprimir-contrato']"));
		btnBaixarContrato.click();
		Thread.sleep(2000);
	}

	public void baixarEspelhoContrato() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		WebElement btnBaixarEspelhoContrato = driver.findElement(By.xpath("//a[@href='http://bildsys.fcmoreno.com.br/contratos/" + numeroContrato.getText() + "/imprimir-espelho-contrato']"));
		btnBaixarEspelhoContrato.click();
		Thread.sleep(2000);
	}

	public void baixarMinutaAssinada() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		WebElement btnBaixarEspelhoContrato = driver.findElement(By.xpath("//a[@href='https://storeteste.blob.core.windows.net/meucontainer/public/contratos/" + numeroContrato.getText() + "/minuta-61_20171110121848.pdf']"));
		btnBaixarEspelhoContrato.click();
		Thread.sleep(2000);
	}


	//Scenario: Reapropriar insumo =====================================================================================

    public void entrarTelaContratoParaReapropriar(){
        acesarTelaDeContrato();
    }

    public void buscarContratoParaReapropriar(){
        inputFiltrarStatus.sendKeys("Ativo");
        inputFiltrarStatus.sendKeys(Keys.ENTER);
    }

    public void clicarVisualizarContratoParaReapropriar(){
	    Utils.sleep(2000);
        btnVisualizarContrato.click();
    }

    public void clicarReapropriar(){
	    Utils.sleep(2000);
        btnReapropriar.click();
    }

    public void selecionarItemParaReapropriar(){
	    Utils.sleep(2000);
        radioSelecionarItemParaReapropriar.click();
        strValorDoItemParaReapropriar = driver.findElement(By.xpath
                ("//*[@id=\"modal-reapropriar\"]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]")).getText();
        strValorDoItemParaReapropriar = strValorDoItemParaReapropriar.substring(0, strValorDoItemParaReapropriar.indexOf(" "));
        strValorDoItemParaReapropriar = strValorDoItemParaReapropriar.replace(".","");
        strValorDoItemParaReapropriar = strValorDoItemParaReapropriar.replace(",", ".");
        valorDoItemParaReapropriar = Double.parseDouble(strValorDoItemParaReapropriar);
    }

    public void informarDestinoReapropriacao(){
        dropDestinoReapropriacao.click();
        Utils.sleep(2000);
        inputDestinoReapropriacao.sendKeys(Keys.ENTER);
    }

    public void definirQuantidadeReapropriacao(){
        valorReapropriacao = 3000;
        inputQuantidadeReapropriacao.sendKeys(Double.toString(valorReapropriacao));
        Utils.sleep(2000);
    }

    public void clicarSalvarReapropriacao(){
	    Utils.sleep(2000);
        btnSalvarReapropriacao.click();
    }

    public void clicarConfirmarReapropriacao(){
        Utils.sleep(2000);
        btnConfirmarAprovacao.click();
        Utils.recarregarPagina();
    }

    public void entrarTelaReapropriacoesParaVerificar(){
	    Utils.sleep(2000);
        btnReapropriar.click();
    }

    public void verificarApropriacaoRecemCriada(){
	    Utils.sleep(3000);
	    tabelaReapropriacoes = driver.findElements(By.xpath(".//table[@class='table  table-no-margin']/tbody/tr"));
	    for (WebElement itemReapropriacao : tabelaReapropriacoes){
	        if (itemReapropriacao.getText().contains("300,00")){
                Assert.assertTrue("Reapropriação não criada", itemReapropriacao.getText().contains("300,00"));
                return;
            }
        }
    }

    public void verificarSeValorReapropriadoFoiRemovido(){
        converteeTextoItemReapropriacaoParaDouble(prepararTextoValorItemReapropriacaoParaConverter(
                pegarTextoElementoItemReapropriacao("//*[@id=\"modal-reapropriar\"]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]")));
        Assert.assertTrue(valorDoItemParaReapropriar - 300 == valorItemReapropriado);
    }

    private String pegarTextoElementoItemReapropriacao(String xpath){
	    return driver.findElement(By.xpath(xpath)).getText();
    }

    private String prepararTextoValorItemReapropriacaoParaConverter(String textoElementoItemReapropriacao){
        textoElementoItemReapropriacao = textoElementoItemReapropriacao.substring(0, textoElementoItemReapropriacao.indexOf(" "));
        textoElementoItemReapropriacao = textoElementoItemReapropriacao.replace(".","");
        textoElementoItemReapropriacao = textoElementoItemReapropriacao.replace(",", ".");
        return textoElementoItemReapropriacao;
    }

    private double converteeTextoItemReapropriacaoParaDouble(String textoDoValorDoItemReapropriacao){
        valorItemReapropriado = Double.parseDouble(textoDoValorDoItemReapropriacao);
        return valorItemReapropriado;
    }



	//Scenario: Distrato ===============================================================================================

    public void entrarTelaContratoParaDistrato() throws InterruptedException {
        acesarTelaDeContrato();
    }

    public void buscarContratoParaDistrato(){

    }

    public void clicarVisualizarContratoParaDistrato(){

    }

    public void clicarDistrato(){

    }

    public void inserirQuantidadeDistrato(){

    }

    public void clicarSalvarDistrato(){

    }

    public void clicarAprovarDistrato(){

    }

    public void confirmarAprovacaoDistrato(){

    }

    public void entrarTelaDistratoParaVerificar(){

    }

    public void verificarSeValorDistratradoVoltouParaItemOrigem(){

    }



	//Scenario: Contrato reajuste ======================================================================================

    public void entrarTelaContratoParaReajuste() throws InterruptedException {
        acesarTelaDeContrato();
    }

    public void buscarContratoParaReajuste(){

    }

    public void clicarVisualizarContratoParaReajuste(){

    }

    public void clicarReajuste(){

    }

    public void inserirValorReajuste(){

    }

    public void clicarSalvarReajuste(){

    }

    public void clicarAprovarReajuste(){

    }

    public void entrarTelaReapropriacaoParaVerificarReajuste(){

    }

    public void verificarSeValorReajustadoFoiRemovidoDoItemOrigem(){

    }


}
