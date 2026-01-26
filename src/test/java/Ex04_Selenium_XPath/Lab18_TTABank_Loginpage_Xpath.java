package Ex04_Selenium_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Lab18_TTABank_Loginpage_Xpath {

    @Test
    public void Lab18_TTABank_Loginpage_Xpath() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");

        WebElement element_btn = driver.findElements(By.tagName("button")).get(1);
        element_btn.click();

        WebElement Full_name = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        Full_name.sendKeys("Swapnali");

        WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        email.sendKeys("khairnarswapnali123@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"••••••••\"]"));
        password.sendKeys("sapna123");

        WebElement creat_acc = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        creat_acc.click();

        Thread.sleep(3000);

        WebElement transsfer_fund = driver.findElement(By.xpath("//button[normalize-space()='Transfer Funds']"));
        transsfer_fund.click();

        WebElement manage_bene = driver.findElement(By.xpath("//button[normalize-space()='Manage Beneficiaries']"));
        manage_bene.click();

        Thread.sleep(3000);

        WebElement fullname = driver.findElement(By.xpath("//input[@placeholder=\"e.g. John Doe\"]"));
        fullname.sendKeys("Surekha");

        WebElement bank_name = driver.findElement(By.xpath("//input[@placeholder=\"e.g. Citibank\"]"));
        bank_name.sendKeys("HDFC Bank,Mumbai");

        WebElement acc_num = driver.findElement(By.xpath("//input[@placeholder='8-12 digits']"));
        acc_num.sendKeys("999955558236");

        WebElement save_bene = driver.findElement(By.xpath("//button[normalize-space()='Save Beneficiary']"));
        save_bene.click();

        Thread.sleep(5000);

        WebElement manage_bene1 = driver.findElement(By.xpath("//button[normalize-space()='Manage Beneficiaries']"));
        manage_bene1.click();

        WebElement added_item = driver.findElement(By.xpath("//div[@class=\"flex items-center justify-between rounded-lg border border-slate-200 p-3 bg-slate-50\"]"));

        Assert.assertTrue(added_item.isDisplayed());

        driver.quit();

    }


}
