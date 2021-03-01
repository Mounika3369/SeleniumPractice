package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
       int rows= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
       System.out.println(rows);
     int cols= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th")).size();
     for(int r=1;r<=rows;r++) {
         for (int c = 1; c <= cols; c++) {
             String value = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
             System.out.print(value + " ");
         }

         System.out.println();
     }
    }

}
