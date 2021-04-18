$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConnexionXLSX.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@excel"
    }
  ]
});
formatter.before({
  "duration": 2585059500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "J\u0027ouvre l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I sign in from XLSX",
  "keyword": "When "
});
formatter.match({
  "location": "AuthenticationStepDefinition.jOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2874189600,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1569305000,
  "status": "passed"
});
});