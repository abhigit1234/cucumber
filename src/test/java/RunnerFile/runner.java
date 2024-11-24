package RunnerFile;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(			
			features = "src/test/resources/Features/re.feature",
			glue = "StepFile",
			tags = "",
			dryRun = false,
			monochrome = true,
			plugin = {"rerun:failedfile/text.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}			
			)


public class runner {

}

/*
 * @ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value
 * = "false")
 * 
 * @ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value =
 * "pretty,json:Reports/one.json,html:Reports/two.html,junit:Reports/three.xml")
 * 
 * @ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "")
 * 
 * @ConfigurationParameter(key =
 * Constants.EXECUTION_MODE_FEATURE_PROPERTY_NAME,value = "concurrent")
 * 
 * @ConfigurationParameter(key =
 * Constants.PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME,value = "true")
 * //------------This is compulsory for parallel scenarios----------------
 * 
 * @ConfigurationParameter(key =
 * Constants.PARALLEL_CONFIG_STRATEGY_PROPERTY_NAME,value = "fixed")
 * 
 * @ConfigurationParameter(key =
 * Constants.PARALLEL_CONFIG_FIXED_MAX_POOL_SIZE_PROPERTY_NAME,value = "2")
 * 
 * @ConfigurationParameter(key =
 * Constants.PARALLEL_CONFIG_FIXED_PARALLELISM_PROPERTY_NAME,value = "2")
 */

