package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddDiarySection {
    private static final int MAX_EVENTS = 10;
    private static final String TITLE_BOX = "input[name='title']";
    private static final String DESCRIPTION_BOX = "input[name='description']";
    private static final String SAVE_BUTTON = "//button[normalize-space()='Save']";
    private static ChromeDriver driver;

    public static void ClickCreate() {
        driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
    }

    public static void fillUpTheEventInfo(String title) {
        WebElement titleBox = driver.findElement(By.cssSelector(TITLE_BOX));
        titleBox.sendKeys(title);
    }

    public static void checkColorLabels(String color) {
        List<WebElement> labels = driver.findElements(By.cssSelector("aside label span"));
        for (WebElement label : labels) {
            if (label.getText().contains(color)) {
                return;
            }
        }
        throw new AssertionError("Color label not found");
    }

    public static void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON)).click();
    }

    public static boolean checkLabelsPresence(String eventType) {
        List<WebElement> labels = driver.findElements(By.xpath("//div[contains(text(),'" + eventType + "')]"));
        return labels.size() > 0;
    }

    public static void selectDateinMiniCalendar(String date) {
        driver.findElement(By.xpath("//span[text()='" + date + "']/parent::button")).click();
    }

    public static void addEventinDiary(String dateOfscreening, String eventType) {
        selectDateinMiniCalendar(dateOfscreening);
        ClickCreate();
        fillUpTheEventInfo(eventType);
        clickSave();
    }

    public static void viewtheAddedEvent(String eventType) {
        boolean isVisible = checkLabelsPresence(eventType);
        if (!isVisible) {
            throw new AssertionError("Event not visible");
        }
    }

    public static void assertFinalInterviewEventsCreated(String eventType) {
        this.checkLabelsPresence(eventType)
                .should(Condition.exist)
                .and(Condition.haveLengthAtMost(MAX_EVENTS));
    }

    public static void assertDefaultColorForScreeningEvent(String eventType, String color) {
        boolean isVisible = checkLabelsPresence(eventType);
        if (!isVisible) {
            throw new AssertionError("Event not visible");
        }
        WebElement label = driver.findElement(By.xpath("//div[contains(text(),'" + eventType + "')]"));
        String backgroundColor = label.getCssValue("background-color");
        if (!backgroundColor.equals("rgb(199, 210, 254)")) {
            throw new AssertionError("Incorrect background color");
        }
        checkColorLabels(color);
    }

    public static void selectRedColor() {
        driver.findElement(By.cssSelector("span[class*='bg-red']")).click();
    }

    public static void addEventsinDiary(String dateOfFinalInterview, String startTime, String endTime, String eventType) {
        // implementation
    }
}