package com.masterFrame.step_definitions;

import com.masterFrame.pages.SfgAutoHomePage;
import com.masterFrame.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;

public class SfgAuto_steps {
SfgAutoHomePage sfgAutoHomePage = new SfgAutoHomePage();
    @Given("user is on the sfg auto page")
    public void user_is_on_the_sfg_auto_page() {
        Driver.getDriver().get("https://www.sfgauto.com");
    }
    @And("user clicks on browse inventory tab")
    public void userClicksOnBrowseInventoryTab() {
       sfgAutoHomePage.inventoryTab.click();
    }
    @When("user enters {string} in the searchBox")
    public void userEntersInTheSearchBox(String car) {
        sfgAutoHomePage.searchBox.sendKeys(car);
    }
    @Then("user should see get pre-qualified img in the result")
    public void userShouldSeeGetPreQualifiedImgInTheResult() {

        Assert.assertTrue(sfgAutoHomePage.pre_qualified.isDisplayed());
    }



}
