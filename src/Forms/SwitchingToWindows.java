package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchingToWindows {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Windows.html");
       //String handlevalue=driver.getWindowHandle();
       //System.out.println(handlevalue);
       driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
       Set<String> handlevalues=driver.getWindowHandles();
       for(String h:handlevalues){
           //System.out.println(h);
          String title=driver.switchTo().window(h).getTitle();
          //System.out.println(title);
          // Frames & windows
           //SeleniumHQ Browser Automation
           if(title.equals("SeleniumHQ Browser Automation")){
               driver.findElement(By.linkText("Projects")).click();
           }
       }
    }
}
