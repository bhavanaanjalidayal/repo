package pages;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/datatable"
		,glue={"src/main/java/pages"}
		)
 
public class Runnerclass {
 
}
