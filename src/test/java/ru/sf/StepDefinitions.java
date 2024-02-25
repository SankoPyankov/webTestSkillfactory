package ru.sf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    public static final WebDriver webDriver;
    public static final HomePage homePage;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\IdeaProjects\\CucumberScenario3\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();
        homePage = new HomePage(webDriver);
    }


    @Given("url of Skillfactory {string}")
    public void urlOfSkillfactoryHttpsSkillfactoryRu(String url) {
        homePage.go(url);
    }

//    @When("view tab {string}")
//    public void viewTabОнлайнКурсы(String buttonName) {
//        final var actButtName = homePage.viewButton();
//        assertEquals(buttonName, actButtName);
//
//    }

    @Then("click in tab онлайн-курсы")
    public void clickInTabОнлайнКурсы() {
      WebElement webElement = homePage.clickButton();
      webElement.click();
    }

    @Then("click in tab все курсы")
    public void clickInTabВсеКурсы() {
        WebElement webElement = homePage.clickButtonOnlineCurses();
        webElement.click();
    }
}
