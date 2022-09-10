package Webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        String Title = driver.getTitle();
        if (Title.equals("nopCommerce demo store")) {
            System.out.println("page Title is correct");
        }
        else{
            System.out.println("page title incorrect");
        }
    }
}
