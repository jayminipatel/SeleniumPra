package webclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTwo {
    public static void main(String[] args) {
   // 1.second way by using bonigarcia dependency

        WebDriverManager.chromedriver().setup();

   // 2.Create Instance
        WebDriver drive = new ChromeDriver();

   // 3.Navigate to web page

      drive.get("https://demo.nopcommerce.com/");
      drive.manage().window().maximize();
      String actualtitle = drive.getTitle();
      String expactedtitle = "nopCommerce demo store";
      if (actualtitle.equals(expactedtitle)){
          System.out.println("Web page is correct");
      }
      else {
          System.out.println("Web page is incorrect");

      }
      drive.close();


    }
}
