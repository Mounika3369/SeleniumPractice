import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String args[]) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Register.html");
        //driver.get("http://demo.automationtesting.in/FileDownload.html");
        //driver.get("http://demo.automationtesting.in/FileUpload.html");
        //Thread.sleep(3000);
        //driver.findElement(By.id("input-4")).click();
        //driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //driver.switchTo().frame(0);
        //driver.findElement(By.id("photo")).click();
        //driver.findElement(By.xpath("//*[@id='imagesrc']")).click();
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");



          }
}
