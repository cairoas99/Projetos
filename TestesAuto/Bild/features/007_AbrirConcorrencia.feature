@tag
Feature: Abrir Concorrencia

   Background:
      Given Eu entro na pagina de login
      When Envio o email e senha do usuario
      Then Eu devo estar logado

@tag1
Scenario: Abrir Concorrencia
    Given na tela de QC pesquisar pela obra para abrir concorrencia
    And na tela de QC informo o nome da obra e o status
    When na tela de obra clicar no botao Abrir Concorrencia
    And confirmo que quero iniciar a concorrencia
    And confirmo novamente
    Then na tela de QC clicar no botao Informar valores
    And na tela de informar valores seleciono os fornecedores
    And informo os valores unitario
    And informo o tipo de frete
    And informo os valores de porcentagem
    And informo o tipo de nota
    And afirmar que estou ciente
    And informo a condicao de pagamento
    And salvar abertura de quadro de concorrencia
    And avaliar quadro de concorrencia
    And informar vencedor ou nova rodada
    And finalizar quadro de concorrencia
    And informo as conficoes comerciais
    And clico em gerar contrato deste fornecedor
    And gerar imprimir contrato
    And clicar em exibir contrato
    And clicar em aprovar contrato do QC
    And confirmar aprovacao do contrato do QC
