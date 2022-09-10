package Webbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoftedge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C://Software//Driver//msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
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
