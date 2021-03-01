package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        //finding elements to mousehover
        WebElement Admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement users_management=driver.findElement(By.id("menu_admin_UserManagement"));
       WebElement users= driver.findElement(By.id("menu_admin_viewSystemUsers"));

       //Creating Actions class object

        Actions act=new Actions(driver);
        act.moveToElement(Admin).moveToElement(users_management).moveToElement(users).click().build().perform();

    }
}
