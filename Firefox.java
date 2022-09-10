package Webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "C:\\Software\\Driver//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        String Title = driver.getTitle();
        if (Title.equals("nopCommerce demo store")) {
            System.out.println("page Title is correct");
        } else {
            System.out.println("page title incorrect");
        }
    }
}
