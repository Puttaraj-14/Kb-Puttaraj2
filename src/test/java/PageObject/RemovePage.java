package PageObject;

import Const.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Const.CommonMethods.driver;
import static Const.Main.FINAL_INTERVIEW_TITLE;
import static Const.Main.SCREENING_EVENT_TITLE;

public class RemovePage {
    public static void chooseEventToBeDeleted(String eventIdentifier) {
        driver.findElement(By.xpath("//div[contains(text(),'" + eventIdentifier + "')]")).click();
        driver.findElement(By.xpath("//span[text()='delete']")).click();
    }

    public static void selectEventandRemove(WebDriver driver, String eventIdentifier) {
        chooseEventToBeDeleted(eventIdentifier);
    }

    public static void checkCountOfEventsPresentInRed(WebDriver driver, int countOfEvents) {
        CommonMethods.driver.findElements(By.xpath("//div[contains(text(),'" + FINAL_INTERVIEW_TITLE + "')]")).size() == countOfEvents;
    }

    public static int getCountOfFinalInterviewEvents() {
        return driver.findElements(By.xpath("//div[contains(text(),'" + FINAL_INTERVIEW_TITLE + "')]")).size();
    }

    public static int getCountOfScreeningRound() {
        return driver.findElements(By.xpath("//div[contains(text(),'" + SCREENING_EVENT_TITLE + "')]")).size();
    }

    public static void checkIfScreeningEventPresent(WebDriver driver, String eventIdentifier) {
        CommonMethods.driver.findElement(By.xpath("//div[contains(text(),'" + eventIdentifier + "')]")).isDisplayed();
    }

    public static void chooseScreeningEventAndDelete(WebDriver driver, String eventIdentifier) {
        chooseEventToBeDeleted(eventIdentifier);
    }

    public static void verifyTheEventHasBeenRemoved(WebDriver driver, String eventIdentifier) {
        CommonMethods.driver.findElement(By.xpath("//div[contains(text(),'" + eventIdentifier + "')]")).isDisplayed();
    }
}