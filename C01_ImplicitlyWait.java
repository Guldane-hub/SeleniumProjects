package day03_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ImplicitlyWait {
    public static void main(String[] args) {


/*
        Bir sayfaya gittigimizde internetten kaynakli yada sayfaya ayni anda cok fazla giris yapilmasindan kaynakli
        webelementler hemen yüklenmeyebilir, Dolayisiyla islem yapilmak istenen webelement henuz yuklenmemisse kodlarimiz
        bu elemenit bulamaz ve hata aliriz
        İste bu nedenle implicitlyWait methodu ile bekleme yaparak bu sayfanin yuklenmesini belirteceğimiz maximum icin bekletme saglariz
        İmplicitly wait ile isimizin cogunu hallederiz geriye kalan detaylar icin ilerleyen dersimizde explicitwait ögreneceğiz

     */


//Go to TechProEducation page
//test that the page title contains TechPro Education
//go to facebook page
//test that the page url contains facebook
//go back to techpro page
//Test that you are back
//close the page


        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//driver imiza tum weblemenetleri rahatlikla gösterebilmek icin yaptik
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sayfadaki tum webelementlerin yuklenmesini max 15 saniye icin bekle dedik


        //techpro sayfasına gidiniz
        driver.get("https://techproeducation.com");

        //sayfa başlığının TechPro Education içerdiğini test ediniz
        String expectedData="TechPro Education";
        String actualData=driver.getTitle();

        if(actualData.contains(expectedData)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //facebook sayfasına gidiniz
        driver.get("https://facebook.com");

        //sayfa url'inin facebook içerdiğini test ediniz
        if(driver.getCurrentUrl().contains("facebook")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //techpro sayfasına geri dönününüz
        driver.navigate().back();

        //Geri döndüğünüzü test ediniz
        //1. Yol
        if(driver.getTitle().equals("TechPro Education IT Programs")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //2. Yol
        if(driver.getCurrentUrl().equals("https://techproeducation.com/")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //sayfayı kapatınız
        driver.quit();


    }
}