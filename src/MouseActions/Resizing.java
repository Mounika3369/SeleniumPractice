package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);
        WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Thread.sleep(3000);
        Actions act=new Actions(driver);
        act.moveToElement(element).dragAndDropBy(element,200,150).build().perform();

    }
}
