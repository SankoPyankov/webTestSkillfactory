package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public record SFCoursesPage (WebDriver webDriver){
    private static final By buttonMainLocator = By.className("tn-atom__img");
    private static final By buttonProgrammirovanieLocator = By.xpath("//a[contains(@class,'tn-atom') and text()='Программирование']");
    private static final By buttonTestirovanieLocator = By.xpath("//a[contains(@class,'tn-atom') and text()='Тестирование']");
    private static final By buttonAnalitikaDannyhLocator = By.xpath("//a[contains(@class,'tn-atom') and text()='Аналитика данных']");
    private static final By buttonRazrabotkaIgrLocator = By.xpath("//a[contains(@class,'tn-atom') and text()='Разработка игр']");
    private static final By buttonPythonLocator = By.xpath("//a[contains(@class,'tn-atom') and text()='Python']");
    private static final By buttonManagementLocator = By.xpath("//a[contains(@class,'tn-atom') and text()='Менеджмент']");
    private static final By buttonDesignLocator = By.xpath("//a[contains(@class,'tn-atom') and text()='Дизайн от Contented']");


    public void openPage(String url){
        webDriver.get(url);
    }
    public void clickButtonMain(){
        webDriver.findElement(buttonMainLocator).click();
    }
    public void clickButtonProgrammirovanie(){
        webDriver.findElement(buttonProgrammirovanieLocator).click();
    }
    public void clickButtonTestirovanie(){
        webDriver.findElement(buttonTestirovanieLocator).click();
    }
    public void clickButtonAnalitikaDannyh(){
        webDriver.findElement(buttonAnalitikaDannyhLocator).click();
    }
    public void clickButtonRazrabotkaIgr() {webDriver.findElement(buttonRazrabotkaIgrLocator).click(); }
    public void clickButtonPython() {webDriver.findElement(buttonPythonLocator).click(); }
    public void clickButtonManagement() {webDriver.findElement(buttonManagementLocator).click(); }
    public void clickButtonDesign() {webDriver.findElement(buttonDesignLocator).click(); }

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
