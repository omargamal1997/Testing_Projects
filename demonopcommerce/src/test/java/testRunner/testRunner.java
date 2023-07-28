package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDef"},
        tags = "@login2"
)
public class testRunner extends AbstractTestNGCucumberTests {

}
