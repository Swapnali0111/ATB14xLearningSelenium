package Ex02_SeleniumBasics;

import io.qameta.allure.Description;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Lab14_Mini_Project2_AddExtention {
    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        EdgeOptions chromeOptions = new EdgeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");

          File file = new File("src/test/java/Ex02_SeleniumBasics/AdBlockers.crx");
        chromeOptions.addExtensions(file);

        WebDriver driver = new EdgeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");

        Thread.sleep(15000);
        driver.quit();
    }
}
