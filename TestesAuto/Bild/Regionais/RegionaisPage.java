package bild.Regionais;

import bild.TestRule;
import bild.Utils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegionaisPage extends RegionaisElementMap{

    private JavascriptExecutor js;

    private WebDriver driver;

    RegionaisPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
        driver = TestRule.getDriver();
        js = (JavascriptExecutor) driver;
    }

    public void entrarTelaRegionais(){
        menuHamburger.click();
        menuCadastros.click();
        Utils.sleep(3000);
        submenuRegionais.click();
    }

    public void clicarBotaoAdicionarRegional(){
        Utils.sleep(2000);
        btnAdicionarRegional.click();
    }

    public void inserirInformacoesRegional(String strNome){
         nome.sendKeys(strNome);
    }

    public void clicarSalvarRegional(){
        btnSalvar.click();
    }

    public void buscarRegional(String strNome){
        inputBuscarRegional.clear();
        inputBuscarRegional.sendKeys(strNome);
        Utils.sleep(3000);
    }

    public void clicarVisualizarRegional(){
        Utils.sleep(2000);
        btnVisualizarRegional.click();
    }

    public void verificarDadosRegional(String strNome){
        Assert.assertEquals(strNome, visualizarNome.getText());
    }

    public void clicarEditarRegional(){
        btnEditarRegional.click();
    }

    public void inserirNovosDadosRegional(String strNome){
        nome.clear();
        inserirInformacoesRegional(strNome);
    }

    public void clicarRemoverRegional(){
        btnRemoverRegional.click();
    }

    public void confirmarRemocaoRegionalPopup(){
        Utils.sleep(2000);
        btnConfirmarRemocaoRegionalPopup.click();
    }

    public void verificarRemocaoDaRegional(String strNome){
        Assert.assertFalse("A Regional não foi removida", driver.getPageSource().contains(strNome));
    }

}
