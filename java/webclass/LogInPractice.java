package webclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.get("https://demo.nopcommerce.com/");
        drive.manage().window().fullscreen();
        drive.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        drive.findElement(By.id("Email")).sendKeys("jaymini_bms@yahoo.co.uk");
        drive.findElement(By.id("Password")).sendKeys("123456");
        drive.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
}
