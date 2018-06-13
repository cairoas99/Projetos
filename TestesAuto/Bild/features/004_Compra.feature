@tag
Feature: Criar Orcamento para Obra

   Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

  Scenario: Criar Orcamento para Obra
    Given acessei o menu Compras >> Calendario de Compras
    And na tela de Calendario eu seleciono a Obra
    And na tela de Calendario eu clico em Comprar
    When na tela de Comprar Insumos eu clico em comprar saldo de todos insumos
    And na tela de ordem de compra eu clico em Fechar O.C
    And quando aparecer alert eu confirmo a compra
