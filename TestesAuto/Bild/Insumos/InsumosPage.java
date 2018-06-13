package bild.Insumos;

import bild.TestRule;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsumosPage extends InsumosElementMap {

    private JavascriptExecutor js;

    private WebDriver driver;

    InsumosPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
        driver = TestRule.getDriver();
        js = (JavascriptExecutor) driver;
    }

    public void entrarTelaInsumos() throws InterruptedException {
        js.executeScript("document.body.style.zoom='100%'");

        menuHamburger = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(menuHamburger));
        menuHamburger.click();

        menuCadastros = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(menuCadastros));
        menuCadastros.click();

        submenuInsumos = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(submenuInsumos));
        submenuInsumos.click();
    }

    public void clicarAdicionarInsumo() throws InterruptedException {
        Thread.sleep(3000);
        btnAdicionarInsumo.click();
    }

    public void inserirDadosInsumo(String nome, String unid_medida, String codigo, String grupo) throws InterruptedException {
        this.nome.sendKeys(nome);
        unidadeMedida.sendKeys(unid_medida);
        this.codigo.sendKeys(codigo);
        grupoDrop.click();
        grupoInput = (new WebDriverWait(driver, 10)).until(
                ExpectedConditions.visibilityOf(grupoInput));
        grupoInput.sendKeys(grupo);
        Thread.sleep(1000);
        grupoInput.sendKeys(Keys.ENTER);
    }

    public void clicarSalvarInsumo(){
        btnSalvarInsumo = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(btnSalvarInsumo));
        btnSalvarInsumo.click();
    }

    public void buscarInsumoRecemInserido(String nome) throws InterruptedException {
        //inputBuscarSolicitacaoInsumo = (new WebDriverWait(driver, 10)).until(
        //        ExpectedConditions.visibilityOf(inputBuscarSolicitacaoInsumo));
        Thread.sleep(3000);
        inputBuscarSolicitacaoInsumo.sendKeys(nome);
    }

    public void clicarVisualizarInsumo() throws InterruptedException {
        //btnVisualizarSolicitacaoInsumo = (new WebDriverWait(driver, 10)).until(
        //        ExpectedConditions.elementToBeClickable(btnVisualizarSolicitacaoInsumo));
        Thread.sleep(3000);
        btnVisualizarSolicitacaoInsumo.click();
    }

    public void verificarDadosInsumoInserido(String nome, String unid_medida, String codigo, String grupo) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Dados inseridos incorretos",
                visualizadorNome.getText().equals(nome) &&
                            visualizadorUnidadeMedida.getText().equals(unid_medida) &&
                            visualizadorCodigo.getText().equals(codigo) &&
                            visualizadorGrupo.getText().equals(grupo.toUpperCase()));
    }

    //Scenário: Editar Insumo-----------------------------------------------------------------------------------------------

    public void buscarInsumoParaEditar(String strNome) throws InterruptedException {
        entrarTelaInsumos();
        Thread.sleep(3000);
        btnRelacaoInsumosSolicitados.click();
        inputBuscarSolicitacaoInsumo.sendKeys(strNome);
    }

    public void clicarEditarInsumo() throws InterruptedException {
        Thread.sleep(2000);
        btnEditarInsumo.click();
    }

    public void editarInformacoesInsumo(String strNome, String strUnidadeMedida, String strCodigo, String strGrupo) throws InterruptedException {
        nome.clear();
        nome.sendKeys(strNome);

        unidadeMedida.clear();
        unidadeMedida.sendKeys(strUnidadeMedida);

        codigo.clear();
        codigo.sendKeys(strCodigo);

        grupoInput.clear();
        grupoDrop.click();
        Thread.sleep(2000);
        grupoInput.sendKeys(strGrupo);
    }

    public void clicarSalvarEdicaoInsumo(){
        btnSalvarInsumo.click();
    }

    public void buscarInsumoEditado(String strNome){
        inputBuscarSolicitacaoInsumo.sendKeys(strNome);
    }

    public void clicarVisualizarInsumoEditado(){
        btnVisualizarSolicitacaoInsumo.click();
    }

    public void verificarInformacoesEditadasInsumo(String strNome, String strUnidadeMedida, String strCodigo, String strGrupo) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Dados inseridos incorretos",
                visualizadorNome.getText().equals(strNome) &&
                        visualizadorUnidadeMedida.getText().equals(strUnidadeMedida) &&
                        visualizadorCodigo.getText().equals(strCodigo) &&
                        visualizadorGrupo.getText().equals(strGrupo.toUpperCase()));
    }

    //Scenario: Remover Insumo--------------------------------------------------------------------------------

    public void clicarRemoverInsumo() throws InterruptedException {
        Thread.sleep(3000);
        btnRemoverInsumo.click();
    }

    public void confirmarRemocaoInsumoPopup() throws InterruptedException {
        //btnConfirmarRemocaoInsumo = (new WebDriverWait(driver, 10))
        //        .until(ExpectedConditions.elementToBeClickable(btnConfirmarRemocaoInsumo));
        Thread.sleep(3000);
        btnConfirmarRemocaoInsumo.click();
    }

    public void verificarSeInsumoFoiRemovido(String strNome) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertFalse("Remoção não realizada", driver.getPageSource().contains(strNome));
    }
}
