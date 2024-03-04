package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public record SFFreeEventsPage (WebDriver webDriver) {
    private static final By buttonStartLocator = By.xpath("//div[contains(@class,'tn-elem__6143650851689015135948')]");
    private static final By testLocator = By.xpath("//*[text()='Какая профессия без кода вам подходит?']");

    public void clickButtonStart(){
        webDriver.findElement(buttonStartLocator).click();
    }

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
    public void actualTest(String testName){
        String expectedForm = webDriver.findElement(testLocator).getText();
        Assert.assertEquals(testName, expectedForm);
    }
}
