package jenkinstest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports"
        },
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features",
        glue = {"jenkinstest.steps"},
        tags = {"@JenkinsTest"}
)
public class CucumberTestRunner { }