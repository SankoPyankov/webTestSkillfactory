package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public record SFPythonPage (WebDriver webDriver){
    private static final By buttonPythonDeveloperLocator = By.xpath("//div[contains(@class, 'tn-elem__6399917761679952802625')]");
    private static final By buttonSignUpForClassLocator = By.xpath("//div[contains(@class, 'tn-elem__5215489551584952343910')]");
    private static final By buttonLeaveARequestLocator = By.xpath("//div[contains(@class, 'tn-elem__6288260101632831768768')]");
    private static final By formLocator = By.id("popuptitle_521549025");

    public void clickButtonPythonDeveloper(){webDriver.findElement(buttonPythonDeveloperLocator).click(); }
    public void clickButtonSignUpForClass(){webDriver.findElement(buttonSignUpForClassLocator).click(); }
    public void clickButtonLeaveARequest(){
        Duration duration = Duration.ofSeconds(15);
        WebDriverWait wait = new WebDriverWait(webDriver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(buttonLeaveARequestLocator));
        webDriver.findElement(buttonLeaveARequestLocator).click(); }

    public void switchToNewTab(){
        ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(0));
        webDriver.close();
        webDriver.switchTo().window(tabs.get(1));
    }
    public void actualPage(String actualUrl){
        String currentUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(currentUrl, actualUrl);
    }
    public void actualForm(String formName){
        String expectedForm = webDriver.findElement(formLocator).getText();
        Assert.assertEquals(formName, expectedForm);
    }
}
