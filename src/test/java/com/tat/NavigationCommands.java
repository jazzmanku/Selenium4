package test.java.com.tat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.ca/";
        driver.get(url);

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.navigate().to("https://theautomationtechies.com/");
        pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.navigate().back();
        pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.close();
    }
}
