package Ex02_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Lab01_seleniumBasic {

    @Test
    public void test_basic() {
        FirefoxDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.com");

    }

}
