import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/cucumber-report/cucumber.json",
        tags = "@first",
        glue = {"stepdefs"},
        features = {"src/test/resources/Test.feature"}
)
public class TestRunner {
}
