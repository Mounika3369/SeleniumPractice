package FlipKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        //driver.findElement(By.xpath("//a[text()='Login']")).click();
    }
}
