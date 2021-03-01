package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);
     WebElement tooltip=driver.findElement(By.linkText("Tooltips"));
     String tooltip_text=tooltip.getAttribute("title");
     System.out.println(tooltip_text);
     if(tooltip_text.equals("That's what this widget is")){
         System.out.println("Tooltip is passed");
     }else{
         System.out.println("Tooltip is failed");
     }
    }
}
