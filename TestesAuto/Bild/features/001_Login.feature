@tag
Feature: Login no Sistema
  
  Scenario: Realizar login no sistema BildSys

        Given Acesso o site "http://bildsys.mazzafc.tech/login"
        When Realizo login com email "admin@admin.com" e senha "admin"
        #Then Eu devo estar logado
