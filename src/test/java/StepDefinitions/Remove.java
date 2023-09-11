package StepDefinitions;

import Const.CommonMethods;
import PageObject.RemovePage;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remove {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    public void testRemoveEvent() {
        // Given the app is running
        CommonMethods.visitSite(driver);

        // And I am logged in as a valid user
        CommonMethods.restoreLocalStorage(driver);

        // When I have up to {int} events created for {string} on {int} August
        int count = 5;
        String eventDate = "10";
        RemovePage.checkEventCount(driver, count, eventDate);


        // Then I remove event for {string}
        String eventIdentifier = "Event1";
        RemovePage.selectEventandRemove(driver,eventIdentifier);


        // Then I can see {int} event is present
        int countOfEvents = 4;
        RemovePage.checkCountOfEventsPresentInRed(driver,countOfEvents);


        // When I see event of {string} created on 10 August
        String eventType = "Screening";
        RemovePage.checkIfScreeningEventPresent(driver,eventType);


        // Then I remove event {string}
        RemovePage.chooseScreeningEventAndDelete(driver,eventType);

        // And I verify that {string} event has been removed
        RemovePage.verifyTheEventHasBeenRemoved(driver,eventIdentifier);

    }
}