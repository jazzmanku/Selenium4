import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ca");


        driver.close();
    }
}
