package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.ca/";
        driver.get(url);

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        System.out.println("Length of the title: " + pageTitle.length());

        String actualUrl = driver.getCurrentUrl();

        if (url.equals(actualUrl)) {
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }

        String pageSource = driver.getPageSource();

        System.out.println(pageSource);

        driver.close();
    }
}
