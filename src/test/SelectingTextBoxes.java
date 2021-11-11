package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectingTextBoxes {
    /*
            1. By ID
            2. By Name
            3. By ClassName
                ClassName = textBoxes
            4. By TagName
                <input>
            5. By CSS
                Selecting multiple Textboxes => by class = textBoxes
                Selecting one Textbox => by id
            6. By Xpath
                By class
                By type
                By tagName
             */
    @Test
    public void TC01_testByClassName_countIs4()  {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.get(url);
            List<WebElement> webElementList =  driver.findElements(By.className("textBoxes"));
            System.out.println(webElementList.size());
            Assert.assertEquals(webElementList.size(),4);

            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println("......................ERROR: " + e.getMessage());
        }
        finally {
            driver.quit();
        }
    }

    @Test
    public void TC02_testByClassName_countIs4()  {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.get(url);
           List<WebElement> webElementList;
//            webElementList =  driver.findElements(By.tagName("input"));
//            webElementList =  driver.findElements(By.className("textBoxes"));
//            webElementList =  driver.findElements(By.className("textBoxes"));
//            webElementList =  driver.findElements(By.xpath("//input"));
//            webElementList =  driver.findElements(By.xpath("//*[@class=\"textBoxes\"]"));
//            webElementList =  driver.findElements(By.xpath("//*[@type='text']"));
            webElementList =  driver.findElements(By.cssSelector(".textBoxes"));
//            webElementList =  driver.findElements(By.cssSelector("#text2"));

            System.out.println(webElementList.size());
            //className => .
            //id        => #
            for(WebElement element : webElementList){
                String nameValue = element.getAttribute("name");
                if(nameValue.equals("lname")){
                    element.sendKeys("Last Name");
                }
            }
            Thread.sleep(2000);
        }
        catch (Exception e) {
            System.out.println("......................ERROR: " + e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
