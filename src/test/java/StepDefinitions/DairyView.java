package StepDefinitions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DairyView {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }


    public void testCalendarApp() {
        // Given I am an unauthenticated user
        driver.manage().deleteAllCookies();

        // When I open the Calendar app
        driver.get("https://calendarapp.com");

        // And I click on the next month button in the main header
        driver.findElement(By.id("next-month-button")).click();

        // Then I should see the next month displayed in both the side card and main view
        String nextMonth = driver.findElement(By.id("side-card-month")).getText();
        String mainViewMonth = driver.findElement(By.id("main-view-month")).getText();
        assert nextMonth.equals(mainViewMonth);

        // And the days of the next month should be visible
        for (int i = 1; i <= 31; i++) {
            String day = driver.findElement(By.id("day-" + i)).getText();
            assert !day.isEmpty();
        }

        // When I click on Today
        driver.findElement(By.id("today-button")).click();

        // Then I should see the current month displayed in both the side card and main view
        String currentMonth = driver.findElement(By.id("side-card-month")).getText();
        mainViewMonth = driver.findElement(By.id("main-view-month")).getText();
        assert currentMonth.equals(mainViewMonth);

        // And the days of the current month should be visible
        for (int i = 1; i <= 31; i++) {
            String day = driver.findElement(By.id("day-" + i)).getText();
            assert !day.isEmpty();
        }
    }
}