package MouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

       //Creating Actions class object
        Actions act=new Actions(driver);
        WebElement button= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        act.contextClick(button).build().perform();
        driver.findElement(By.xpath("/html/body/ul/li[5]/span")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.dismiss();
        WebElement button1= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        act.contextClick(button1).build().perform();
        driver.findElement(By.xpath("/html/body/ul/li[4]/span")).click();
        //printing alert text
        Alert alert1=driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert1.dismiss();



    }
}
