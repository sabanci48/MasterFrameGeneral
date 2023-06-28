package com.masterFrame.pages.wikiPage;



import com.masterFrame.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[id='searchInput']")
    public WebElement wikiSearchBox;

    @FindBy(css = "button[class='pure-button pure-button-primary-progressive']")
    public WebElement wikiSearchButton;



}
