package Ex04_Selenium_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab20_Project_CURA_Healthcare_Service {

    @Test
    public void Lab20_Project_CURA_Healthcare_Service() throws InterruptedException  {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        make_appointment.click();

        WebElement input_username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        input_username.sendKeys("John Doe");

        WebElement input_password = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        input_password.sendKeys("ThisIsNotAPassword");

        WebElement btn_login = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        btn_login.click();

        driver.getCurrentUrl().contains("appointment");

        Thread.sleep(3000);

        WebElement h2 = driver.findElement(By.xpath("//div[@class=\"col-sm-12 text-center\"]/h2"));
        Assert.assertEquals(h2.getText(), "Make Appointment");
        Assert.assertTrue(h2.isDisplayed());
        driver.quit();

    }


}
