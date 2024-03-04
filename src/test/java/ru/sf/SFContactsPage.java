package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public record SFContactsPage (WebDriver webDriver){
    private static final By blockOtherLocator = By.xpath("//div[contains(@class, 'tn-elem__6188040781689910041853')]");
    private static final By formLocator = By.id("popuptitle_618809648");

    public void clickBlockOther(){
        webDriver.findElement(blockOtherLocator).click();
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
    public void actualForm(String formName){
        String expectedForm = webDriver.findElement(formLocator).getText();
        Assert.assertEquals(formName, expectedForm);
    }
}
