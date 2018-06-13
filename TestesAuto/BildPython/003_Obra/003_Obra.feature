@tag
Feature: Criar uma Obra

  Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

  Scenario: Criar uma obra para realizar os cenarios de teste
    Given acessei o menu Cadastros >> Obra
    And cadastrar nova obra
    When na tela de Obra eu informo os dados da Obra
    And na tela de Obra eu clico em salvar
    And na tela de importar orcamento
    And seleciono a obra para importacao
    And seleciono o arquivo de importacao
    And clico em importacao orcamento
    And acessar tela de Bild_Cronograma da Obra
    And selecionar a Obra para realizar o cronograma
    And selecioar o template do cronograma
    And selecionar o arquivo para importacao
    And acessar tela Cronograma da Obra e Relacionamento de orcamento
    And selecionar a Obra para fazer relacionamento
    And selecionar a tarefa da Obra
    And selecionar o grupo de insumos da obra
    And selecionar novo insumo da obra
    And relacionar obra a carteira
