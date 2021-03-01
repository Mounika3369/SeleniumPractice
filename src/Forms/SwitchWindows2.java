package Forms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class SwitchWindows2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
        driver.findElement(By.className("wikipedia-search-button")).click();
        driver.findElement(By.linkText("Selenium")).click();
        driver.findElement(By.linkText("Selenium in biology")).click();
        driver.findElement(By.linkText("Selenium (software)")).click();
        driver.findElement(By.linkText("Selenium disulfide")).click();
        driver.findElement(By.linkText("Selenium dioxide")).click();
        driver.findElement(By.linkText("More »")).click();
        Set<String> handlevalues=driver.getWindowHandles();
        for(String h:handlevalues){
            String title=driver.switchTo().window(h).getTitle();
            //System.out.println(title);
            if(title.equals("Selenium dioxide - Wikipedia ")||title.equals(" Selenium disulfide - Wikipedia")){
                driver.quit();
            }
        }


    }
}
