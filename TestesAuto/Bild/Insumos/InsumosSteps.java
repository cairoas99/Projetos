package bild.Insumos;

import bild.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.rmi.CORBA.Util;

public class InsumosSteps {

    private InsumosPage insumos = new InsumosPage();

    @Given("entro na tela de Insumos")
    public void entrarTelaInsumos() throws InterruptedException {
        InsumosPage insumos = new InsumosPage();
        insumos.entrarTelaInsumos();
        Utils.logPrint("Insumos", "Entrando na tela de insumos");
    }

    @And("clico para adicionar um insumo")
    public void clicarAdicionarInsumo() throws InterruptedException {
        insumos.clicarAdicionarInsumo();
    }

    @And ("insiro os dados solicitados: (.*), (.*), (.*) e (.*)")
    public void inserirDadosInsumo(String nome, String unid_medida, String codigo, String grupo) throws InterruptedException {
        insumos.inserirDadosInsumo(nome, unid_medida, codigo, grupo);
        Utils.logPrint("Insumos", "Dados do insumos inseridos no form");
    }

    @And ("clico em Salvar o insumo")
    public void clicarSalvarInsumo(){
        insumos.clicarSalvarInsumo();

    }

    @And("busco na tela de Insumos Solicitados o insumo que acabei de adicionar: (.*)")
    public void buscarInsumoRecemInserido(String nome) throws InterruptedException {
        insumos.buscarInsumoRecemInserido(nome);
    }

    @And ("entro para visualizar o insumo que acabei de adicionar")
    public void visualizarInsumo() throws InterruptedException {
        insumos.clicarVisualizarInsumo();
        Utils.logPrint("Insumos", "visualizando insumo recem inserido");
    }

    @Then ("verifico se os dados do insumo que inseri estão corretos: (.*), (.*), (.*) e (.*)")
    public void verificarDadosInsumoInserido(String nome, String unid_medida, String codigo, String grupo) throws InterruptedException {
        insumos.verificarDadosInsumoInserido(nome, unid_medida, codigo, grupo);
        Utils.logPrint("Insumos","Verificando insumo inserido");
    }


    //EDIÇÂO ----------------------------------------------------------------------------------------------

    @Given ("seleciono um insumo na tela de insumos: (.*)")
    public void buscarInsumoParaEditar(String strNome) throws InterruptedException {
        insumos.buscarInsumoParaEditar(strNome);
        Utils.logPrint("insumos","Buscando insumo para editar");
    }

    @And ("clico para editar este insumo")
    public void clicarEditarInsumo() throws InterruptedException {
        insumos.clicarEditarInsumo();
    }

    @Then ("edito as informacoes desejadas: (.*), (.*), (.*) e (.*)")
    public void editarInformacoesInsumo(String strNome, String strUnidadeMedida, String strCodigo, String strGrupo) throws InterruptedException {
        insumos.editarInformacoesInsumo(strNome, strUnidadeMedida, strCodigo, strGrupo);
        Utils.logPrint("Insumos","Editando dados do insumo");
    }

    @And ("clico para salvar a edição do insumo")
    public void clicarSalvarEdicaoInsumo(){
        insumos.clicarSalvarEdicaoInsumo();
    }

    @Then ("busco por este insumo que acabei de editar: (.*)")
    public void buscarInsumoEditado(String strNome){
        insumos.buscarInsumoEditado(strNome);
        Utils.logPrint("Insumos","Buscando insumo editado para verificar");
    }

    @And ("clico para visualizar este insumo")
    public void clicarVisualizarInsumoEditado(){
        insumos.clicarVisualizarInsumoEditado();
    }

    @Then ("verifico se as informacoes editadas estão corretas: (.*), (.*), (.*), e (.*)")
    public void verificarInformacoesEditadasInsumo(String strNome, String strUnidadeMedida, String strCodigo, String strGrupo) throws InterruptedException {
        insumos.verificarInformacoesEditadasInsumo(strNome, strUnidadeMedida, strCodigo, strGrupo);
        Utils.logPrint("INsumos","Verificando se os dados foram editados corretamente");
    }


    //Scenário: Remoção de Insumo --------------------------------------------------------------------------------------------------

    @Given ("seleciono um insumo para remover: (.*)")
    public void buscarInsumoParaRemover(String strNome) throws InterruptedException {
        insumos.buscarInsumoParaEditar(strNome);
    }

    @And ("clico para remover este insumo")
    public void clicarRemoverInsumo() throws InterruptedException {
        insumos.clicarRemoverInsumo();
    }

    @Then ("confirmo a remocao do insumo no popup")
    public void confirmarRemocaoInsumoPopup() throws InterruptedException {
        insumos.confirmarRemocaoInsumoPopup();
    }

    @Then ("o insumo nao pode existir: (.*)")
    public void verificarSeInsumoFoiRemovido(String strNome) throws InterruptedException {
        insumos.verificarSeInsumoFoiRemovido(strNome);
    }

}
