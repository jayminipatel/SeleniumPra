package webhomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTwo {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().fullscreen();
        driver.getTitle();
        String actualtitle = driver.getTitle();
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
