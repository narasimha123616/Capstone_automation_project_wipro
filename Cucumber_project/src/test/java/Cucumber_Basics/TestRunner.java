package Cucumber_Basics;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Ebayfeatures",
    glue = {"Cucumber_Basics"},
    plugin = {
        "pretty",
        "html:target/HTML/htmlreport.html",
        "json:target/JSON/jsonreport.json",
        "junit:target/JUNIT/junitreport.xml"
    }
)
public class TestRunner {
}

