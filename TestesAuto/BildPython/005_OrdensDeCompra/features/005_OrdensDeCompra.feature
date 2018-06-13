@tag
Feature: Gerenciar Ordens De Compra

   Background:
     Given Acesso o site "http://bildsys.mazzafc.tech/login"
     When Realizo login com email "admin@admin.com" e senha "admin"
     Then vou para home


  Scenario: Gerenciar Ordens De Compra
    Given acessar o menu Compra >> Ordens de Compra
    Then acesso calendario
    Then na tela calendario clico em ordens de compra
    Then na tela de Ordens de Compra eu clico para visualizar O.C
    Then vizualizando oc clico em editar
    Then na tela de Detalhe eu clico em Fechar O.C e confirmo

  #Scenario: Gerenciar Aprovacao Ordem De Compra
    Then volto para calendario
    Then busco pela situacao "em apr"
    Then na tela de Ordens de Compra eu clico para visualizar O.C2
    #Given Ordens de Compra em aprovacao
    #And pesquisar pela Obra em aprovacao
    #And visualizar O.C em Aprovacao
    #When na tela de Detalhe eu clico em Aprova O.C em aprovacao
    #And valida aprovacao
