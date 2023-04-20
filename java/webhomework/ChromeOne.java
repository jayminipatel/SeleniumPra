package webhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOne {
    public static void main(String[] args) {
        // 1. Set path
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");

        // 2 .Create Instance
        WebDriver driver = new ChromeDriver();

        // 3.Navigate to web page
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
