package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
     WebElement button=  driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
     //Creating Actions class object
        Actions act=new Actions(driver);
        act.doubleClick(button).build().perform();
        driver.close();

    }
}
