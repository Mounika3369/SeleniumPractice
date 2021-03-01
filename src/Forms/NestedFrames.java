package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NestedFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       driver.get("https://chercher.tech/practice/frames");

      driver.switchTo().frame("iamframe");
      driver.findElement(By.xpath("/html/body/input")).sendKeys("Selenium");
    WebElement  innerframe=driver.findElement(By.xpath("/html/body"));
    driver.switchTo().frame(innerframe);
      WebElement checkbox=driver.findElement(By.id("//*[@id=\"a\"]"));
     System.out.println(checkbox.isDisplayed());
        System.out.println(checkbox.isEnabled());
        System.out.println(checkbox.isSelected());
        checkbox.click();
    }
}