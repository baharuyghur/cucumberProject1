package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driver {
	
public static WebDriver driver;
    
    
    public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigurationReader.getProperty("browser")) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "chrome-headless":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);

                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "firefox-headless":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                break;
            case "edge":
                if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                    throw new WebDriverException("Your OS doesn't support EDGE");
                }
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "safari":
                if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                    throw new WebDriverException("Your OS doesn't support Safari");
                }
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driver = new SafariDriver();
                break;

            }

            driver.get(ConfigurationReader.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Constants.implicitWait_time, TimeUnit.SECONDS);
            PageInitializer.intializer();

        }

        return driver;
    }

    // driver close function
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }}