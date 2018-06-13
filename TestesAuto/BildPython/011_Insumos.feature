# new feature
# Tags: optional
    
Feature: Gestão de Insumos

Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

@Tag1
Scenario Outline: Adicionar Insumo
    Given entro na tela de Insumos
    And clico para adicionar um insumo
    And insiro os dados solicitados: <nome>, <unid. medida>, <codigo> e <grupo>
    And clico em Salvar o insumo
    And busco na tela de Insumos Solicitados o insumo que acabei de adicionar: <nome>
    And entro para visualizar o insumo que acabei de adicionar
    Then verifico se os dados do insumo que inseri estão corretos: <nome>, <unid. medida>, <codigo> e <grupo>

    Examples:
    |nome       |unid. medida |codigo |grupo            |
    |Cimento 5kg|Saco         |1122   |material cimento |


@Tag2
Scenario Outline: Editar Insumo
    Given seleciono um insumo na tela de insumos: <insumo para editar>
    And clico para editar este insumo
    Then edito as informacoes desejadas: <nome>, <unidade_medida>, <codigo> e <grupo>
    And clico para salvar a edição do insumo
    Then busco por este insumo que acabei de editar: <nome>
    And clico para visualizar este insumo
    Then verifico se as informacoes editadas estão corretas: <nome>, <unid. medida>, <codigo> e <grupo>

    Examples:
    |insumo para editar |nome |unidade_medida |codigo |grupo        |
    |Cimento 5kg        |Cal  |Kg             |19     |material cal |


@Tag3
Scenario Outline: Remover Insumo
    Given seleciono um insumo para remover: <nome>
    And clico para remover este insumo
    Then confirmo a remocao do insumo no popup
    Then o insumo nao pode existir: <nome>

    Examples:
    |nome        |
    |Cimento 5kg |