package Ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab06_Selenium_Commands {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://thetestingacademy.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
