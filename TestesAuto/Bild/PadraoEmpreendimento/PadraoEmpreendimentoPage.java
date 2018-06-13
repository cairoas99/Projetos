package bild.PadraoEmpreendimento;

import bild.TestRule;
import bild.Utils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PadraoEmpreendimentoPage extends PadraoEmpreendimentoElementMap{

    private JavascriptExecutor js;

    private WebDriver driver;

    PadraoEmpreendimentoPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
        driver = TestRule.getDriver();
        js = (JavascriptExecutor) driver;
    }

    //Scenario: Criacao Padrao Empreendimento ---------------------------------------------------------

    public void entrarTelaPadraoEmpreendimento(){
        menuHamburger.click();
        menuCadastros.click();

        submenuPadraoEmpreendimento = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(submenuPadraoEmpreendimento));
        submenuPadraoEmpreendimento.click();
    }

    public void clicarAdicionarPadraoEmpreendimento() throws InterruptedException {
        //btnAdicionarPadraoEmpreendimento = (new WebDriverWait(driver, 10))
        //        .until(ExpectedConditions.elementToBeClickable(btnAdicionarPadraoEmpreendimento));
        Thread.sleep(3000);
        btnAdicionarPadraoEmpreendimento.click();
    }

    public void informaDadosPadraoEmpreendimento(String strNome){
        nome.sendKeys(strNome);
    }

    public void clicarSalvarPadraoEmpreendimento(){
        btnSalvar.click();
    }

    public void buscarPadraoEmpreendimento(String strNome){
        inputBuscaPadraoEmpreendimento.clear();
        inputBuscaPadraoEmpreendimento.sendKeys(strNome);
    }

    public void clicarVisualizarPadraoEmpreendimento(){
        btnVisualizar.click();
    }

    public void verificarDadosPadraoEmpreendimento(String strNome){
        Assert.assertEquals(visualizarNome.getText(), strNome);
    }

    //Feature: Editar Padrao Empreendimento

    public void clicarEditarPadraoEmpreendimento(){
        btnEditar.click();
    }

    public void inserirInformacoesEdicaoPadraoEmpreendimento(String strNome){
        nome.clear();
        nome.sendKeys(strNome);
    }

    public void clicarSalvarEdicaoPadraoEmpreendimento(){
        btnSalvar.click();
    }

    public void clicarVisualizarPadraoEmpreendimentoEditado(){
        Utils.sleep(3000);
        btnVisualizar.click();
    }

    public void verificarDadosEditadosPadraoEmpreendimento(String strNome){
        Assert.assertEquals(strNome, visualizarNome.getText());
    }


    //Feature Remocao de Padrao de Empreendimento

    public void buscarPadraoEmpreendimentoParaRemover(String strNome){
        entrarTelaPadraoEmpreendimento();
        buscarPadraoEmpreendimento(strNome);
    }

    public void clicarBotaoRemoverPadraoEmpreendimento(){
        Utils.sleep(2000);
        btnRemover.click();
    }

    public void confirmarRemocaoPadraoEmpreendimentoPopup(){
        Utils.sleep(2000);
        btnConfirmarRemocao.click();
    }

    public void buscarPadraoEmpreendimentoRemovido(String strNome){
        buscarPadraoEmpreendimento(strNome);
    }

    public void verificarRemocaoPadraoEmpreendimento(String strNome){
        Utils.sleep(3000);
        Assert.assertFalse("O Padrão de Empreendimento não foi removido", driver.getPageSource().contains(strNome));
    }

}
