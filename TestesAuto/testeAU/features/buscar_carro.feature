#Features do Behave (.feature)
Feature: Buscar carros no google

  Scenario: buscar carro Gol com sucesso
    Given acesso o site de buscas "https://www.google.com/"
    And busco pelo modelo "moto" de carro
    Then clico para ver as imagens do carro
    Then clico na primeira imagem
    Then abro o link da imagem

