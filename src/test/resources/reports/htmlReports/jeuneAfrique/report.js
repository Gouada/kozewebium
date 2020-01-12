$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("jeuneAfrique.feature");
formatter.feature({
  "line": 2,
  "name": "jeuneAfrique",
  "description": "",
  "id": "jeuneafrique",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@jeuneafrique"
    }
  ]
});
formatter.before({
  "duration": 12156434100,
  "status": "passed"
});
formatter.before({
  "duration": 9569413200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "JeuneAfrique startPage",
  "description": "",
  "id": "jeuneafrique;jeuneafrique-startpage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@jeuneafrique"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the startpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click Menu Item Politque",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click Sport",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click Economie",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I scroll down to bottom",
  "keyword": "Then "
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_am_on_the_startpage()"
});
formatter.result({
  "duration": 126025500,
  "error_message": "java.lang.NullPointerException\r\n\tat testSteps.jeuneAfriqueTestSteps.JeuneAfriqueStartPageSteps.i_am_on_the_startpage(JeuneAfriqueStartPageSteps.java:52)\r\n\tat ✽.Given I am on the startpage(jeuneAfrique.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_click_menu_item_politique()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_click_Sport()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_click_economie()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_scroll_down_to_bottom()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 689000,
  "error_message": "java.lang.NullPointerException\r\n\tat testSteps.jeuneAfriqueTestSteps.JeuneAfriqueStartPageSteps.finish(JeuneAfriqueStartPageSteps.java:90)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.uri("readCountryNews.feature");
formatter.feature({
  "line": 2,
  "name": "jeuneafrique",
  "description": "",
  "id": "jeuneafrique",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@jeuneafrique"
    }
  ]
});
formatter.before({
  "duration": 9634335900,
  "status": "passed"
});
formatter.before({
  "duration": 9664312200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "readCountryNews",
  "description": "",
  "id": "jeuneafrique;readcountrynews",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@jeuneafrique"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I start jeuneAfrique",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I clcick les pays",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I select a from most visited countries",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click country main article",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I go back to country page",
  "keyword": "Then "
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_start_jeuneAfrique()"
});
formatter.result({
  "duration": 4388430400,
  "error_message": "java.lang.NullPointerException\r\n\tat testSteps.jeuneAfriqueTestSteps.ReadCountryArticleSteps.i_start_jeuneAfrique(ReadCountryArticleSteps.java:43)\r\n\tat ✽.Given I start jeuneAfrique(readCountryNews.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_click_les_pays()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_select_a_from_most_visited_countries()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_click_country_main_article()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_go_back_to_country_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 87500,
  "error_message": "java.lang.NullPointerException\r\n\tat testSteps.jeuneAfriqueTestSteps.JeuneAfriqueStartPageSteps.finish(JeuneAfriqueStartPageSteps.java:90)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
});