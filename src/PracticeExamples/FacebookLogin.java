package PracticeExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FacebookLogin {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C://my softwares//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("u_0_n")).sendKeys("Mounika");
        driver.findElement(By.id("u_0_p")).sendKeys("Gandhaveeti");
        driver.findElement(By.id("u_0_s")).sendKeys("gandhaveetimounika@gmail.com");
        driver.findElement(By.id("u_0_v")).sendKeys("gandhaveetimounika@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("mounika@33");
        //Handling dropdown
        WebElement drp=driver.findElement(By.id("day"));
        if(drp.isDisplayed()){
            System.out.println("Element is present");
        }else{
            System.out.println("Element is not present");
        }
        if(drp.isEnabled()){
            System.out.println("Element is enabled");
        }else{
            System.out.println("Element is not enabled");
        }
        if(drp.isSelected()){
            System.out.println("Dropdown is selected");
        }
        else{
            System.out.println("Dropdown is not selected");
        }

        Select dropdown=new Select(drp);
        System.out.println("Number of options present is:"+dropdown.getOptions().size());
        List<WebElement> options=dropdown.getOptions();
        for(WebElement e:options){
            System.out.println(e.getText());

        }
        dropdown.selectByIndex(4);
        //Handling Dropdown for month
        WebElement drp1=driver.findElement(By.id("month"));
        if(drp1.isDisplayed()){
            System.out.println("Element is present");
        }else{
            System.out.println("Element is not present");
        }
        if(drp1.isEnabled()){
            System.out.println("Element is enabled");
        }else{
            System.out.println("Element is not enabled");
        }
        if(drp1.isSelected()){
            System.out.println("Dropdown is selected");
        }
        else{
            System.out.println("Dropdown is not selected");
        }
        Select dropdown1 =new Select(drp1);
        System.out.println("Number of options present is:"+dropdown1.getOptions().size());
        List<WebElement> options1=dropdown1.getOptions();
        for(WebElement f:options1){
            System.out.println(f.getText());
        }
         dropdown1.selectByVisibleText("Aug");
        //Handling dropdown for year
        WebElement drp2=driver.findElement(By.id("year"));
        if(drp2.isDisplayed()){
            System.out.println("Element is present");
        }else{
            System.out.println("Element is not present");
        }
        if(drp2.isEnabled()){
            System.out.println("Element is enabled");
        }else{
            System.out.println("Element is not enabled");
        }
        if(drp2.isSelected()){
            System.out.println("Dropdown is selected");
        }
        else{
            System.out.println("Dropdown is not selected");
        }
        Select dropdown2=new Select(drp2);
        System.out.println("Number of options present is:"+dropdown2.getOptions().size());
        List<WebElement> options2=dropdown2.getOptions();
        for(WebElement g:options2){
            System.out.println(g.getText());
        }
        dropdown2.selectByVisibleText("1996");
        //Handling Radio buttons
        WebElement female=driver.findElement(By.id("u_0_4"));
        if(female.isDisplayed()){
            System.out.println("Element is present");
        }else{
            System.out.println("Element is not present");
        }
        if(female.isEnabled()){
            System.out.println("Element is enabled");
        }else{
            System.out.println("Element is not enabled");
        }
        if(female.isSelected()){
            System.out.println("Dropdown is selected");
        }
        else{
            System.out.println("Radio button is not selected");
        }
        female.click();
        System.out.println("Text present in the page is :"+driver.findElement(By.xpath("//p[@class='_58mv']")).getText());
        driver.findElement(By.id("u_0_14")).click();





            }
}
