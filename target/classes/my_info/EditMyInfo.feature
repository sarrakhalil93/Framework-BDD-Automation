@tag
Feature: Editer my info

En tant que utilisateur je souhaite ajouter des infos 

Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"
    When Je clique sur le module MyInfo

  @myInfo1
  Scenario: Editer personal details
    And Je clique sur le bouton Edit
    And Je saisis le champ middle name "khalil" 
    And Je clique sur le bouton saveEdition
    
  @myInfo2
  Scenario: Editer custom fields
    And Je clique sur le bouton EditBlood
    And Je sélectionne le champ blood type "A+" 
    And Je clique sur le bouton saveBlood Type
    
   @myInfo3
  Scenario: Uploader fichier
    And Je clique sur le bouton AddFile
    And Je clique sur le bouton  ChoisirFile via
  #  And J'uploade le fichier via "C:\\Users\\skhalil\\Desktop\\formation selenium\\test.png" 
    And Je clique sur le bouton upload
    
 
    