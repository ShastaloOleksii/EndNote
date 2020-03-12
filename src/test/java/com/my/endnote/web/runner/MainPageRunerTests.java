package com.my.endnote.web.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/my/endnote/web/tests",
        glue = {"com.my.endnote.web.steps"},
        tags = "@MainPageTest",
        dryRun = false,
        strict = true,
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        }
)

public class MainPageRunerTests {
}
