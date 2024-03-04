package ru.sf;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public record SFMainPage(WebDriver webDriver){

    private static final By buttonAllCoursesLocator = By.xpath("//a[contains(@class, 'directions__list-link_green')]");
    private static final By buttonOnlineCoursesLocator = By.className("main__nav-item");
    private static final By buttonDataScienceLocator = By.xpath("//span[contains(@class,'t978__link-inner') and text()='Data Science']");
    private static final By buttonWebRazrabotkaLocator = By.xpath("//span[contains(@class,'t978__link-inner') and text()='Веб-разработка']");
    private static final By buttonRazrabotkaPrilozheniyLocator = By.xpath("//span[contains(@class,'t978__link-inner') and text()='Разработка приложений']");
    private static final By buttonDesignLocator = By.xpath("//span[contains(@class,'t978__link-inner') and text()='Дизайн']");
    private static final By buttonFreeEventsLocator = By.xpath("//a[text()='БЕСПЛАТНО']");
    private static final By buttonCareerCenterLocator = By.xpath("//a[text()='центр карьеры']");
    private static final By buttonContactsLocator = By.xpath("//a[text()='контакты']");
    private static final By buttonStudentsReviewLocator = By.xpath("//a[text()='Отзывы студентов']");
    private static final By buttonActionsLocator = By.xpath("//a[text()='Акции']");
    private static final By buttonReferralProgramLocator = By.xpath("//a[text()='Реферальная программа']");
    private static final By buttonPartnerProgramLocator = By.xpath("//a[text()='Партнерская программа']");
    private static final By fieldMailLocator = By.xpath("//*[@id=\"form625525165\"]/div[2]/div[1]/div/input");
    private static final By fieldMessageLocator = By.xpath("//*[@id=\"form625525165\"]/div[2]/div[1]/div/div");

    public void openPage(String url){
        webDriver.get(url);
    }
    public void clickButtonAllCourses(){
        webDriver.findElement(buttonAllCoursesLocator).click();
    }
    public void clickButtonOnlineCourses(){
        webDriver.findElement(buttonOnlineCoursesLocator).click();
    }
    public void clickButtonDataScience(){
        webDriver.findElement(buttonDataScienceLocator).click();
    }
    public void clickButtonWebRazrabotka(){
        webDriver.findElement(buttonWebRazrabotkaLocator).click();
    }
    public void clickButtonRazrabotkaPrilozheniy(){webDriver.findElement(buttonRazrabotkaPrilozheniyLocator).click();}
    public void clickButtonDesign(){ webDriver.findElement(buttonDesignLocator).click(); }
    public void clickButtonFreeEvents(){
        webDriver.findElement(buttonFreeEventsLocator).click();
    }
    public void clickButtonCareerCenter(){
        webDriver.findElement(buttonCareerCenterLocator).click();
    }
    public void clickButtonContacts(){
        webDriver.findElement(buttonContactsLocator).click();
    }
    public void clickButtonStudentsReview(){
        webDriver.findElement(buttonStudentsReviewLocator).click();
    }
    public void clickButtonActions(){
        webDriver.findElement(buttonActionsLocator).click();
    }
    public void clickButtonReferralProgram(){
        webDriver.findElement(buttonReferralProgramLocator).click();
    }
    public void clickButtonPartnerProgram(){
        webDriver.findElement(buttonPartnerProgramLocator).click();
    }

    public void emailEntered(String email){
        final var searchInput = webDriver.findElement(fieldMailLocator);
        searchInput.sendKeys(email, Keys.ENTER);
    }
    public void errorMessage(String message){
        String expectedMessage = webDriver.findElement(fieldMessageLocator).getText();
        Assert.assertEquals(message, expectedMessage);
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
