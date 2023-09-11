package Const;

import org.openqa.selenium.WebDriver;

public class CommonMethods {
    public static WebDriver driver;
    public static void visitSite(WebDriver driver) {
        CommonMethods.driver.get(System.getProperty("baseUrl"));
    }
}