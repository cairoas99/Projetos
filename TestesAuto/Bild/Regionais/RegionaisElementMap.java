package bild.Regionais;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegionaisElementMap {

    @FindBy(xpath = "/html/body/div[1]/header/button")
    protected WebElement menuHamburger;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]")
    protected WebElement menuCadastros;

    @FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[2]/ul/li[9]")
    protected WebElement submenuRegionais;

    @FindBy(xpath = "/html/body/div[1]/div/section/a")
    protected WebElement btnAdicionarRegional;

    @FindBy(xpath = "//*[@id=\"nome\"]")
    protected WebElement nome;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[2]/button")
    protected WebElement btnSalvar;

    @FindBy(xpath = "//*[@id=\"dataTableBuilder_filter\"]/label/div/input")
    protected WebElement inputBuscarRegional;

    @FindBy(xpath = "//a[@class='btn btn-default btn-xs']")
    protected WebElement btnVisualizarRegional;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[1]/p")
    protected WebElement visualizarNome;

    @FindBy(xpath = "//a[@class='btn btn-warning btn-xs']")
    protected WebElement btnEditarRegional;

    @FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
    protected WebElement btnRemoverRegional;

    @FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
    protected WebElement btnConfirmarRemocaoRegionalPopup;

}
