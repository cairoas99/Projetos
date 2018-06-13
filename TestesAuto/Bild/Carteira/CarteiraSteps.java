package bild.Carteira;

import bild.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;

public class CarteiraSteps {

    //Scenario: Criar Carteira

    @Before
    @Given("acesso a tela de manutenção das carteiras")
    public void acessarTelaCarteiras() {
        CarteiraPage carteira = new CarteiraPage();
        carteira.acessarTelaCarteiras();
        Utils.logPrint("Carteira", "Acessando tela de Carteiras");
    }

    @And("clicar para adicionar uma carteira")
    public void clicarAdicionarCarteira() {
        CarteiraPage carteira = new CarteiraPage();
        carteira.clicarAdicionarCarteira();
        Utils.logPrint("Carteira", "Cliquei para adicionar uma Carteira");
    }


    @When("no formulário de criação de carteira todos os dados serao preenchidos: (.*), (.*) e (.*)")
    public void informarDadosCarteira(String strNome, String strComprador, String strEqualizacao) {
        CarteiraPage carteira = new CarteiraPage();
        carteira.informarDadosCarteira(strNome, strComprador, strEqualizacao);
        Utils.logPrint("Carteira", "Dados inseridos no formulario");
    }

    @And("clico em salvar carteira")
    public void clicarSalvarCarteira() {
        CarteiraPage carteira = new CarteiraPage();
        carteira.clicarSalvarCarteira();
    }


    @Then("a mensagem de Carteira criada com sucesso deve aparecer")
    public void verificarMensagemCarteiraCriadaComSucesso() {
        CarteiraPage carteira = new CarteiraPage();
        Utils.logPrint("Carteira", carteira.verificarMensagemCarteiraCriadaComSucesso() ?
                "Exibiu mensagem: Carteira criada com sucesso" :
                "NÃO exibiu mensagem: Carteira criada com sucesso");
    }


    //Scenario: Editar carteira  ------------------------------------------------------------------------------------

    //@Given ("acesso a tela de manutenção de carteiras")

    @And("escolho a carteira (.*) para editar")
    public void escolherCarteiraParaEditar(String strNome) throws InterruptedException {
        acessarTelaCarteiras();
        CarteiraPage carteira = new CarteiraPage();
        carteira.buscarCarteira(strNome);
    }

    @And("clico no botão de editar correspondente a esta carteira")
    public void clicarBotaoEditarCarteira() {
        CarteiraPage carteira = new CarteiraPage();
        carteira.clicarBotaoEditarCarteira();
        Utils.logPrint("Carteira", "Clicou em editar carteira");
    }

    @Then("altero os dados na tela de edição: (.*), (.*) e (.*)")
    public void alterarDadosCarteira(String strNome, String strComprador, String strEqualizacao) throws InterruptedException {
        CarteiraPage carteira = new CarteiraPage();
        carteira.alterarDadosCarteira(strNome, strComprador, strEqualizacao);
        Utils.Wait(3);
        Utils.logPrint("Carteira", "Dados da carteira editados");
    }

    @And("clico em salvar a edição da carteira")
    public void clicarSalvarEdicaoCarteira() {
        CarteiraPage carteira = new CarteiraPage();
        carteira.clicarSalvarEdicaoCarteira();
    }

    @Then("verifico se a mensagem Carteira atualizado com sucesso. apareceu")
    public void verificarMensagemAtualizacaoCarteira() {
        CarteiraPage carteira = new CarteiraPage();
        carteira.verificarMensagemAtualizacaoCarteira();//verificar esse metodo ----------------------
        Utils.logPrint("Carteira", "Verificando mensagem de sucesso");
    }

    @And("clico no botao para visualizar a carteira que editei: (.*)")
    public void visualizarCarteiraEditada(String strNome) throws InterruptedException {
        CarteiraPage carteira = new CarteiraPage();
        carteira.visualizarCarteiraEditada(strNome);
    }

    @Then("verifico se os dados alterados estão corretos: (.*), (.*) e (.*)")
    public void verificarDadosAlterados(String strNome, String strComprador, String strEqualizacao) throws InterruptedException {
        CarteiraPage carteira = new CarteiraPage();
        String c = carteira.verificarDadosAlterados(strNome, strComprador, strEqualizacao);
        StringBuilder tituloLog = new StringBuilder();
        tituloLog.append("Verificando Dados alterados: ");
        tituloLog.append(c);
        Utils.logPrint("Carteira", tituloLog.toString());
    }


    //Scenario: Excluir carteira ----------------------------------------------

    @Given ("escolho a carteira para remover: (.*)")
    public void buscarCarteiraParaRemover(String strNome) throws InterruptedException {
        acessarTelaCarteiras();
        CarteiraPage carteira = new CarteiraPage();
        carteira.buscarCarteira(strNome);
        Utils.logPrint("Carteira", "Buscando carteira para remover");
    }

    @And ("clico no botão para remover a carteira")
    public void clicarRemoverCarteira(){
        CarteiraPage carteira = new CarteiraPage();
        carteira.clicarRemoverCarteira();
        Utils.logPrint("Carteira", "Clicando para remover carteira");
    }

    @Then ("confirmo a remocao da carteira no popup")
    public void confirmarRemocaoCarteiraNoPopup(){
        CarteiraPage carteira = new CarteiraPage();
        carteira.confirmarRemocaoCarteiraNoPopup();
        Utils.logPrint("Carteira", "Confirmando remoção no popup");
    }

    @When ("busco novamente pela carteira: (.*)")
    public void buscarNovamenteCarteiraRemovida(String strNome) throws InterruptedException {
        CarteiraPage carteira = new CarteiraPage();
        carteira.buscarCarteira(strNome);
        Utils.logPrint("Carteira", "Buscando pela carteira removida");
    }

    @Then ("a carteira nao pode existir: (.*)")
    public void verificarSeCarteiraFoiRemovida(String strNome) throws InterruptedException {
        CarteiraPage carteira = new CarteiraPage();
        carteira.verificarSeCarteiraFoiRemovida(strNome);
        Utils.logPrint("Carteira", "Verificando se carteira foi removida");
    }
}