package ru.sf;

import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@CucumberOptions

public class RunCucumberTest {
    //Закрываем браузер, когда тесты отработали
    @AfterClass
    public static void finalizeResources() {
        StepDefinitions.webDriver.close();
    }
}
