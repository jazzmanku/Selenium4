package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

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
            System.out.println("Clicking on the check box");
            myCheckbox.click();
        }
        else{
            System.out.println("Check box is selected");
        }

 if( driver.findElement(By.id("text1")).isSelected()== false)
 {
     System.out.println("Clicking on Radio button");
     driver.findElement(By.id("text1")).click();
 }
else
 {
     System.out.println("Radio button is already selected");
 }


        WebElement myButton;
        myButton=driver.findElement(By.id("btn1"));
        System.out.println(myButton.getAttribute("value"));
        myButton.click();
        System.out.println(myButton.getText());

        System.out.println(driver.findElement(By.className("inputFields")).getAttribute("type"));
       // WebElement differentElts = driver.findElements(By.className("inputFields"));


        Thread.sleep(2000);
        driver.close();
    }
}
