package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public record SFPartnerProgramPage (WebDriver webDriver){
    private static final By buttonBecomeAPartnerLocator = By.xpath("//div[contains(@class, 'tn-elem__6122141511688364025205')]");

    public void clickButtonBecomeAPartner(){
        webDriver.findElement(buttonBecomeAPartnerLocator).click();
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
}
