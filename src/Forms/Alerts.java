package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
    }
}
