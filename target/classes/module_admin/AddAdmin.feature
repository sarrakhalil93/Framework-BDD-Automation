@admin
Feature: Ajouter Admin- OrangeHRM
  
  En tant que utilisateur je souhaite ajouter des admins dans la liste system users

  Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"

  Scenario Outline: Ajouter admin - OrangeHRM
    When Je clique sur le module Admin
    And Je clique sur le bouton Add
    And Je saisis le champ Employee Name "<employee>"
    And Je saisis le champ Username "<username>"
    And Je saisis le champ Password "<password>"
    And Je saisis le champ Confirm Password "<confirmPassword>"
    And Je clique sur le bouton save

    #And Je remplis le formulaire User System "<employee>" et "<username>" et "<password>" et "<confirmPassword>"
    Examples: 
      | employee | username | password  | confirmPassword |
      | Aaliyah    | Khelil231   | sarra123  | sarra123        |
    #  | Sarra    | Khelil   | sarra123  | sarra123        |
    #  | Wissal   | Argoubi  | wissal123 | wissal123       |
   #   | Zied     | Hannachi | zied123   | zied123         |
    #  | Sahar    | Mili     | sahar123  | sahar123        |
