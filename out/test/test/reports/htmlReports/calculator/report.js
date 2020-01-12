$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/jeuneAfrique.feature");
formatter.feature({
  "line": 2,
  "name": "jeuneAfrique",
  "description": "",
  "id": "jeuneafrique",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "JeuneAfrique startPage",
  "description": "",
  "id": "jeuneafrique;jeuneafrique-startpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the startpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click Menu Item Politque",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Politique page is loaded",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});