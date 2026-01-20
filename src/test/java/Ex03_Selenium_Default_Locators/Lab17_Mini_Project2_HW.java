package Ex03_Selenium_Default_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab17_Mini_Project2_HW {

    @Test
    public void Lab16_Project_HW() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement element_link = driver.findElement(By.linkText("Start a free trial"));
        element_link.click();

        driver.getCurrentUrl().equals("https://vwo.com/free-trial/");
        //Assert.assertTrue(driver.getCurrentUrl().contains("free trial"));

        WebElement element_bussinessemail = driver.findElement(By.name("email"));
        element_bussinessemail.sendKeys("abc@gmail.com");

        WebElement element_checkbox = driver.findElement(By.xpath("// input[@id='page-free-trial-step1-cu-gdpr-consent-checkbox']"));
        element_checkbox.click();

        Thread.sleep(5000);
        WebElement Create_a_Free_Trial_Account = driver.findElement(By.tagName("button"));
        Create_a_Free_Trial_Account.click();

        WebElement error_messgae = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_messgae.getText(), "gmail.com doesn't look like a business domain. Please use your business email.");

        driver.quit();
    }

}
