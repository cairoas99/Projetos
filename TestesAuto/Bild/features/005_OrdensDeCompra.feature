@tag
Feature: Gerenciar Ordens De Compra

   Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

  @tag1
  Scenario: Gerenciar Ordens De Compra
    Given acessar o menu Compra >> Ordens de Compra
    And na tela de Ordens de Compra eu pesquiso pela Obra
    And na tela de Ordens de Compra eu clico para visualizar O.C
    When na tela de Detalhe eu clico em Fechar O.C
    And confirmo a operacao

  @tag2
  Scenario: Gerenciar Aprovacao Ordem De Compra
    Given Ordens de Compra em aprovacao
    And pesquisar pela Obra em aprovacao
    And visualizar O.C em Aprovacao
    When na tela de Detalhe eu clico em Aprova O.C em aprovacao
    And valida aprovacao
