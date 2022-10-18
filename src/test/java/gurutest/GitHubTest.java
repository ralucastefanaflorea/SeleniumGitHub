package gurutest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.time.Duration;

public class GitHubTest {
    @Test
    public void testGuru(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver3.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.guru99.com/");
        try{Thread.sleep(2000);}catch(Exception e){System.out.println(e.getMessage());}

        WebElement blueTitle = driver.findElement(By.cssSelector("h3"));
        String expected = "Guru99 is totally new kind of learning experience.";

        Reporter.log("Actual Blue Title: " + blueTitle.getText());
        Assert.assertEquals(blueTitle.getText(),expected);

        try{Thread.sleep(2000);}catch(Exception e){System.out.println(e.getMessage());}
        driver.close();
    }
}
