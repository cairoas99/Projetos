package bild.Obra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObraElementMap {

	// Detalhes

	@FindBy(xpath = "/html/body/div[1]/header/button")
	protected WebElement navigation;

	@FindBy(xpath = "//span[text()='Cadastros']")
	protected WebElement menuCadastros;

	@FindBy(xpath = "//span[text()='Obras']")
	protected WebElement menuObra;

	@FindBy(css = "[href='http://bildsys.fcmoreno.com.br/obras/create']")
	protected WebElement createObra;

	@FindBy(xpath = "//ul[@class='select2-selection__rendered']")
	protected WebElement usuariosNestaObra;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	protected WebElement usuarios;

	@FindBy(xpath = "//div[@class='select2-result-obj__title']")
	protected WebElement usuario;

	@FindBy(xpath = "//option[text()='Abacate da Pedreira (Macap�) - AP']")
	protected WebElement selecionarCidade;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	protected WebElement regional;

	@FindBy(xpath = "//option[text()='Franca']")
	protected WebElement selecionarRegional;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	protected WebElement padrao_empreendimento_id;

	@FindBy(xpath = "//option[text()='Branco']")
	protected WebElement selecionarPadraoEmpreendimento;

	@FindBy(xpath = "//*[@id=\"detalhes\"]/div[13]/button")
	protected WebElement btnAdicionarTorre;

	@FindBy(xpath = "//*[@id=\"torre1\"]/div/input[2]")
	protected WebElement informarTorre;

	// Administrativa

	@FindBy(css = "[href='#administrativa']")
	protected WebElement abaAdministrativa;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/form/div[3]/button")
	protected WebElement botaoSalvar;

	protected WebElement razao_social;

	protected WebElement inscricao_estadual;

	protected WebElement logradouro_faturamento;

	protected WebElement logradouro;

	protected WebElement adm_obra_nome;

	protected WebElement adm_obra_email;

	protected WebElement adm_obra_telefone;

	protected WebElement eng_obra_nome;

	protected WebElement eng_obra_email;

	protected WebElement eng_obra_telefone;

	protected WebElement horario_entrega_na_obra;

	protected WebElement referencias_bancarias;

	protected WebElement referencias_comerciais;

	protected WebElement nome;

	protected WebElement area_terreno;

	protected WebElement area_privativa;

	protected WebElement area_construida;

	protected WebElement eficiencia_projeto;

	protected WebElement num_apartamentos;

	protected WebElement num_pavimento_tipo;

	protected WebElement data_inicio;

	protected WebElement data_cliente;

	protected WebElement indice_bild_pre;

	protected WebElement indice_bild_oi;

	protected WebElement codigo_centro_de_custo;

	protected WebElement codigo_projeto_padrao;

	protected WebElement filial_id;

	// Importação
	@FindBy(xpath = "//li[@class='dropdown user user-menu']")
	protected WebElement dropDowAdministrativo;

	@FindBy(xpath = "/html/body/div[1]/header/nav/div/ul/li[2]/ul/li[2]/div[1]/a")
	protected WebElement administrativo;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[7]/a/span[1]")
	protected WebElement orcamento;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[7]/ul/li[2]/a/span")
	protected WebElement importacao;

	protected WebElement file;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	protected WebElement escolherObra;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	protected WebElement informarObra;

	@FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
	protected WebElement selecionarObraEscolhida;

	@FindBy(xpath = "//*[@id=\"tipo_orcamento\"]/span/span[1]/span")
	protected WebElement tipoOrcamento;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	protected WebElement selecionarTipoOrcamento;

	@FindBy(xpath = "//*[@id=\"select2-template_id-container\"]")
	protected WebElement template;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	protected WebElement selecionarTemplate;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/fieldset/div/div/div[4]/div[2]/button")
	protected WebElement btnSalvar;

	@FindBy(xpath = "//span[text()='BildDoc']")
	protected WebElement bildDocCronograma;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[1]/ul/li[2]/a")
	protected WebElement importarCronograma;

	@FindBy(xpath = "//*[@id=\"select2-obra_id-container\"]")
	protected WebElement obraCronograma;

	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	protected WebElement selecionarObraCronograma;

	@FindBy(xpath = "//*[@id=\"file\"]")
	protected WebElement fileArquivoCronograma;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[4]/a")
	protected WebElement cronogramaDeObras;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[8]/ul/li[8]/a")
	protected WebElement tarefaOrcamento;

	@FindBy(xpath = "//*[@id=\"carrinho\"]/ul/li/div/div/div/ins")
	protected WebElement checkObra;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/fieldset/div/div/div[3]/div[2]/button")
	protected WebElement btnSalvarImportacao;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/form/div/div/div/div/div/div[7]/button")
	protected WebElement btnRelacionarInsumos;

	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/section/ul/li[8]/a/span[1]")
	protected  WebElement menuPlanejamentoFisico;
}
