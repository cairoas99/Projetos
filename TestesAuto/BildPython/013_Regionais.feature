# new feature
# Tags: optional
    
Feature: Gerenciamento de Regionais

Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

@Tag1
Scenario Outline: Adicionar Regional
    Given entro na tela de Regionais
    Then clico no botão para adicionar uma nova Regional
    And insiro as informacoes necessarias para criar uma Regional: <nome>
    And clico em salvar a Regional
    Then busco pela Regional recem inserida: <nome>
    And clico para visualizar essa Regional recem inserida
    Then verifico se os dados inseridos estao corretos: <nome>

    Examples:
    |nome             |
    |Regional Ibiraci |

@Tag2
Scenario Outline: Editar Regional
    Given entro na tela de Regionais para poder editar
    And busco pela Regional que desejo editar: <nome>
    And clico no botão para editar a Regional
    Then insiro os novos dados para esta Regional: <novo nome>
    And clico em salvar a edicao da Regional
    Then busco pela Regional recem editada: <novo nome>
    And clico para visualizar a Regional
    Then verifico se os dados editados estao corretos: <novo nome>

    Examples:
    |nome             |novo nome         |
    |Regional Ibiraci |Regional Claraval |

@Tag3
Scenario Outline:
    Given entro na listagem de regionais para remover uma regional
    And procuro pela regional para remover: <nome>
    Then clico para remover a regional
    And confirmo a remocao no popup
    Then busco novamente pela regional excluida: <nome>
    And verifico se ela ja nao existe mais: <nome>

    Examples:
    |nome              |
    |Regional Claraval |
