import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingTextBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        driver.get(url);

        Thread.sleep(2000);
        driver.close();
    }
}
