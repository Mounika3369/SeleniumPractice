package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[]  args) {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("AbstractAnnotations")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
    }
}
