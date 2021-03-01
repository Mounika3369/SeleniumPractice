package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        //Finding number of rows
        int rows = driver.findElements(By.xpath("//*[@id=\"task-table\"]/tbody/tr")).size();
        System.out.println(rows);
        //Finding number of columns
       int columns= driver.findElements(By.xpath("//*[@id=\"task-table\"]/thead/tr/th")).size();
       System.out.println(columns);

       //reading data of each row and column
System.out.println("#"+"      "+"Task"+"      "+"Assignee"+"     "+"Status");

        for(int r=1;r<=rows;r++){
            for(int c=1;c<=columns;c++){
             String value=driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
             System.out.print(value+"  ");
            }
            System.out.println();
        }

    }
}
