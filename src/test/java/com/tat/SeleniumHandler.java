package test.java.com.tat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.logging.Level;

public class SeleniumHandler {

    private static final String PROPERTY_DRIVER_CHROME = "webdriver.chrome.driver";
    private static final String PATH_DRIVER_CHROME = "./driver/chromedriver";
    private static final String PROPERTY_DRIVER_FIREFOX = "webdriver.gecko.driver";
    private static final String PATH_DRIVER_FIREFOX = "./driver/geckodriver";;


    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "CHROME":
                System.setProperty(PROPERTY_DRIVER_CHROME, PATH_DRIVER_CHROME);
                System.setProperty("webdriver.chrome.logfile", "./logs/chromedriver.log");
                System.setProperty("webdriver.chrome.verboseLogging", "true");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments(new String[]{"--headless","--ignore-certificate-errors","--no-sandbox"});

                driver = new ChromeDriver(chromeOptions);
                break;
            case "FF":
            default:
                FirefoxOptions options = new FirefoxOptions();
                options.setLogLevel(FirefoxDriverLogLevel.fromLevel(Level.WARNING));


                System.setProperty(PROPERTY_DRIVER_FIREFOX, PATH_DRIVER_FIREFOX);
                driver = new FirefoxDriver(options);
                break;
        }
        return driver;
    }
}
