package test.java.com.tat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UploadFiles {

    @Test
    public void uploadFile(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.get(url);
            WebElement fileUpload = driver.findElement(By.name("img"));
            fileUpload.sendKeys(System.getProperty("user.home") +"/test.txt");

            Thread.sleep(2000);

        }
        catch (Exception e) {
            System.out.println("......................ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            driver.close();
        }
    }
}
