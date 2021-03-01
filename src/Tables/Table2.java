package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        //finding number of rows
        int rows=driver.findElements(By.xpath("//*[@id=\"task-table\"]/tbody/tr")).size();
        System.out.println(rows);
        //finding number of columns
       int columns= driver.findElements(By.xpath("//*[@id=\"task-table\"]/thead/tr/th")).size();
       System.out.println(columns);
       System.out.print("#"+"     "+"Task"+"     "+"Assignee"+"     "+"Status");
       for(int r=1;r<=rows;r++){
           for(int c=1;c<=columns;c++){

          String values=driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
          System.out.print(values+"  ");

           }
           System.out.println();
       }
    }
}

