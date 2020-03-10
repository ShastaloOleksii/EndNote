package com.my.endnote.web.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.my.endnote.web.steps"},
        tags = "@CollectTabTests",
        dryRun = false,
        strict = true,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports"}

)
public class CollectTabRunnerTests {


}
