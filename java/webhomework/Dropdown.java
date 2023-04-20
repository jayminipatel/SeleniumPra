package webhomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;

public class Dropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.get("https://demo.nopcommerce.com/");
        drive.manage().window().fullscreen();
        drive.findElement(By.className("ico-register")).click();
        drive.manage().window().fullscreen();
         WebElement    Day =   drive.findElement(By.name("DateOfBirthDay"));
         WebElement    Month = drive.findElement(By.name("DateOfBirthMonth"));
         WebElement    Year =  drive.findElement(By.name("DateOfBirthYear"));
        // Day.sendKeys("4");
      //   Month.sendKeys("May");
        // Year.sendKeys("1983");

      // Select select =new Select(Day);
     //  select.selectByIndex(04);
      // Select select1 = new Select(Month);
     //  select1.selectByVisibleText("May");
    //   Select select2 = new Select(Year);
     //  select2.selectByValue("1983");

    }

    }

