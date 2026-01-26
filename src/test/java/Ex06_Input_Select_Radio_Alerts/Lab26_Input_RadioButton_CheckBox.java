package Ex06_Input_Select_Radio_Alerts;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab26_Input_RadioButton_CheckBox extends CommonToAll {

    @Description("This is description")
    @Test
    public void HTML_tags() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
//        WebElement firstname = driver.findElement(By.name("firstname"));
        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstname.sendKeys("The Testing Academy");

        // RADIO Box
        WebElement radiobox = driver.findElement(By.id("sex-0"));
        radiobox.click();

        // CheckBox
        driver.findElement(By.id("profession-1")).click();

        Thread.sleep(5000);

        closeBrowser(driver);
    }
 }
