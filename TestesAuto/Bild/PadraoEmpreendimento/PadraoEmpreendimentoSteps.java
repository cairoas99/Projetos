package bild.PadraoEmpreendimento;

import com.sun.webkit.WebPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PadraoEmpreendimentoSteps {

    private PadraoEmpreendimentoPage padraoEmpreendimento = new PadraoEmpreendimentoPage();

    //Scenario: Adicionar Padrao Empreendimento

    @Given("entro na tela de padroes de empreendimento")
    public void entrarTelaPadraoEmpreendimento(){
        padraoEmpreendimento.entrarTelaPadraoEmpreendimento();
    }

    @And("clico para adicionar um novo padrao de empreendimento")
    public void clicarAdicionarPadraoEmpreendimento() throws InterruptedException {
        padraoEmpreendimento.clicarAdicionarPadraoEmpreendimento();
    }

    @Then("preencho os campos necessários para criar o novo padrao de empreendimento: (.*)")
    public void informaDadosPadraoEmpreendimento(String strNome){
        padraoEmpreendimento.informaDadosPadraoEmpreendimento(strNome);
    }

    @And ("clico em salvar o padrao de empreendimento")
    public void clicarSalvvarCriacaoPadraoEmpreendimento(){
        padraoEmpreendimento.clicarSalvarPadraoEmpreendimento();
    }

    @Then ("busco pelo padrao de empreendimento criado: (.*)")
    public void buscarPadraoEmpreendimento(String strNome){
        padraoEmpreendimento.buscarPadraoEmpreendimento(strNome);
    }

    @And ("clico para visualizar o padrao de empreendimento criado")
    public void clicarVisualizarPadraoEmpreendimento(){
        padraoEmpreendimento.clicarVisualizarPadraoEmpreendimento();
    }

    @Then ("verifico se o padrao de empreendimento criado esta com as informacoes corretas: (.*)")
    public void verificarDadosPadraoEmpreendimento(String strNome){
        padraoEmpreendimento.verificarDadosPadraoEmpreendimento(strNome);
    }

    //Scenario: Editar Padroa Empreendimento

    @And ("busco pelo padrao de empreendimento para editar: (.*)")
    public void buscarPadraoEmpreendimentoParaEditar(String strNome){
        padraoEmpreendimento.entrarTelaPadraoEmpreendimento();
        padraoEmpreendimento.buscarPadraoEmpreendimento(strNome);
    }

    @Then ("clico para editar esse Padrao de Empreendimento")
    public void clicarEditarPadraoEmpreendimento(){
        padraoEmpreendimento.clicarEditarPadraoEmpreendimento();
    }

    @And ("insiro as novas informacoes do Padrao de Empreendimento: (.*)")
    public void inserirInformacoesEdicaoPadraoEmpreendimento(String strNome){
        padraoEmpreendimento.inserirInformacoesEdicaoPadraoEmpreendimento(strNome);
    }

    @Then ("clico em salvar a edicao do Padrao de Empreendimento")
    public void clicarSalvarEdicaoPadraoEmpreendimento(){
        padraoEmpreendimento.clicarSalvarEdicaoPadraoEmpreendimento();
    }

    @Then ("busco pelo Padrao Empreendimento que foi editado: (.*)")
    public void buscarPadraoEmpreendimentoEditado(String strNome){
        padraoEmpreendimento.buscarPadraoEmpreendimento(strNome);
    }

    @And ("clico para visualizar o padrao de empreendimento editado")
    public void clicarVisualizarPadraoEmpreendimentoEditado(){
        padraoEmpreendimento.clicarVisualizarPadraoEmpreendimentoEditado();
    }

    @Then ("verifico se o padrao de empreendimento editado esta com as informacoes corretas: (.*)")
    public void verificarDadosEditadosPadraoEmpreendimento(String strNome){
        padraoEmpreendimento.verificarDadosEditadosPadraoEmpreendimento(strNome);
    }


    //Scenario Remocao de Padrao de Empreendimento

    @Given ("busco pelo Padrao de Empreendimento para remover: (.*)")
    public void buscarPadraoEmpreendimentoParaRemover(String strNome){
        padraoEmpreendimento.buscarPadraoEmpreendimentoParaRemover(strNome);
    }

    @And ("clico no botao de remover o Padrao de Empreendimento")
    public void clicarBotaoRemoverPadraoEmpreendimento(){
        padraoEmpreendimento.clicarBotaoRemoverPadraoEmpreendimento();
    }

    @And ("confirmo a remocao do Padrao de Empreendimento no popup")
    public void confirmarRemocaoPadraoEmpreendimentoPopup(){
        padraoEmpreendimento.confirmarRemocaoPadraoEmpreendimentoPopup();
    }

    @Then ("busco pelo Padrao de Empreendimento que acabei de remover: (.*)")
    public void buscarPadraoEmpreendimentoRemovido(String strNome){
        padraoEmpreendimento.buscarPadraoEmpreendimentoRemovido(strNome);
    }

    @And ("me certifico de que ele não existe mais: (.*)")
    public void verificarRemocaoPadraoEmpreendimento(String strNome){
        padraoEmpreendimento.verificarRemocaoPadraoEmpreendimento(strNome);
    }

}
