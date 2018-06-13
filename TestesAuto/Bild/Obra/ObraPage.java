package bild.Obra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import bild.TestRule;
import bild.Login.LoginPage;

public class ObraPage extends ObraElementMap {

	Faker faker = new Faker();
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	String nomeDaObra;
	private static String variableYouWantToUse;

	public ObraPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		wait = new WebDriverWait(driver, 300);
		js = (JavascriptExecutor) driver;
	}

	public void acessarMenuCadastroObra() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");

		navigation.click();
		wait.until(ExpectedConditions.visibilityOf(menuCadastros));
		menuCadastros.click();

		wait.until(ExpectedConditions.visibilityOf(menuObra));
		menuObra.click();
	}

	public void cadastrarObra() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		createObra.click();
	}

	public void informarDadosDaObra() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		nome.sendKeys(faker.name().firstName());
		nomeDaObra = nome.getAttribute("value");
		variableYouWantToUse = nome.getAttribute("value");
		usuariosNestaObra.click();
		usuarios.sendKeys("Administrador");
		Thread.sleep(200);
		usuario.click();
		regional.click();
		selecionarRegional.click();
		padrao_empreendimento_id.click();
		selecionarPadraoEmpreendimento.click();
		area_terreno.sendKeys("1000");
		area_privativa.sendKeys("800");
		area_construida.sendKeys("500");
		eficiencia_projeto.sendKeys("9");
		num_apartamentos.sendKeys("22");
		num_pavimento_tipo.sendKeys("23");
		btnAdicionarTorre.click();
		informarTorre.sendKeys("T" + faker.name().prefix());
		data_inicio.sendKeys("01/01/2018");
		data_cliente.sendKeys("23/06/2020");
		indice_bild_pre.sendKeys("9");
		indice_bild_oi.sendKeys("7");

		// Aba Administrativa
		abaAdministrativa.click();
		razao_social.sendKeys("Construtora Civil " + faker.name().firstName());
		inscricao_estadual.sendKeys("Isento");
		logradouro_faturamento.sendKeys("Rua do Comércio nº 235, Centro, Franca - SP");
		logradouro.sendKeys("Avenida Presidente Vargas nº790, Vila Aparecida, Franca - SP");
		adm_obra_nome.sendKeys(faker.name().firstName());
		adm_obra_email.sendKeys(faker.internet().emailAddress());
		adm_obra_telefone.sendKeys(faker.phoneNumber().phoneNumber());
		eng_obra_nome.sendKeys(faker.name().firstName());
		eng_obra_email.sendKeys(faker.internet().emailAddress());
		eng_obra_telefone.sendKeys(faker.phoneNumber().cellPhone());
		horario_entrega_na_obra.sendKeys("07:45 - 10:50");
		referencias_bancarias.sendKeys("Satander, Banco do Brasil, Itau");
		referencias_comerciais.sendKeys("Cenafer, Tintas Silva");
		codigo_centro_de_custo.sendKeys("12");
		codigo_projeto_padrao.sendKeys("56");
		filial_id.sendKeys("12" + faker.number().hashCode());
		//checkBildDoc.click();
	}

	public void clicarEmSalvar() {
		js.executeScript("document.body.style.zoom='100%'");
		botaoSalvar.click();
	}

	public void acessarTelaDeImportarOrcamento() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		navigation.click();
		//js.executeScript("document.body.style.zoom='100%'");
		orcamento.click();
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(1000);
		importacao.click();
	}

	public void selecionaObraParaImportacao() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		escolherObra.click();
		informarObra.sendKeys(nomeDaObra);
		selecionarObraEscolhida.click();
		Thread.sleep(500);
		tipoOrcamento.click();
		selecionarTipoOrcamento.sendKeys("Orçamento inicial");
		Thread.sleep(500);
		selecionarTipoOrcamento.sendKeys(Keys.ENTER);
		template.click();
		Thread.sleep(500);
		selecionarTemplate.sendKeys("Orçamento inicial");
		selecionarTemplate.sendKeys(Keys.ENTER);
	}

	public void selecionarArquivoDeImportacao() throws InterruptedException {
		Thread.sleep(200);
		file.sendKeys("C://Users//Tiago Penha//Documents//Arquivos para teste//Miró (importação).csv");
	}

	public void salvarImportacaoOrcamento() throws InterruptedException {
		Thread.sleep(200);
		btnSalvar.click();
	}

	public void acessarBildCronograma() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='100%'");
		dropDowAdministrativo.click();
		administrativo.click();
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='100%'");
		bildDocCronograma.click();
		Thread.sleep(900);
		importarCronograma.click();
	}

	public void selecionarObraCronograma() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		obraCronograma.click();
		selecionarObraCronograma.clear();
		Thread.sleep(500);
		selecionarObraCronograma.sendKeys(nomeDaObra);
		selecionarObraCronograma.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void selecionarTemplateCronograma() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Select template = new Select(driver.findElement(By.id("template_id")));
		Thread.sleep(500);
		template.selectByIndex(1);
	}

	public void selecionarArquivodDeImportacao() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		fileArquivoCronograma.sendKeys("C://Users//Tiago Penha//Documents//Arquivos para teste//planejamentos (2).xlsx");
		Thread.sleep(2000);
		btnSalvarImportacao.click();
	}

	public void acessarCronogramaRelacionamentoOrcamento() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		navigation.click();
		Thread.sleep(3000);
		menuPlanejamentoFisico.click();
		Thread.sleep(1000);
		tarefaOrcamento.click();
	}

	public void selecionarObraRelacionamento() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		Select obra = new Select(driver.findElement(By.id("obra_id")));
		obra.selectByVisibleText(nomeDaObra);
	}

	public void selecionarTarefaDaObra() throws InterruptedException {
		Thread.sleep(1400);
		Select tarefaDaObra = new Select(driver.findElement(By.id("planejamento_id")));
		tarefaDaObra.selectByVisibleText("MOBILIZAÇÃO - 09/01/2017");
	}

	public void selecionarNovaTarefa() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		Select tarefaDaObra = new Select(driver.findElement(By.id("planejamento_id")));
		tarefaDaObra.selectByVisibleText("FUNDAÇÕES - 18/09/2017");
		this.selecionarInsumosDaObra();
	}

	public void selecionarInsumosDaObra() throws InterruptedException {
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2600);
		checkObra.click();
		btnRelacionarInsumos.click();		
	}

	public void relacionarObraCarteira() throws InterruptedException {
		/*js.executeScript("document.body.style.zoom='100%'");
		dropDowAdministrativo.click();
		administrativo.click();
		Thread.sleep(1000);
		menuBildDoc.click();
		Thread.sleep(1000);
		menuParametrizarCarteira.click();
		filtrarObra.sendKeys(nomeDaObra);
		filtrarObra.sendKeys(Keys.TAB);
		js.executeScript("document.body.style.zoom='100%'");

		//vincularTarefaSelecionada.click();
		//inputInformarCarteira.sendKeys("ACABAMENTO DE LAJE");

		WebElement results = driver.findElement(By.id("dataTableBuilder"));
		List<WebElement> tr_collection = results.findElements(By.xpath("id('dataTableBuilder')/tbody/tr"));
		
		for (WebElement trElement : tr_collection) {
		
		  js.executeScript("document.body.style.zoom='100%'"); 
		  WebElement td_collection = trElement.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr[1]/td[1]"));
		  
		  td_collection.click();
		  js.executeScript("document.body.style.zoom='100%'");
		  
		  //btnVincula.click();
		  
		  selecionarCarteira.click();
		  selecionarCarteira.sendKeys("ACABAMENTO DE LAJE");
		  selecionarCarteira.sendKeys(Keys.ENTER);
		  
		  Thread.sleep(3000);
		  
		  btnSalvarVinculaCarteira.click(); td_collection = trElement
		  .findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr/td[6]/a"));
		 

		 }
		
		inputInformarTarefa.sendKeys("MOBILIZAÇÃO");
		inputInformarTarefa.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		vincularCarteiraSelecionada.click();
		informarCarteira.sendKeys("ACABAMENTO DE LAJE");
		informarCarteira.sendKeys(Keys.ENTER);

		WebElement check1 = driver
				.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr[1]/td[1]/label/div/ins"));
		check1.click();
		vincular.click();

		js.executeScript("document.body.style.zoom='100%'");

		vincularCarteiraSelecionada.click();
		informarCarteira.sendKeys("AREIA");
		informarCarteira.sendKeys(Keys.ENTER);

		WebElement check2 = driver
				.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr[2]/td[1]/label/div/ins"));
		check2.click();
		vincular.click();

		js.executeScript("document.body.style.zoom='100%'");

		vincularCarteiraSelecionada.click();
		informarCarteira.sendKeys("FUNDAÇÃO (ESCAVADA; HÉLICE..)");
		informarCarteira.sendKeys(Keys.ENTER);

		WebElement check3 = driver
				.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr[3]/td[1]/label/div/ins"));
		check3.click();
		vincular.click();

		js.executeScript("document.body.style.zoom='100%'");

		vincularCarteiraSelecionada.click();
		informarCarteira.sendKeys("ARMAÇÃO FUNDAÇÃO (MO)");
		informarCarteira.sendKeys(Keys.ENTER);

		WebElement check4 = driver
				.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr[4]/td[1]/label/div/ins"));
		check4.click();
		vincular.click();

		js.executeScript("document.body.style.zoom='100%'");

		vincularCarteiraSelecionada.click();
		informarCarteira.sendKeys("SISTEMA EPA TORRE (EXAUSTÃO / PRESSURIZAÇÃO / AC)");
		informarCarteira.sendKeys(Keys.ENTER);

		WebElement check5 = driver
				.findElement(By.xpath("//*[@id=\"dataTableBuilder\"]/tbody/tr[4]/td[1]/label/div/ins"));
		check5.click();
		vincular.click();

		js.executeScript("document.body.style.zoom='100%'");*/

	}

	public static String getVariableYouWantToUse() {
		return variableYouWantToUse;
	}
}
