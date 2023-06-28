package com.masterFrame.step_definitions;


import com.masterFrame.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Scanner;

/*
In this class we will be able to create "pre" and "post" condition for ALL the SCENARIOS and even steps.
 */

public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before
    public void setupMethod() {
        System.out.println(" ---> RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void tearDownMethod(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println(" ---> RUNNING AFTER EACH SCENARIO");

        Driver.closeDriver();
    }





    // @BeforeStep
    public void setupStep(){
        System.out.println("------>@BeforeStep : Running before each step");
    }

    // @AfterStep
    public void teardownStep(){
        System.out.println("--------> @AfterStep : Running after each step!");
    }




}
/*
This is a Java class that contains "hooks" or "before and after" methods that will be executed before and after
 each scenario in the Cucumber test suite. The purpose of these methods is to provide setup and teardown actions
 that are necessary for the proper execution of the test scenarios. The methods perform actions such as printing
 messages to the console, taking screenshots, and closing the browser window.
 */