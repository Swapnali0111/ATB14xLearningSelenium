package Ex06_Input_Select_Radio_Alerts;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab27_Select_Dropdown extends CommonToAll {

    @Test
    public void test_select() throws InterruptedException {

        // Select BOX - HTMLs
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();


        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
        select.selectByIndex(1);

        Thread.sleep(3000);
        //select.selectByVisibleText("Option 2");

        closeBrowser(driver);
        {        }
    }
}