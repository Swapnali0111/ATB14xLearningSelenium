package Ex02_SeleniumBasics;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab11_Mini_Project1_KatalonWebsite_VerifyTitle extends CommonToAll {

    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Link("https://bugzz.atlassian.net/browse/REST-3")
    @Test
    public void test_verify_text(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("✅ Test Cases PASSED!");
            Assert.assertTrue(true);
        }else{
            System.out.println("❌ Test Cases FAILED!");
            Assert.assertTrue(false);

        }

         closeBrowser(driver);




    }
}
