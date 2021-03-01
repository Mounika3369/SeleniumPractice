package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindows1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://toolsqa.com/automation-practice-switch-windows/");
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/a/span/span")).click();

        Set<String> hv=driver.getWindowHandles();
        System.out.println(hv);
        for(String e:hv) {
            System.out.println(driver.switchTo().window(e).getTitle());
        }



    }
}
