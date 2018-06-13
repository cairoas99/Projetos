package bild.Carteira;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarteiraElementMap {


    //Scenario: Criar Carteira
    @FindBy(xpath = "/html/body/div[1]/header/button")
    protected WebElement menuHambuerger;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]")
    protected WebElement menuCadastros;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]/ul/li[1]")
    protected WebElement submenuCarteira;

    @FindBy(xpath = "/html/body/div[1]/div/section/a")
    protected WebElement btnAdicionar;

    @FindBy(id = "nome")
    protected WebElement nome;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[2]/span/span[1]/span/ul/li/input")
    protected WebElement comprador;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[3]/span/span[1]/span/ul/li[1]/input")
    protected WebElement equalizacao;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[4]/button")
    protected WebElement btnSalvar;


    //Scenario: Editar Carteira

    @FindBy(xpath = "//*[@id=\"dataTableBuilder_filter\"]/label/div/input")
    protected WebElement campoBusca;

    @FindBy(xpath = "//*[@id=\"dataTableBuilder_filter\"]/label/div/span")
    protected WebElement btnBuscar;

    @FindBy(xpath = "//*[@id=\"formDelete23\"]/div/a[2]")
    protected WebElement btnEditar;

    @FindBy(xpath = "//*[@id=\"formDelete23\"]/div/a[1]")
    protected WebElement btnVisualizar;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/p")
    protected WebElement visualizarNome;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[2]/span/span[1]/span/ul")
    protected WebElement campoCompradoresEditar;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[3]/span/span[1]/span/ul")
    protected WebElement campoEqualizacoesEditar;


    //Scenario: Excluir carteira


    @FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
    protected WebElement btnRemover;

    @FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
    protected WebElement btnConfirmarRemocao;
}
