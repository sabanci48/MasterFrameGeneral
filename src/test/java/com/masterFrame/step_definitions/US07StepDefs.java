package com.masterFrame.step_definitions;




import com.masterFrame.pages.twilia.LoginPage;
import com.masterFrame.utilities.BrowserUtils;
import com.masterFrame.utilities.ConfigurationReader;
import com.masterFrame.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US07StepDefs {

    LoginPage loginPage = new LoginPage();
    List<WebElement> moduleList = new ArrayList<>();





    @Given("the event manager logged into the system")
    public void theEventManagerLoggedIntoTheSystem() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("events_crm_manager_username","events_crm_manager_password");
    }

    @And("the event manager should see {int} modules options")
    public void theEventManagerShouldSeeModulesOptions(int expectedModuleCount) {
        for (int i = 1; i < 16; i++) {
            WebElement listOfModule = Driver.getDriver().findElement(By.xpath("(//a)[" + i +"]"));
            moduleList.add(listOfModule);

            System.out.print(moduleList.size());


        }

        Assert.assertEquals(moduleList.size(), expectedModuleCount);
    }

    @When("the event manager clicks the module options")
    public void the_event_manager_clicks_the_module_options() {

    }
    @Then("actual titles should contain expected words below:")
    public void actual_titles_should_contain_expected_words_below(List<String> expectedTitle) {
        List<String> titleText = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        for (int i = 0; i < moduleList.size(); i++) {
            moduleList.get(i).click();
            wait.until(ExpectedConditions.titleContains(expectedTitle.get(i)));
            titleText.add(Driver.getDriver().getTitle());
        }
/*
        for (WebElement eachElement : moduleList) {
            BrowserUtils.sleep(2);
            eachElement.click();
            BrowserUtils.sleep(2);
            titleText.add(Driver.getDriver().getTitle());
            //BrowserUtils.sleep(2);
        }

 */
        System.out.println("titleText = " + titleText);
        //System.out.println(titleText.size());
        System.out.println(expectedTitle.size());

        for(int i = 0,j = 0 ; i < expectedTitle.size() ; i++,j++){

            Assert.assertTrue((titleText.get(i).contains(expectedTitle.get(j))));

        }



    }


}



