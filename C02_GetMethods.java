package day02_drivermethods;

import com.google.common.base.Predicates;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethods{
    public static void main(String[] args) throws InterruptedException {

        // Go to TechproEducation page https://www.techproeducation.com/
        // Print the page title
        //Test if the page title contains "IT"
        // Print the page address (url)
        // Test that the page url contains "education".
        //Print the page handle value
        // Test whether the word "IT Programs" appears in the page HTML codes
        // Close the page.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //  TechproEducation sayfasina gidin. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        //  Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //  Sayfa basliginin "IT" icerdigini test edin
        if(actualTitle.contains("IT")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //  Sayfa adresini(url) yazdirin
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        //  Sayfa url'inin "education" icerdigini test edin.
        if(actualURL.contains("education")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //  Sayfa handle degerini yazdirin
        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        //  Sayfa HTML kodlarinda "IT Programs" kelimesi gectigini test edin
        String techproPageSource = driver.getPageSource();
        if(techproPageSource.contains("IT Programs")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //  Sayfayi kapatin.
        driver.close(); //En son driverin oldugu sayfayi kapatir, oturumu sonlandirmaz
        //   driver.quit(); Bizim otomasyon ile actigimiz birden fazla sekme yada pencereyi kapatmak icin kullaniliriz
        //ve oturumu sonladirir







    }


}


