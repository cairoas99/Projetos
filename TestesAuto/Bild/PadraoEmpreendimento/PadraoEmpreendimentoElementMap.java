package bild.PadraoEmpreendimento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PadraoEmpreendimentoElementMap {


    //Scenario: Criarcao Padrao Empreendimento-------------------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/header/button")
    protected WebElement menuHamburger;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]")
    protected WebElement menuCadastros;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]/ul/li[8]")
    protected WebElement submenuPadraoEmpreendimento;

    @FindBy(xpath = "/html/body/div[1]/div/section/a")
    protected WebElement btnAdicionarPadraoEmpreendimento;

    @FindBy(xpath = "//*[@id=\"nome\"]")
    protected WebElement nome;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[3]/button")
    protected WebElement btnSalvar;

    @FindBy(xpath = "//*[@id=\"dataTableBuilder_filter\"]/label/div/input")
    protected WebElement inputBuscaPadraoEmpreendimento;

    //@FindBy(xpath = "//a[@class='btn btn-default btn-xs']")
    @FindBy(xpath = "//a[@class='btn btn-default btn-xs']")
    protected WebElement btnVisualizar;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/p")
    protected WebElement visualizarNome;


    //Feature: Editar Padrao Empreendimento----------------------------------------------------------------------------------

    @FindBy(xpath = "//a[@class='btn btn-warning btn-xs']")
    protected WebElement btnEditar;


    //Feature Remocao de Padrao de Empreendimento

    @FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
    protected WebElement btnRemover;

    @FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
    protected WebElement btnConfirmarRemocao;
}
