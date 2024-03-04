package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public record SFRazrabotkaPrilozheniyPage (WebDriver webDriver){

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
