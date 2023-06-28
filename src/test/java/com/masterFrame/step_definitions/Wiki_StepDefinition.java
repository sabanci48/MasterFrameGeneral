package com.masterFrame.step_definitions;



import com.masterFrame.pages.wikiPage.WikiResultPage;
import com.masterFrame.pages.wikiPage.WikiSearchPage;
import com.masterFrame.utilities.BrowserUtils;
import com.masterFrame.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinition {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchValue) {

        wikiSearchPage.wikiSearchBox.sendKeys(searchValue);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

        wikiSearchPage.wikiSearchButton.click();

    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String expectedTitle) {

        BrowserUtils.verifyTitleContains(expectedTitle);


    }

    WikiResultPage wikiResultPage = new WikiResultPage();
    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedMainHeader) {

        String actualHeaderText = wikiResultPage.mainHeader.getText();

        Assert.assertEquals(actualHeaderText,expectedMainHeader);

    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedImageHeader) {

        String actualImageHeader = wikiResultPage.mainImage.getText();

        Assert.assertTrue(actualImageHeader.equals(expectedImageHeader));

    }
}

