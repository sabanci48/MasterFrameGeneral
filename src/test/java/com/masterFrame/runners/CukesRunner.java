package com.masterFrame.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/masterFrame/step_definitions",
        dryRun = false,
        tags ="@B28G7-233",
        publish = true // generating report with public link
        // monochrome = true, changes color


)
public class CukesRunner {}

/*
This is a JUnit test runner class for executing Cucumber scenarios. It uses the Cucumber JUnit runner, which allows Cucumber scenarios to be executed as JUnit tests.

The class is annotated with @RunWith(Cucumber.class), which tells JUnit to use the Cucumber runner to execute the tests. The @CucumberOptions annotation provides configuration options for the Cucumber runner.

In this case, the plugin option is set to specify several different types of Cucumber reporting plugins that will generate reports after the tests have finished running. The plugins are:

pretty: prints the output of the test run in a readable format to the console
html:target/cucumber-reports.html: generates an HTML report of the test run and saves it to the target/cucumber-reports.html file
rerun:target/rerun.txt: generates a text file of the failed scenarios and saves it to the target/rerun.txt file, which can be used to re-run only the failed scenarios in a separate test run
me.jvt.cucumber.report.PrettyReports:target/cucumber: generates a custom HTML report with additional features and saves it to the target/cucumber directory
The features option is set to "src/test/resources/features", which specifies the directory where the feature files containing the Cucumber scenarios are located.

The glue option is set to "com/masterFrame/step_definitions", which specifies the package where the step definition classes for the scenarios are located.

The dryRun option is set to false, which means that the runner will execute the scenarios against the step definitions and fail if there are any undefined or pending steps.

The tags option is set to "", which means that no tags are used to filter the scenarios that are executed.

The publish option is set to true, which generates a report with a public link that can be shared with others.

Overall, this runner will execute all the scenarios in the src/test/resources/features directory against the step definitions defined in the com/masterFrame/step_definitions package, and generate several types of reports after the test run has completed.
 */