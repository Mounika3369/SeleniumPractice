package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://api.jquery.com/dblclick/");
        driver.switchTo().frame(0);
        WebElement button=driver.findElement(By.xpath("/html/body/div"));
        Actions act=new Actions(driver);
        act.doubleClick(button).build().perform();
    }
}
