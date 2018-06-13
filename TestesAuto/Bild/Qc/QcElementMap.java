package bild.Qc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QcElementMap {

	@FindBy(xpath = "/html/body/div[1]/header/button")
	protected WebElement menuHamburger;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[3]/a")
	protected WebElement menuSuprimentos;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[3]/ul/li[9]")
	protected WebElement submenuQC;

	//@FindBy(css = "[href='http://bildsys.fcmoreno.com.br/ordens-de-compra/insumos-aprovados']")
	@FindBy(xpath = "/html/body/div[1]/div/section/a")
	protected WebElement btnCriarNovoQuadro;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div[3]/div/span/span[1]/span/ul/li/input")
	protected WebElement inputSelecionarObra;

	@FindBy(xpath = "//input[@class='item_checks']")
	protected WebElement checkInsumo;

	@FindBy(xpath = "/html/body/div[1]/div/div/form/div[2]/div/button")
	protected WebElement btnCriarQC;

	//@FindBy(xpath = "//span[@class='select2-selection__rendered']")
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[1]/div/div[1]/div/div[2]/span/span[1]/span")
	protected WebElement selecionarFornecedores;

	//@FindBy(xpath = "//input[@class='select2-search__field']")
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	protected WebElement informarFornecedor;

	@FindBy(xpath = "//div[@class='select2-result-obj__title']")
	protected WebElement confirmarFornecedor;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[2]/div/div[1]/ul/li[1]/div/ins")
	protected WebElement checkEqualizacaoTecnica;

	@FindBy(xpath = "//span[@class='col-md-8 text-left']")
	protected WebElement templateDeMinuta;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	protected WebElement informarTemplateDeMinuta;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[9]/button[1]")
	protected WebElement btnSalvar;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[9]/button[3]")
	protected WebElement btnEnviarValidacao;

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[2]/input")
	protected WebElement inputFiltrarObra;

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[3]/input")
	protected WebElement inputFiltrarStatus;

	@FindBy(xpath = "//a[@class='btn btn-warning btn-xs']")
    protected WebElement btnEditarQC;

	@FindBy(xpath = "//button[@name='fechar_qc']")
	protected WebElement btnFecharOc;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	protected WebElement btnAprovarQC;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnConfirmarAprovacaoQC;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/button")
	protected WebElement btnAbrirConcorrencia;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnConfirmarAberturaOcorrencia;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnOkConfirmacaoAberturaOcorrencia;

	@FindBy(xpath = "/html/body/div[1]/div/section/div/a")
	protected WebElement btnLancarValores;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[1]/div/div/span/span[1]/span")
	protected WebElement fornecedor;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[2]/div/table/tbody/tr/td[7]/div/input")
	protected WebElement valorUnitario;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[1]/div/div[2]/div[1]/div/div/label[1]")
    protected WebElement radioFreteNaoSeAplica;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[2]/div/div[2]/div[1]/div/div/div/input")
	protected WebElement porcentagemMaoDeObra;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[2]/div/div[2]/div[2]/div/div/div/input")
	protected WebElement porcentagemMaterialDaContratada;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[2]/div/div[2]/div[3]/div/div/div/input")
	protected WebElement porcentagemFaturamentoDireto;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[2]/div/div[2]/div[4]/div/div/div/input")
	protected WebElement porcentagemLocacao;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[3]/div[3]/div/div[2]/div[1]/div/label")
	protected WebElement tipoNfMaterial;

	@FindBy(xpath = "//*[@id=\"informar-valores-form\"]/div[4]/div[5]/span/span[1]/span")
    protected WebElement condicaoPagamento;

	@FindBy(id = "save")
	protected WebElement btnSalvarValoresFornecedor;

	@FindBy(xpath = "/html/body/div[8]/div[7]/div/button")
	protected WebElement btnConfirmarSalvamentoValoresFornecedores;

	@FindBy(xpath = "//*[@id=\"dataTableBuilder\"]/tfoot/tr/th[1]/input")
	protected WebElement inputBuscaCodigoQc;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-ok']")
	protected WebElement btnAvaliarQC;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/section/button")
	protected WebElement btnInformarVencedor;

	@FindBy(xpath = "//*[@id=\"form-finalizar\"]/div[2]/div[1]/h3/button")
	protected WebElement btnSuperiorFinalizarQC;

	@FindBy(xpath = "//*[@id=\"form-finalizar\"]/div[2]/div[2]/table/tbody/tr[1]/th/table/tbody/tr/td[2]/div/label/input")
	protected WebElement radioValorTotal;

	@FindBy(id = "finalizar")
	protected WebElement btnInferiorFinalizarQC;

	@FindBy(xpath = "/html/body/div[9]/div[7]/div/button")
	protected WebElement btnConfirmarFinalizacaoQcPopup;

	@FindBy(name = "CAMPO_EXTRA[ANOS_DE_GARANTIA_DOS_MATERIAIS_NUMERO]")
	protected WebElement inputDiasPagamentoNumero;

	@FindBy(name = "CAMPO_EXTRA[DIAS_PAGAMENTO_POR_EXTENSO]")
	protected WebElement inputDiasPagamentoExtenso;

	@FindBy(name = "CAMPO_EXTRA[MESES_VALIDADE_NUMERO]")
	protected WebElement inputMesesValidadeNumero;

	@FindBy(name = "CAMPO_EXTRA[MESES_VALIDADE_EXTENSO]")
	protected WebElement inputMesesValidadeExtenso;

	@FindBy(name = "CAMPO_EXTRA[ANOS_GARANTIA_MATERIAIS]")
	protected WebElement inputAnosGarantia;

	@FindBy(name = "CAMPO_EXTRA[DETALHAMENTO_DO_PRECO]")
	protected WebElement inputDetalhamentoPreco;

	@FindBy(xpath = "//button[@class='btn btn-block  btn-success ']")
	protected WebElement btnGerarContrato;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/a")
	protected WebElement btnVoltarDaFinalizacaoParaListagemQc;

	@FindBy(xpath = "//a[@class='btn btn-xs btn-success']")
	protected WebElement btnGerarImprimirContrato;

	@FindBy(xpath = "//a[@class='btn btn-link  btn-block']")
	protected WebElement linkAvaliarMinutaContrato;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	protected WebElement btnAprovarMinuta;

	protected WebElement checkUncheckAll;
}
