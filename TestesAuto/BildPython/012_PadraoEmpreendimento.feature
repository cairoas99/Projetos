# new feature
# Tags: optional
    
Feature: Gestao de Padrao de Empreendimento

Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

@Tag1
Scenario Outline: Adicionar Padrão de Empreendimento
    Given entro na tela de padroes de empreendimento
    And clico para adicionar um novo padrao de empreendimento
    Then preencho os campos necessários para criar o novo padrao de empreendimento: <nome>
    And clico em salvar o padrao de empreendimento
    Then busco pelo padrao de empreendimento criado: <nome>
    And clico para visualizar o padrao de empreendimento criado
    Then verifico se o padrao de empreendimento criado esta com as informacoes corretas: <nome>

    Examples:
    |nome     |
    |Padrao 1 |

@Tag2
Scenario Outline: Editar Padrao de Empreendimento
    And busco pelo padrao de empreendimento para editar: <padrao empreendimento para editrar>
    Then clico para editar esse Padrao de Empreendimento
    And insiro as novas informacoes do Padrao de Empreendimento: <padrao empreendimento editado>
    Then clico em salvar a edicao do Padrao de Empreendimento
    Then busco pelo Padrao Empreendimento que foi editado: <padrao empreendimento editado>
    And clico para visualizar o padrao de empreendimento editado
    Then verifico se o padrao de empreendimento editado esta com as informacoes corretas: <padrao empreendimento editado>

    Examples:
    |padrao empreendimento para editrar |padrao empreendimento editado |
    |Padrao 1                           |Padrao Editado                |


@Tag3
Scenario Outline: Remover Padrao de Empreendimento
    Given busco pelo Padrao de Empreendimento para remover: <padrao empreendimento para remover>
    And clico no botao de remover o Padrao de Empreendimento
    And confirmo a remocao do Padrao de Empreendimento no popup
    Then busco pelo Padrao de Empreendimento que acabei de remover: <padrao empreendimento para remover>
    And me certifico de que ele não existe mais: <padrao empreendimento para remover>

    Examples:
    |padrao empreendimento para remover |
    |Padrao 1                           |