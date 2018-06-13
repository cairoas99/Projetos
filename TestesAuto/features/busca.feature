#Features do Behave (.feature)
Feature: Elo7

  Scenario: buscar com sucesso
    Given acesso o site "https://www.elo7.com.br/"
    And busco por "placa"
    Then filtro por frete gratis
    Then pego a quantidade de resultados
    Then clico em um produto
    Then mando para o carrinho
    Then calculo o frete "14403130"
    Then remove o produto
    Then retorno para o inicio
    Then clica para cadastrar
    Then cadastro nome: "Teste Auto" email: "sucavihey@storiqax.top" senha: "password123"