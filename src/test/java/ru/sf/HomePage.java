package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//public class HomePage {


public record HomePage(WebDriver webDriver) {

    private static final String SEARCH_FIELD_CLASS = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[1]/a";
    private static final String BUTTON_ONLINE_CURSES = "//*[@id=\"nav623893182\"]/div/div[3]/ul/li[1]/div/a/span";


    public void go(String url) {
        webDriver.get(url);
    }

//    public String viewButton() {
//       return webDriver.findElement(By.className(SEARCH_FIELD_CLASS)).getText();
//
//    }

    public WebElement clickButton() {
        final var clickButton = webDriver.findElement(By.xpath(SEARCH_FIELD_CLASS));
        return clickButton;
    }

    public WebElement clickButtonOnlineCurses() {
        final var clickButtonOnlineCurses = webDriver.findElement(By.xpath(BUTTON_ONLINE_CURSES));
        return clickButtonOnlineCurses;
    }
}
