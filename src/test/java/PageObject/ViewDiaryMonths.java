package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Const.CommonMethods.driver;

public class ViewDiaryMonths {
    public static WebElement daysOfTheMonth() {
        return driver.findElement(By.cssSelector(".flex-1.grid.grid-cols-7.grid-rows-5 div[class='border border-gray-200 flex flex-col']"));
    }

    public static WebElement viewMonthInSidePanel() {
        return driver.findElement(By.cssSelector("aside p:first-child"));
    }

    public static void checkMaximumDatePresent(int dateCount) {
        Assert.assertTrue(driver.findElement(By.cssSelector(".flex-1.grid.grid-cols-7.grid-rows-5 p:last-child")).getText().contains(String.valueOf(dateCount)));
    }

    public static void clickToday() {
        driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
    }

    public static void clickTraversingButtons(String direction) {
        driver.findElement(By.xpath("(//span[text()='" + direction + "']/parent::button)[1]")).click();
    }
}