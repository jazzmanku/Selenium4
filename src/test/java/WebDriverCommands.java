import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/index.htm";
        driver.get(url);

        driver.findElement(By.id("text3")).clear();
        driver.findElement(By.id("text3")).sendKeys("Hello world");

        Thread.sleep(2000);
        driver.findElement(By.name("fname3")).clear();
        driver.findElement(By.name("fname3")).sendKeys("Found by Name");
        WebElement myCheckbox = driver.findElement((By.id("text2")));

        String type = myCheckbox.getAttribute("type");
        System.out.println("Type of the Element: " + type);
        if(type.equals("checkbox") && myCheckbox.isSelected() == false){
            //select it
            myCheckbox.click();
        }

        Thread.sleep(2000);
        driver.close();
    }
}
