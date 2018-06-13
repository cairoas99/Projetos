#Features do Behave (.feature)
Feature: Elo7

  Scenario: buscar com sucesso
    Given acesso o site "https:\\google.com"
    And busco por "mouse e teclado sem fio"
    Then clico em shopping
    Then mostro em formato de grade
