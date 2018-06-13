package bild.AbrirConcorrencia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbrirConcorrenciaElementMap {

	@FindBy(xpath = "//a[@class='sidebar-toggle']")
	protected WebElement navigation;

	@FindBy(xpath = "//span[text()='Suprimentos']")
	protected WebElement menuSuprimentos;

	@FindBy(css = "[href='http://bildsys.fcmoreno.com.br/quadro-de-concorrencia']")
	protected WebElement menuQC;

	@FindBy(xpath = "//button[@class='btn btn-xs btn-success']")
	protected WebElement btnAbrirConcorrencia;

	@FindBy(xpath = "//button[text()='Sim, inicie a concorr�ncia!']")
	protected WebElement btnSimIniciarConcorrencia;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnOk;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[1]/div/div/span/span[1]/span")
	protected WebElement selecionarFornecedor;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	protected WebElement informarFornecedor;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[2]/div/div[2]/div[1]/div/div/div/input")
	protected WebElement servicoMaoDeObra;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[2]/div/div[2]/div[2]/div/div/div/input")
	protected WebElement servicoContratada;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[1]/div/div[2]/div[1]/div[1]/div/label[1]/div/ins")
	protected WebElement frete;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[3]/div/div[2]/div[2]/div/label/div/ins")
	protected WebElement nota;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[4]/div[2]/div/div[2]/table/tbody/tr/td[3]/div/label/div/ins")
	protected WebElement estouCiente;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[4]/div[5]/span/span[1]/span")
	protected WebElement condicaoDePagamento;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	protected WebElement informarCondicao;

	@FindBy(xpath = "//*[@id=\"save\"]")
	protected WebElement btnSalvar;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnSalvarPrecos;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/section/button")
	protected WebElement bntVencedorOuNovaRodada;

	@FindBy(xpath = "//*[@id=\"form-finalizar\"]/div[2]/div[1]/h3/button")
	protected WebElement finalizarQC;

	@FindBy(xpath = "//input[@class='icheck_destroy']")
	protected WebElement marcarDesmarcarTudo;

	@FindBy(xpath = "//*[@id=\"finalizar\"]")
	protected WebElement finalizar;
	
	@FindBy(xpath = "/html/body/div[9]/div[7]/div/button")
	protected WebElement confirmarFinalizar;
	
	@FindBy(xpath = "//input[@name='CAMPO_EXTRA[ANOS_DE_GARANTIA_DOS_MATERIAIS_NUMERO]']")
	protected WebElement txtDiasDePagamentoNumero;
	
	@FindBy(xpath = "//input[@name='CAMPO_EXTRA[DIAS_PAGAMENTO_POR_EXTENSO]']")
	protected WebElement txtDiasDePagamentoExtenso;
	
	@FindBy(xpath = "//input[@name='CAMPO_EXTRA[MESES_VALIDADE_NUMERO]']")
	protected WebElement txtMesesValidadeNumero;
	
	@FindBy(xpath = "//input[@name='CAMPO_EXTRA[MESES_VALIDADE_EXTENSO]']")
	protected WebElement txtMesesValidadeExtenso;
	
	@FindBy(xpath = "//input[@name='CAMPO_EXTRA[ANOS_GARANTIA_MATERIAIS]']")
	protected WebElement txtAnosDeGarantia;
	
	@FindBy(xpath = "//input[@name='CAMPO_EXTRA[DETALHAMENTO_DO_PRECO]']")
	protected WebElement txtDetalhamentoPreco;
	
	@FindBy(xpath = "//button[@class='btn btn-block btn-flat btn-success btn-lg']")
	protected WebElement btnGerarContrato;
	
	@FindBy(xpath = "//a[@class='btnExibirContrato']")
	protected WebElement btnExibirContrato;
	
	@FindBy(xpath = "//button[text()='Aprovar Contrato']")
	protected WebElement btnAprovarContrato;
	
	@FindBy(xpath = "//button[@class='confirm']")
	protected WebElement confirmarContrato;
}
