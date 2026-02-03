package Ex13_Javascript_Executor;

import Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab42_SwitchURL_usingJS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://www.google.com'");

        new WaitHelpers().waitJVM(5000);
        driver.quit();
    }
}
