package bild.Regionais;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegionaisSteps{

    RegionaisPage regional = new RegionaisPage();

    //Scenario: A dicionar Regional------------------------------------------------------------------

    @Given ("entro na tela de Regionais")
    public void entrarTelaRegionais(){
        regional.entrarTelaRegionais();
    }

    @Then ("clico no botão para adicionar uma nova Regional")
    public void clicarBotaoAdicionarRegional(){
        regional.clicarBotaoAdicionarRegional();
    }

    @And ("insiro as informacoes necessarias para criar uma Regional: (.*)")
    public void inserirInformacoesCriarRegional(String strNome){
        regional.inserirInformacoesRegional(strNome);
    }

    @And ("clico em salvar a Regional")
    public void clicarSalvarRegional(){
        regional.clicarSalvarRegional();
    }

    @Then ("busco pela Regional recem inserida: (.*)")
    public void buscarRegional(String strNome){
        regional.buscarRegional(strNome);
    }

    @And ("clico para visualizar essa Regional recem inserida")
    public void clicarVisualizarRegional(){
        regional.clicarVisualizarRegional();
    }

    @Then ("verifico se os dados inseridos estao corretos: (.*)")
    public void verificarDadosInseridos(String strNome){
        regional.verificarDadosRegional(strNome);
    }




    //Scenario: Editar Regional---------------------------------------------------------------------


    @Given ("entro na tela de Regional' para poder editar")
    public void entrarTelaRegionaisParaEditar(){
        regional.entrarTelaRegionais();
    }

    @And ("busco pela Regional que desejo editar: (.*)")
    public void buscarRegionalParaEditar(String strNome){
        regional.buscarRegional(strNome);
    }

    @And ("clico no botão para editar a Regional")
    public void clicarEditarRegional(){
        regional.clicarEditarRegional();
    }

    @Then ("insiro os novos dados para esta Regional: (.*)")
    public void inserirNovosDadosRegional(String strNome){
        regional.inserirNovosDadosRegional(strNome);
    }

    @And ("clico em salvar a edicao da Regional")
    public void clicarSalvarEdicaoRegional(){
        regional.clicarSalvarRegional();
    }

    @Then ("busco pela Regional recem editada: (.*)")
    public void buscarRegionalEditada(String strNome){
        regional.buscarRegional(strNome);
    }

    @And ("clico para visualizar a Regional")
    public void clicarVisualizarRegionalEditada(){
        regional.clicarVisualizarRegional();
    }

    @Then ("verifico se os dados editados estao corretos: (.*)")
    public void verificarDadosEditadosRegional(String strNome){
        regional.verificarDadosRegional(strNome);
    }


    //Scenario: Remover Regional-------------------------------------------------------------------------

    @Given ("entro na listagem de regionais para remover uma regional")
    public void entrarListagemRegionaisParaRemover(){
        regional.entrarTelaRegionais();
    }

    @And ("procuro pela regional para remover: (.*)")
    public void buscarRegionalParaRemover(String strNome){
        regional.buscarRegional(strNome);
    }

    @Then ("clico para remover a regional")
    public void clicarRemoverRegional(){
        regional.clicarRemoverRegional();
    }

    @And ("confirmo a remocao no popup")
    public void confirmarRemocaoRegionalPopup(){
        regional.confirmarRemocaoRegionalPopup();
    }

    @Then ("busco novamente pela regional excluida: (.*)")
    public void buscarPelaRegionalRemovida(String strNome){
        regional.buscarRegional(strNome);
    }

    @And ("verifico se ela ja nao existe mais: (.*)")
    public void verificarRemocaoDaRegional(String strNome){
        regional.verificarRemocaoDaRegional(strNome);
    }

}
