@buzz
Feature: Module Buzz - OrangeHRM
  En tant que utilisateur je souhaite vérifier le module buzz

  Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"

  Scenario: Module Buzz - OrangeHRM
    When Je clique sur le module Buzz
    And Je saisis un message dans le champ Update status "I do my homework" 
