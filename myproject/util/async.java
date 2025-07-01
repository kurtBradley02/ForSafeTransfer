package com.myproject.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class async {

    public static void explicitWait(WebDriver driver, WebElement elem){

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(200));
		wait.until(d -> elem.isDisplayed());
		wait.until(ExpectedConditions.elementToBeClickable(elem));

    }

    public static void explicitWait(WebDriver driver, WebElement elem, int duration){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(d -> elem.isDisplayed());
    }

    public static void explicitWait(WebDriver driver, WebElement elem, String text){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(elem, text));
    }

    public static void alertWait(WebDriver driver){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

}
