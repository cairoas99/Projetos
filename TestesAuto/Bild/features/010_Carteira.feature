# new feature
# Tags: optional

@Tag
Feature: Gerenciar Carteiras

Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

@Tag1
Scenario Outline: Criar Carteira
    Given acesso a tela de manutenção das carteiras
    And clicar para adicionar uma carteira
    When no formulário de criação de carteira todos os dados serao preenchidos: <nome>, <comprador> e <equalizacao>
    And clico em salvar carteira
    Then a mensagem de Carteira criada com sucesso deve aparecer

    Examples:
    |nome        |comprador      |equalizacao  |
    |Cart. Teste |Danilo Freitas |teste        |

@Tag2
Scenario Outline: Editar Carteira
    Given escolho a carteira CarteiraTeste2 para editar
    And clico no botão de editar correspondente a esta carteira
    Then altero os dados na tela de edição: <nome>, <comprador> e <equalizacao>
    And clico em salvar a edição da carteira
    Then verifico se a mensagem Carteira atualizado com sucesso. apareceu
    And clico no botao para visualizar a carteira que editei: <nome>
    Then verifico se os dados alterados estão corretos: <nome>, <comprador> e <equalizacao>

    Examples:
        |nome                  |comprador      |equalizacao  |
        |Nome Cart. Atualizado |Fausto Morais  |phj          |

@Tag3
Scenario Outline: Excluir carteira
    Given escolho a carteira para remover: <nome>
    And clico no botão para remover a carteira
    Then confirmo a remocao da carteira no popup
    When busco novamente pela carteira: <nome>
    Then a carteira nao pode existir: <nome>

    Examples:
    |nome         |
    |CarteiraTeste|