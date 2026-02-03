package Ex13_Javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab43_JS_Executor_Code {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://www.google.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");

        js.executeScript("window.scrollBy(0, 500);");
        js.executeScript("window.scrollBy(0, 500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

    }
}

