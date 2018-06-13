@tag
Feature: Cadastrar Fornecedor

   Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

  @tag1
  Scenario: Cadastrar Fornecedor
    Given acessar a tela de Fornecedor
    And clicar no botao Novo de Fornecedor
    When na tela de cadastro Fornecedor informo os dados
    Then clico no botao Salvar Fornecedor
