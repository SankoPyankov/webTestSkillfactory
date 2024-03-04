package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public record SFReferralProgramPage (WebDriver webDriver){
    private static final By buttonParticipateInProgramLocator = By.xpath("//a[text()='Участвовать в программе']");
    public void clickButtonParticipateInProgram(){
        webDriver.findElement(buttonParticipateInProgramLocator).click();
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
