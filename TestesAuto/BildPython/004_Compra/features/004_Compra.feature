@tag
Feature: Criar Orcamento para Obra

   Background:


  Scenario: Criar Orcamento para Obra

    Given Acesso o site "http://bildsys.mazzafc.tech/login"
    When Realizo login com email "admin@admin.com" e senha "admin"

    Then vou para home

    Then acessei o menu Compras >> Calendario de Compras
    Then acesso calendario
    Then na tela de Comprar Insumos seleciono a obra "isla"
    Then na tela de Comprar Insumos clico em comprar
    Then na tela de insumos clico em comprar saldo de todos insumos
    Then na tela de oc clico em fechar oc
    Then no PopUp de confirmação clico em sim
