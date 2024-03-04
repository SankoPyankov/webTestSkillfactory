package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public record SFDesignPage (WebDriver webDriver){
    private static final By blockUxUiDesignerLocator = By.xpath("//div[contains(@class, 'tn-elem__6016804201679951747094')]");
    private static final By buttonSignUpForClassLocator = By.xpath("//div[contains(@class, 'tn-elem__5999770441643991313978')]");
    private static final By formLocator = By.id("popuptitle_494338808");

    public void clickBlockUxUiDesigner(){webDriver.findElement(blockUxUiDesignerLocator).click(); }
    public void clickButtonSignUpForClass(){webDriver.findElement(buttonSignUpForClassLocator).click(); }

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
