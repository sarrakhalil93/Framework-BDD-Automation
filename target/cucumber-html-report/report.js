$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentication/Authentication.feature");
formatter.feature({
  "line": 2,
  "name": "Authentication - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentication---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 2609114700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Vérifier l\u0027authentification",
  "description": "",
  "id": "authentication---orangehrm;vérifier-l\u0027authentification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "J\u0027ouvre l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisis le username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisis le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Redirection vers la page Home de l\u0027application OrangeHRM \"Welcome Paul\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationStepDefinition.jOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2957529700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 23
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisisLeUsername(String)"
});
formatter.result({
  "duration": 126037800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisisLeMotDePasse(String)"
});
formatter.result({
  "duration": 168734200,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 2989430200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Paul",
      "offset": 58
    }
  ],
  "location": "AuthenticationStepDefinition.redirectionVersLaPageHomeDeLApplicationOrangeHRM(String)"
});
formatter.result({
  "duration": 48991700,
  "status": "passed"
});
formatter.after({
  "duration": 1480760800,
  "status": "passed"
});
formatter.uri("module_buzz/buzz.feature");
formatter.feature({
  "line": 2,
  "name": "Module Buzz - OrangeHRM",
  "description": "En tant que utilisateur je souhaite vérifier le module buzz",
  "id": "module-buzz---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@buzz"
    }
  ]
});
formatter.before({
  "duration": 1708463400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "J\u0027ouvre l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisis le username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisis le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers la page Home de l\u0027application OrangeHRM \"Welcome Paul\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationStepDefinition.jOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2495499400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 23
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisisLeUsername(String)"
});
formatter.result({
  "duration": 77536300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisisLeMotDePasse(String)"
});
formatter.result({
  "duration": 80043300,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 2136793800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Paul",
      "offset": 58
    }
  ],
  "location": "AuthenticationStepDefinition.redirectionVersLaPageHomeDeLApplicationOrangeHRM(String)"
});
formatter.result({
  "duration": 934457800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Module Buzz - OrangeHRM",
  "description": "",
  "id": "module-buzz---orangehrm;module-buzz---orangehrm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Je clique sur le module Buzz",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Je saisis un message dans le champ Update status \"I do my homework\"",
  "keyword": "And "
});
formatter.match({
  "location": "ModuleBuzzStepDefinition.jeCliqueSurLeModuleBuzz()"
});
formatter.result({
  "duration": 4701791500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I do my homework",
      "offset": 50
    }
  ],
  "location": "ModuleBuzzStepDefinition.jeSaisisUnMessageDansLeChampUpdateStatus(String)"
});
formatter.result({
  "duration": 3106259400,
  "status": "passed"
});
formatter.after({
  "duration": 1460964900,
  "status": "passed"
});
});