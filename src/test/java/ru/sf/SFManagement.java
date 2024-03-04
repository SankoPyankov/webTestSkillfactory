package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public record SFManagement (WebDriver webDriver){
    private static final By blockProductManagerLocator = By.xpath("//div[contains(@class, 'tn-elem__5724582451652779744723')]");
    private static final By buttonSignUpForClassLocator = By.xpath("//div[contains(@class, 'tn-elem__3478350201598605368868')]");
    private static final By buttonChooseLocator = By.xpath("//div[contains(@class, 'tn-elem__4583555911647334884292')]");
    private static final By formLocator = By.id("popuptitle_454585650");

    public void clickBlockProductManager(){webDriver.findElement(blockProductManagerLocator).click(); }
    public void clickButtonSignUpForClass(){webDriver.findElement(buttonSignUpForClassLocator).click(); }
    public void clickButtonChoose(){
        Duration duration = Duration.ofSeconds(15);
        WebDriverWait wait = new WebDriverWait(webDriver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(buttonChooseLocator));
        webDriver.findElement(buttonChooseLocator).click(); }

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
