package bild.Qc;

import bild.TestRule;
import bild.Utils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QcPage extends QcElementMap {

	WebDriver driver;
	JavascriptExecutor js;
	String obra;
	private int idQC;

	public QcPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;
	}

	public void acessarMenuSuprimentosQC(String nomeDaObra){
		js.executeScript("document.body.style.zoom='100%'");

		menuHamburger.click();
		Utils.sleep(2000);

		menuSuprimentos.click();
		Utils.sleep(2000);
		obra = nomeDaObra;
		submenuQC.click();
	}

	public void criarQuadrodeConcorrencia() {
		js.executeScript("document.body.style.zoom='100%'");
		Utils.sleep(2000);
		btnCriarNovoQuadro.click();
	}

	public void escolherObra(){
		js.executeScript("document.body.style.zoom='100%'");

		//List<WebElement> li = driver.findElements(By.xpath("//input[@class='form-control']"));
		//li.get(3).clear();
		//li.get(3).click();
		//li.get(3).sendKeys(obra);
		//li.get(3).sendKeys(Keys.TAB);

		Utils.sleep(2000);
		inputSelecionarObra.clear();
		inputSelecionarObra.sendKeys("Chadrick");
		Utils.sleep(2000);
		inputSelecionarObra.sendKeys(Keys.ENTER);
	}

	public void selecionarInsumos(){
		// List<WebElement> rows =
		// driver.findElements(By.xpath(".//table[@id='dataTableBuilder']/tbody/tr"));
		js.executeScript("document.body.style.zoom='100%'");
		checkInsumo.click();
	}

	public void clicarEmCriarQC(){
		js.executeScript("document.body.style.zoom='100%'");
		btnCriarQC.click();
	}

	public void selecionarFornecedores(){
		js.executeScript("document.body.style.zoom='100%'");

		Utils.sleep(2000);
		selecionarFornecedores.click();
		//Actions actions = new Actions(driver);
		//actions.moveToElement(informarFornecedor);
		//informarFornecedor.click();
		Utils.sleep(2000);
		informarFornecedor.sendKeys("Votoratim Siderurgica S.A");
		Utils.sleep(3000);
		informarFornecedor.sendKeys(Keys.ENTER);
		//actions.build().perform();

		//confirmarFornecedor.click();
		// informarFornecedor.sendKeys(Keys.ENTER);

	}

	public void selecionarEqualizacaoTecnica(){
		js.executeScript("document.body.style.zoom='100%'");
		//WebElement checkEqualizacaoTecnica = driver.findElement(By.id("filter_tipoEqualizacaoTecnica_1"));
        //checkEqualizacaoTecnica.isSelected();
        checkEqualizacaoTecnica.click();
	}

	public void selecionarTemplateDeMinuta(){
		js.executeScript("document.body.style.zoom='100%'");

		templateDeMinuta.click();
		informarTemplateDeMinuta.sendKeys("Minuta");
		Utils.sleep(3000);
		informarTemplateDeMinuta.sendKeys(Keys.ENTER);
	}

	public void selecionarInsumosDaQC(){
		js.executeScript("document.body.style.zoom='100%'");

		Utils.sleep(3000);
		List<WebElement> tabelaInsumos = driver.findElements(By.xpath("//table[@id='dataTableBuilder']/tbody/tr"));

		for (WebElement insumos : tabelaInsumos) {
		    Utils.sleep(2000);
		    insumos.findElement(By.xpath("//input[@class='qc_item_checks']")).click();
		    Utils.sleep(2000);
		}
	}

	public void clicarEmSalvar(){
		js.executeScript("document.body.style.zoom='100%'");
		btnSalvar.click();
	}

	public void enviarParaValidacao(){
		js.executeScript("document.body.style.zoom='100%'");
		Utils.sleep(2000);
        btnEnviarValidacao.click();
	}

	public void aprovarQC(){
		js.executeScript("document.body.style.zoom='100%'");

		btnEditarQC.click();

        pegarIdQc();

		Utils.sleep(3000);
		btnAprovarQC.click();
		Utils.sleep(2000);
		btnConfirmarAprovacaoQC.click();
		Utils.sleep(2000);
        driver.navigate().refresh();
        Utils.sleep(2000);
	}

	public void filtrarObra(String status) {
        js.executeScript("document.body.style.zoom='100%'");
        inputFiltrarStatus.sendKeys(status);
        inputFiltrarStatus.sendKeys(Keys.ENTER);
        Utils.sleep(3000);
    }

    public void clicarAbrirConcorrencia(){
	    btnAbrirConcorrencia.click();
	    Utils.sleep(1000);
        btnConfirmarAprovacaoQC.click();
        Utils.sleep(1000);
        btnOkConfirmacaoAberturaOcorrencia.click();
    }

    public void clicarLancarValores(){
	    Utils.sleep(2000);
        btnLancarValores.click();
    }

    public void inserirDadosQC(){
	    Utils.sleep(2000);
        fornecedor.click();
        fornecedor.sendKeys(Keys.ENTER);

        Utils.sleep(2000);
        valorUnitario.sendKeys("300");
        radioFreteNaoSeAplica.click();

        Utils.sleep(2000);
        porcentagemMaoDeObra.sendKeys("1000");
        porcentagemMaterialDaContratada.sendKeys("1000");
        porcentagemFaturamentoDireto.sendKeys("1000");
        porcentagemLocacao.sendKeys("7000");

        Utils.sleep(2000);
        tipoNfMaterial.click();

        aceitarItensEqualizacaoTecnica();

        Utils.sleep(2000);
        condicaoPagamento.click();
        Utils.sleep(2000);
        condicaoPagamento.sendKeys(Keys.ENTER);
    }

    public void clicarSalvarValoresFornecedor(){
        Utils.sleep(1000);
        btnSalvarValoresFornecedor.click();
        Utils.sleep(1000);
        btnConfirmarSalvamentoValoresFornecedores.click();
    }

    public void buscarQcRecemCriada(){
        inputBuscaCodigoQc.sendKeys(Integer.toString(idQC));
        inputBuscaCodigoQc.sendKeys(Keys.ENTER);
    }

    public void avaliarQC(){
	    Utils.sleep(3000);
        btnAvaliarQC.click();
    }

    public void informarVencedor(){
        btnInformarVencedor.click();
    }

    public void finalizarQC(){
	    Utils.sleep(3000);
	    btnSuperiorFinalizarQC.click();
	    Utils.sleep(2000);
	    radioValorTotal.click();
	    Utils.sleep(2000);
	    btnInferiorFinalizarQC.click();
    }

    public void confirmarFinalizacaoQC(){
	    Utils.sleep(2000);
        btnConfirmarFinalizacaoQcPopup.click();
    }

    public void preencherCondicoesComerciais(){
	    Utils.sleep(3000);
	    inputDiasPagamentoNumero.sendKeys("10");
        inputDiasPagamentoExtenso.sendKeys("Dez");
        inputMesesValidadeNumero.sendKeys("20");
        inputMesesValidadeExtenso.sendKeys("Vinte");
        inputAnosGarantia.sendKeys("2");
        inputDetalhamentoPreco.sendKeys("300000");
    }

    public void gerarContrato(){
        btnGerarContrato.click();
    }

    public void verificarContratoGerado(){
        btnVoltarDaFinalizacaoParaListagemQc.click();
        btnGerarImprimirContrato.click();
	    Utils.sleep(2000);
        Assert.assertTrue("QC não finalizado", driver.findElements(By.xpath("//div[@class='alert alert-warning alert-dismissible']")).size() == 1);
    }

    public void clicarVisualizarMinutaContrato(){
	    Utils.sleep(2000);
        linkAvaliarMinutaContrato.click();
    }

    public void clicarAprovarMinuta(){
	    Utils.sleep(2000);
        btnAprovarMinuta.click();
    }




    //Método auxiliar para dar check em todos os itens do setor de Equalizacao Técnica
    private void aceitarItensEqualizacaoTecnica(){
	    List<WebElement> listaItensEqualizacaoTecnica = driver.findElements(By.xpath
                ("//*[@id=\"informar-valores-form\"]/div[4]/div[2]/div/div[2]/table/tbody"));
        int contadorElementosLista = 1;
	    for(WebElement itemEqualizacaoTecnica : listaItensEqualizacaoTecnica){
	        if (itemEqualizacaoTecnica.getText().contains("ESTOU CIENTE")){
	            driver.findElement(By.xpath
                        ("//*[@id=\"informar-valores-form\"]/div[4]/div[2]/div/div[2]/table/tbody/tr[" +
                                contadorElementosLista +"]/td[3]/div/label/div/ins")).click();
                contadorElementosLista += 1;
            }
            else if (!itemEqualizacaoTecnica.getText().contains("ESTOU CIENTE")){
                driver.findElement(By.xpath
                        ("//*[@id=\"informar-valores-form\"]/div[4]/div[2]/div/div[2]/table/tbody/tr[" +
                                contadorElementosLista + "]/td[3]/label[1]/div/ins")).click();
                contadorElementosLista += 1;
            }
        }
    }

    //Método auxiliar para pegar a ID da QC em um momento específico
    private int pegarIdQc() {
        return idQC = Integer.parseInt(driver.findElement(By.xpath("/html/body/div[1]/div/section/h1")).
                getText().substring(driver.findElement(By.xpath("/html/body/div[1]/div/section/h1")).
                getText().lastIndexOf(' ') + 1));
    }
}
