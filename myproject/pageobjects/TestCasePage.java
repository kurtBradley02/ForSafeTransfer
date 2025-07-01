package com.myproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestCasePage {

    WebDriver driver;

    public TestCasePage(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
