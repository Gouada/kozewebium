package testRunners;

import static core.Constants.HTML_RESULT_FOLDER;
import static core.Constants.JSON_RESULT_FOLDER;
import static core.Constants.XML_RESULT_FOLDER;
import static core.Constants.JEUNEAFRIQUE_FEATURE;
import static core.Constants.JEUNEAFRIQUE_STEPS_DEFINITIONS;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:" + HTML_RESULT_FOLDER + "/jeuneAfrique",
		"json:" + JSON_RESULT_FOLDER + "/jeuneAfrique.json",
		"junit:" + XML_RESULT_FOLDER
				+ "/jeuneAfrique.xml" }, features = JEUNEAFRIQUE_FEATURE, glue = JEUNEAFRIQUE_STEPS_DEFINITIONS, tags= {"@jeuneafrique"})
public class jeuneAfriqueRunner {
}
