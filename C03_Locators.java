package day04_assertions_webelements_locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {

    //Go to Amazon page
    //Locate the search box and print and search for iPhone
    //close the page

    @Test
    void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        Thread.sleep(5000);


       /* <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        aria-label="Search Amazon" spellcheck="false">*/

       //1. YOL
        //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone", Keys.ENTER);
        searchBox.submit();

       /* Bir arama kutusuna locate edip bir text gonderirsek iki sekilde enter tusuna basip aratabiliriz
        1)submit() methodu
        2)Keys.Enter (==>ENUM)
         */
        //2. YOL
        //Eger almis oldugumuz locate i bir kere kullanacaksak;
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);

        //3. YOL (name attribute)
        driver.findElement(By.name("field-keywords")).sendKeys("iphone",Keys.ENTER);

        //sayfayı kapatınız
        //driver.quit();





    }
}