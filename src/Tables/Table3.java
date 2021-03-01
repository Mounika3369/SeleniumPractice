package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("menu_admin_UserManagement")).click();
        driver.findElement(By.linkText("Users")).click();
        int rows = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
        System.out.println(rows);
        int columns = driver.findElements(By.tagName("th")).size();
        System.out.println(columns);
        /*int count=0;
        for (int r = 1; r <= rows; r++) {
           String status=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
            if(status.equals("Enabled")){
                count++;
            }
        }
        System.out.println("Number of enabled employees are :"+count);
        System.out.println("Number of disabled employees are :"+(rows-count));
        *
         */
        System.out.println("Username"+"  "+"User Roll"+"  "+"Employee Name");

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= 4; c++) {

                String value = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[" + r + "]/td[" + c + "]")).getText();
                System.out.print(value + " ");

            }

            System.out.println();
        }
    }

    }

