package Ex02_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab12_NoHTTP {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        //driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.

    }
}
