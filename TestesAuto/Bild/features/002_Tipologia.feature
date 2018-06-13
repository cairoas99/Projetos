@tag
Feature: Cadastro de Tipologia

  Scenario: Inserir uma Tipologia
    Given Acesso o site "http://bildsys.mazzafc.tech/login"
    When Realizo login com email "admin@admin.com" e senha "admin"

    #Then acessei o menu Administrativo
    Then acesso tela de tipologia
    Then adiciono tipologia "teste"
    #Then na tela de Tipologia clico em Salv