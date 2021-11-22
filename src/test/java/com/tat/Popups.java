package test.java.com.tat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Popups {

    @Test
    public void confirmationPopup(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.manage().window().maximize();
            driver.get(url);
            String promptMessage = driver.findElement(By.id("demo")).getText();
            System.out.println(promptMessage);

            driver.findElement(By.id("confirmBtn")).click();

            Alert confirmation = driver.switchTo().alert();
            Thread.sleep(2000);
            confirmation.accept();
            Thread.sleep(2000);
            promptMessage = driver.findElement(By.id("demo")).getText();
            System.out.println(promptMessage);
            Thread.sleep(2000);
            Assert.assertEquals(promptMessage.toLowerCase().contains("ok"),true);
        }
        /*
        OK
        Ok
        oK
        ok
         */
        catch (Exception e) {
            System.out.println("......................ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            driver.close();
        }
    }

    @Test
    public void alertPopup(){
        WebDriver driver = SeleniumHandler.getDriver("FF");
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.manage().window().maximize();
            driver.get(url);
            driver.findElement(By.id("alertBtn")).click();

            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            Thread.sleep(2000);
            alert.accept();
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
    @Test
    public void promptPopup(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.manage().window().maximize();
            driver.get(url);
            driver.findElement(By.id("promptBtn")).click();

            Alert prompt = driver.switchTo().alert();
            System.out.println(prompt.getText());
            Thread.sleep(2000);
            prompt.sendKeys("Sam");
            Thread.sleep(5000);
            prompt.accept();
            Thread.sleep(2000);

            String message = driver.findElement(By.id("Example")).getText();
            Assert.assertEquals(message.toLowerCase().contains("sam"), true);
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
