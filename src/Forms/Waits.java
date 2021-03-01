package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Waits {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //implicitWait:
        //-----------------
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        //ThreadSleepWait:
        //-----------------
        //Thread.sleep(3000);
        driver.findElement(By.id("firstName")).sendKeys("Mounika");
        //Explicitwait:
        //------------------

        WebDriverWait mywait=new WebDriverWait(driver,10000);
        WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastName")));
        username.sendKeys("mercury");

    }
}
