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
  "duration": 5022240705,
  "status": "passed"
});
formatter.before({
  "duration": 7144013043,
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
  "duration": 4882491482,
  "status": "passed"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_click_menu_item_politique()"
});
formatter.result({
  "duration": 1314799128,
  "status": "passed"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_click_Sport()"
});
formatter.result({
  "duration": 1429086598,
  "status": "passed"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_click_economie()"
});
formatter.result({
  "duration": 1587372491,
  "status": "passed"
});
formatter.match({
  "location": "JeuneAfriqueStartPageSteps.i_scroll_down_to_bottom()"
});
formatter.result({
  "duration": 449358379,
  "status": "passed"
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
  "duration": 7625704213,
  "status": "passed"
});
formatter.before({
  "duration": 7216829094,
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
  "name": "I select a country",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select an article",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select a topic",
  "keyword": "Then "
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_start_jeuneAfrique()"
});
formatter.result({
  "duration": 4239168217,
  "status": "passed"
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_click_les_pays()"
});
formatter.result({
  "duration": 639929276,
  "status": "passed"
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_select_a_country()"
});
formatter.result({
  "duration": 1042229179,
  "status": "passed"
});
formatter.match({
  "location": "ReadCountryArticleSteps.i_select_an_article()"
});
formatter.result({
  "duration": 39448451,
  "error_message": "org.openqa.selenium.InvalidSelectorException: Given css selector expression \"//*[@id\u003d\"main-lead-art\"]\" is invalid: InvalidSelectorError: \u0027//*[@id\u003d\"main-lead-art\"]\u0027 is not a valid selector: \"//*[@id\u003d\"main-lead-art\"]\"\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-RN5VIIS5\u0027, ip: \u0027192.168.142.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 65.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:geckodriverVersion: 0.23.0, moz:headless: false, moz:processID: 25040, moz:profile: C:\\Users\\Lenovo\\AppData\\Loc..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 04ae9780-aad9-476f-8889-910036be3dba\n*** Element info: {Using\u003dcss selector, value\u003d//*[@id\u003d\"main-lead-art\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat api.apps.jeuneafique.pages.CountriesPages.clickCountryMainArticle(CountriesPages.java:29)\r\n\tat testSteps.jeuneAfriqueTestSteps.ReadCountryArticleSteps.i_select_an_article(ReadCountryArticleSteps.java:70)\r\n\tat ✽.Then I select an article(readCountryNews.feature:9)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});