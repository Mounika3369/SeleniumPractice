package MouseActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/key_presses");
        Actions act=new Actions(driver);
        act.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.END).build().perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.CANCEL).build().perform();
    }
}
