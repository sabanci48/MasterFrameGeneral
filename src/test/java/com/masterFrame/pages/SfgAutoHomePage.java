package com.masterFrame.pages;

import com.masterFrame.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SfgAutoHomePage {

    public SfgAutoHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//input[@name='keyword']")
    public WebElement searchBox;

    @FindBy(linkText = "BROWSE INVENTORY")
    public WebElement inventoryTab;

        @FindBy(xpath = "//img[@title='navybluetrim-whitebg2']")
    public WebElement pre_qualified;
}
