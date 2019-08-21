package com.schoology.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumber_reports",
                    "json:target/cucumber.json",
                    "junit:target/cucumber_reports/cucumber.xml"},
            tags = {"@trials" },
            //these have to be package or class path?????????????
            features = "src/test/resources/features",
            glue = {"com/schoology/step_definitions"},
            monochrome = true,
            strict = true,
            dryRun = false

    )

    public class CukesRunner {
}
