package webhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().fullscreen();
        driver.close();

    }
}
