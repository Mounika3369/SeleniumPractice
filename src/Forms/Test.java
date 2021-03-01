package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Test {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Mounika");
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Reddy");
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("7661867721");
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("india");
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("gandhaveetimounika@gmail.com");
        WebElement radfemale=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label"));
        System.out.println(radfemale.isDisplayed());
        System.out.println(radfemale.isEnabled());
        System.out.println(radfemale.isSelected());
        radfemale.click();
        WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label"));
        System.out.println(checkbox.isDisplayed());
        System.out.println(checkbox.isEnabled());
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label")).click();
        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td/label")).click();
        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label")).click();
        WebElement drp=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
        Select dropdown=new Select(drp);
        System.out.println(dropdown.getOptions().size());
        List<WebElement> options=dropdown.getOptions();
        for(WebElement e:options){
            System.out.println(e.getText());
        }
        dropdown.selectByIndex(3);
        driver.findElement(By.linkText("Software Testing Tutorials")).click();
        Thread.sleep(3000);
        driver.getTitle();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Software Testing Tools Training")).click();
        Thread.sleep(3000);
        driver.getTitle();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
