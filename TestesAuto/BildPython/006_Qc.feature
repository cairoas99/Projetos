@tag
Feature: Criar quadro de concorrencia

   Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

  @tag1
  Scenario: Criar Q.C
    Given acesso o menu Suprimentos >> Q.C
    And clico em criar novo quadro de concorrencia
    #And escolha a obra
    When na tela seleciono os insumos para criar o quadro de concorrencia
    And clico em criar q.c
    And seleciono os fornecedores
    And seleciono a equalizacao tecnica
    And seleciono o template de minuta
    And seleciono os insumos da QC
    #And clico em salvar QC
    Given enviar para validacao
    Then aprovar Q.C concorrencia
    And clico e confirmo para abrir concorrencia
    And clico em Lancar Valores
    Then seleciono o fornecedor, valor unitario, tipo de frete, porcentagens, tipo da NF, equalizacao tecnica, condicao de pagamento
    And clico para salvar os valores do fornecedor
    Then busco pela QC recem criada
    And clico para avaliar a QC
    And clico para informar vencedor
    And clico para finalizar QC
    And clico para confirmar a finalizacao de QC
    And preencho os campos de condicoes comerciais
    And clico para gerar contrato
    And verifico se o contrato foi gerado #-----
    Then clico para visualizar a minuta de contrato
    And clico para aprovar a minuta

