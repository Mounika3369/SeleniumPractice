package PracticeExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginIdPassword {
    public static  void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("mounikareddygandhaveeti401@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("mounika@123");
        driver.findElement(By.id("u_0_b")).click();
        System.out.println("The error message is:"+driver.findElement(By.xpath("//div[contains(text(),'The email address ')]")).getText());

    }
}
