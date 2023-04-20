package webhomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.DayOfWeek;

public class RegFunction extends Dropdown{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.get("https://demo.nopcommerce.com/");
        drive.manage().window().fullscreen();
        drive.findElement(By.className("ico-register")).click();
        drive.manage().window().fullscreen();
        drive.findElement(By.id("gender-female")).click();
        drive.findElement(By.id("FirstName")).sendKeys("Jaymini");
        drive.findElement(By.id("LastName")).sendKeys("Patel");
        // First way dropdown
         drive.findElement(By.name("DateOfBirthDay")).sendKeys("19");
         drive.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
        drive.findElement(By.name("DateOfBirthYear")).sendKeys("2023");

        //2 way dropdown
      // WebElement  Day=    drive.findElement(By.name("DateOfBirthDay"));
      // WebElement  Month=  drive.findElement(By.name("DateOfBirthMonth"));
      // WebElement  Year=  drive.findElement(By.name("DateOfBirthYear"));
       //    Day.sendKeys("19");
         //  Month.sendKeys("April");
        //   Year.sendKeys("1983");

        // 3rd way dropdown

     //  Select select= new Select(Day);
     //  select.selectByIndex(19);
     // Select select1 = new Select(Month);
     // select1.selectByVisibleText("May");
    //  Select select2 = new Select(Year);
    //  select2.selectByValue("1983");


// generic method

     //  selectValueFromDropDown(Day,"19");
   //   selectValueFromDropDown(Month,"April");
     // selectValueFromDropDown(Year,"2020");

        drive.findElement(By.id("Email")).sendKeys("jaymini_bms@yahoo.co.uk");
        drive.findElement(By.id("Company")).sendKeys("NHS");
        drive.findElement(By.id("Password")).sendKeys("123456");
        drive.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        drive.findElement(By.name("register-button")).click();
        drive.close();

    }
}
