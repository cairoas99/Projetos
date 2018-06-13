package bild.Carteira;

import bild.TestRule;
import bild.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarteiraPage extends CarteiraElementMap {

    private JavascriptExecutor js;

    private WebDriver driver;

    CarteiraPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
        driver = TestRule.getDriver();
        js = (JavascriptExecutor) driver;
    }

    public void acessarTelaCarteiras(){
        js.executeScript("document.body.style.zoom='100%'");
        Utils.Wait(3);
        menuHambuerger.click();
        menuCadastros.click();
        submenuCarteira.click();
    }

    public void clicarAdicionarCarteira(){
        Utils.Wait(3);

        btnAdicionar.click();
    }

    public void informarDadosCarteira(String strNome, String strComprador, String strEqualizacao){
        nome.sendKeys(strNome);
        comprador.sendKeys(strComprador);
        comprador.sendKeys(Keys.ENTER);
        equalizacao.sendKeys(strEqualizacao);
        equalizacao.sendKeys(Keys.ENTER);
    }

    public void clicarSalvarCarteira(){
        btnSalvar.click();
    }

    public boolean verificarMensagemCarteiraCriadaComSucesso(){
        WebDriver driver = TestRule.getDriver();
        return driver.getPageSource().contains("Carteira salvo com sucesso");
    }



    //------------------------------------------------------------------------------------------
    //Feature: Editar carteira


    public void buscarCarteira(String strNome) throws InterruptedException {
        campoBusca.clear();
        campoBusca.sendKeys(strNome);
        Thread.sleep(4000);
    }

    public void clicarBotaoEditarCarteira(){
        btnEditar.sendKeys(Keys.RETURN);
    }

    public void alterarDadosCarteira(String strNome, String strComprador, String strEqualizacao) throws InterruptedException {
        Thread.sleep(4000);
        nome.clear();
        nome.sendKeys(strNome);

        //campoCompradoresEditar.clear();
        new Actions(driver).moveToElement(campoCompradoresEditar).click().sendKeys(strComprador).sendKeys(Keys.ENTER).perform();

        //campoEqualizacoesEditar.clear();
        new Actions(driver).moveToElement(campoEqualizacoesEditar).click().sendKeys(strEqualizacao).sendKeys(Keys.ENTER).perform();
    }

    public void clicarSalvarEdicaoCarteira(){
        btnSalvar.click();
    }

    public boolean verificarMensagemAtualizacaoCarteira(){
        return TestRule.getDriver().getPageSource().contains("Carteira atualizado com sucesso.");
    }

    public void visualizarCarteiraEditada(String strNome) throws InterruptedException {
        campoBusca.clear();
        buscarCarteira(strNome);
        Utils.Wait(5);
        Thread.sleep(4000);
        btnVisualizar.sendKeys(Keys.RETURN);
    }

    public String verificarDadosAlterados(String strNome, String strComprador, String strEqualizacao)
            throws InterruptedException {
        Thread.sleep(3000);
        String pageSource = TestRule.getDriver().getPageSource();
        return pageSource.contains(strNome) &&
                pageSource.contains(strComprador) &&
                pageSource.contains(strEqualizacao) ? "Dados ok" : "Dados incorretos";
    }


    //Feature: Excluir carteira --------------------------------------------------------------------------------------

    public void clicarRemoverCarteira(){
        btnRemover.click();
    }

    public void confirmarRemocaoCarteiraNoPopup(){
        btnConfirmarRemocao = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(btnConfirmarRemocao));
        btnConfirmarRemocao.click();
    }

    public void verificarSeCarteiraFoiRemovida(String strNome) throws InterruptedException {
        buscarCarteira(strNome);
        if (driver.getPageSource().contains(strNome)){

        }
    }

}
