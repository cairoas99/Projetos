@tag
Feature: Gerenciar Contrato

   Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

  @tag1
  Scenario: Gerenciar Contrato
    Given acessar a tela de Contrato
    And selecionar a obra
    When eu clicar para visualizar o contrato da obra
    And aprovar o contrato da obra
    Then selecionar o arquivo de contrato assinado
    And clicar em enviar e liberar
    And clicar para baixar contrato completo
    And clicar para baixar espelho do contrato
    And clicar para baixar minuta assinada pelo fornecedor

  @Tag2
  Scenario: Contrato Reapropriar insumo
    Given entro na tela de Contrato para reapropriar
    And busco pelo contrato para reapropriar
    Then clico para visualizar o contrato para reapropriar
    And clico para reapropriar o insumo
    Then seleciono um item para reapropriar
    And informo o destino da reapropriacao
    And defino a quantidade
    Then clico em salvar a reapropriacao
    And clico para confirmar a reapropriacao
    Then entro nas reapropriacoes
    And verifico se a reapropriacao existe
    And verifico se o valor foi removido do item reapropriado

  @Tag3
  Scenario: Contrato distrato de reapropriacao
    Given entro na tela de Contrato
    And busco pelo contrato para distratar
    Then clico para visualizar o contrato para distratar
    And clico para fazer um distrato
    And insiro a quantidade para distratar a reapropriacao
    Then clico em salvar o distrato da reapropriacao
    And clico para aprovar o distrato
    And confirmo a aprovacao do distrato
    And entro na tela de distrato
    Then verifico se o valor voltou para o item de origem da reapropriacao

  @Tag4
  Scenario: Contrato reajuste de reapropriacao
    Given entro na tela de Contrato
    And busco pelo contrato para reajustar reapropriacao
    Then clico para visualizar o contrato para reajustar reapropriacao
    And clico para fazer um reajuste
    And insiro o valor a ser adicionado no item
    And clico em salvar o reajuste
    Then clico para aprovar o reajuste
    And entro na tela de reapropriacao
    Then verifico se o valor foi removido do item de origem e inserido no item destino