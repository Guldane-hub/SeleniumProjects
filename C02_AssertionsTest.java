package day04_assertions_webelements_locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AssertionsTest {

    // Go to Google Website
    //Verify that the page title is Google
    // Close the page

    // Go to Google Website
    // Verify that the page url is https://www.google.com/
    // Close the page


    // Google Web sitesine gidin
    // Sayfa basliginin Google oldugunu dogrulayin
    // Sayfayi kapatin


    // Google Web sitesine gidin
    // Sayfa url nin https://www.google.com/ oldugunu dogrulayin
    // Sayfayi kapatin



   /* @Test
    void testPageTitle() {
        // Google Web sitesine gidin

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.get("https://www.google.com/");





        // Sayfa basliginin Google oldugunu dogrulayin
        String expectedTitle ="Google";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle,actualTitle);


        // Sayfayi kapatin
        driver.quit();


    }
    @Test
    void testUrl(){
        // Google Web sitesine gidin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.get("https://www.google.com/");


        // Sayfa url nin https://www.google.com/ oldugunu dogrulayin
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);
        // Sayfayi kapatin
        driver.quit();*/


    WebDriver driver;
    @BeforeEach
    void setUp() {
        // Google Web sitesine gidin
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.get("https://www.google.com/");
    }

    @Test
    void testPageTitle() {
        // Sayfa basliginin Google oldugunu dogrulayin
        String expectedTitle="Google";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle,actualTitle);
    }

    @Test
    void testUrl() {
        // Sayfa url nin https://www.google.com/ oldugunu dogrulayin
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);
    }

    @AfterEach
    void tearDown() {
        // Sayfayi kapatin
        driver.quit();
    }



}
