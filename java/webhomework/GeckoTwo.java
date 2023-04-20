package webhomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoTwo {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.getTitle();
        String actualtitle= driver.getTitle();
        String expactedtitle = "nopCommerce demo store";
        if (actualtitle.equals(expactedtitle)){
            System.out.println("Web page is correct");
        }
        else {
            System.out.println("Web page is incorrect");
        }

        driver.close();

    }
}
