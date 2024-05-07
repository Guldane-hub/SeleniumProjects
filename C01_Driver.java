package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_Driver {
    public static void main(String[] args) {

/*
    WebdriverManager sayesinde istedigimiz browser icin setup yaparak otomasyonda kullanabiliriz
    Bu sayede browser a gore gerekli olan driver i bilgisayarimiza indirmek, yapilandirmak.. zorunda kalmayiz
     */


            WebDriverManager.chromedriver().setup();
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://google.com");
            chromeDriver.quit();

            WebDriverManager.edgedriver().setup();
            WebDriver edgeDriver = new EdgeDriver();
            edgeDriver.get("https://google.com");
            edgeDriver.quit();

            WebDriverManager.firefoxdriver().setup();
            WebDriver firefoxDriver = new FirefoxDriver();
            firefoxDriver.get("https://google.com");
            firefoxDriver.quit();

        }
    }

