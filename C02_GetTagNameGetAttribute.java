package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetTagNameGetAttribute {

    //go to techproeducation page
    //Test that the tag name of the search box is input
    //Test that the value of the search box's class attribute is form-input
    //close the page



    @Test
    void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //  Thread.sleep(3000);


        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");


        //arama kutusunun tag name'inin input olduğunu test edelim
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String expectedTagName ="input";

        String actualTagName =searchBox.getTagName();
        Assertions.assertEquals(expectedTagName,actualTagName);

        //arama kutusunun class attribütunun değerinin form-input olduğunu test ediniz
      /* String expectedClassAttribut = "from-input";
        String actualClassAttribut = searchBox.getAttribute("class");
        Assertions.assertEquals(expectedClassAttribut,actualClassAttribut);*/

        String actualAttributeValue = searchBox.getAttribute("class");
        String expectedAttributeValue = "form-input";
        Assertions.assertEquals(expectedAttributeValue,actualAttributeValue);

        //sayfayı kapatınız
        driver.quit();

    }
}
