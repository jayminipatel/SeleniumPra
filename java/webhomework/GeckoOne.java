package webhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\geckodriver.exe");
        WebDriver drive = new FirefoxDriver();
        drive.get("https://demo.nopcommerce.com/");
        drive.manage().window().maximize();
        drive.close();

    }
}
