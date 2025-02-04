package jenkinstest.steps;

import io.cucumber.java.en.When;

public class JenkinsTestSteps {

    @When("I say hello")
    public void i_say_hello() {
        System.out.println("Hello, Jenkins!");
    }
}