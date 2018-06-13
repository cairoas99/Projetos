package bild.Insumos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsumosElementMap {


    //Scenário: Criação de Insumo
    @FindBy(xpath = "/html/body/div[1]/header/button")
    protected WebElement menuHamburger;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]")
    protected WebElement menuCadastros;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]/ul/li[6]")
    protected WebElement submenuInsumos;

    @FindBy(xpath = "/html/body/div[1]/div/section/div/a[2]")
    protected WebElement btnAdicionarInsumo;

    @FindBy(id = "nome")
    protected WebElement nome;

    @FindBy(id = "unidade_sigla")
    protected WebElement unidadeMedida;

    @FindBy(id = "codigo")
    protected WebElement codigo;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[4]/span")
    protected WebElement grupoDrop;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    protected WebElement grupoInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[5]/button")
    protected WebElement btnSalvarInsumo;

    @FindBy(xpath = "//*[@id=\"dataTableBuilder_filter\"]/label/div/input")
    protected WebElement inputBuscarSolicitacaoInsumo;

    @FindBy(xpath = "//a[@class='btn btn-default btn-xs']")
    protected WebElement btnVisualizarSolicitacaoInsumo;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/p")
    protected WebElement visualizadorNome;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/p")
    protected WebElement visualizadorUnidadeMedida;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[3]/p")
    protected WebElement visualizadorCodigo;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[4]/p")
    protected WebElement visualizadorGrupo;



    //Scenário: Editar Insumo

    @FindBy(xpath = "/html/body/div[1]/div/section/div/a[1]")
    protected WebElement btnRelacaoInsumosSolicitados;

    @FindBy(xpath = "//a[@class='btn btn-warning btn-xs']")
    protected WebElement btnEditarInsumo;


    //Scenario: Remover Insumo

    @FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
    protected WebElement btnRemoverInsumo;

    @FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
    protected WebElement btnConfirmarRemocaoInsumo;

}
