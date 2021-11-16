package test.java.com.tat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {

    @Test
    public void singleDropDown(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.get(url);
            Select carDropDown = new Select(driver.findElement(By.id("Carlist")));
            //Selecting individual item in the list
            Thread.sleep(2000);
            carDropDown.selectByIndex(1);
            Thread.sleep(2000);
            carDropDown.selectByValue("Honda Car");
            Thread.sleep(2000);
            carDropDown.selectByVisibleText("Audi");
            Thread.sleep(2000);

            //Looping through the items in the drop down list
            List<WebElement> allOptions = carDropDown.getOptions();
            for(WebElement option : allOptions){
                System.out.println("Option : " + option.getText());
                if(option.getText().contains("Honda")){
                    carDropDown.selectByValue("Honda Car");
                }
            }

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
    public void multipleDropDown(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "file:///home/automationtester/git/Selenium4/webPage/UI_Testing.htm";
        try{
            driver.get(url);
            Select countryDropDownLeft = new Select(driver.findElement(By.name("FromLB")));
            Select countryDropDownRight = new Select(driver.findElement(By.name("ToLB")));
//            List<WebElement> allOptions = carDropDown.getOptions();
//            for(WebElement option : allOptions){
//                System.out.println("Option : " + option.getText());
//            }

            System.out.println("Country drop down multiple ? : " + countryDropDownLeft.isMultiple());
            countryDropDownLeft.deselectAll();
            countryDropDownLeft.selectByIndex(1);
            countryDropDownLeft.selectByIndex(3);
            countryDropDownLeft.selectByIndex(4);
            driver.findElement(By.id("right")).click();
            Thread.sleep(2000);

            //countryDropDownLeft.de
            System.out.println("The items in right list: " + countryDropDownRight.getOptions().size());
            Assert.assertEquals(countryDropDownRight.getOptions().size(),3);

            Thread.sleep(5000);

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
