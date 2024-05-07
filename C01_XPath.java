package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {

       /*

    /  -> Bir alt childi secer
    // -> Sayfadaki herhangi bir webelementi secer  //div
    @  -> Bir webelementin attribute unu secmek icin kullanilir
    [] -> Index veya kosul belirtmek icin kullanilir
    *  -> All farketmeksizin sec demektir

    SYNTAX:
    //tagName [ @ attributeName  = 'attributeValue'  ]
    // *      [ @   *            = 'attributeValue'  ]
   (//tagName [ @ attributeName  = 'attributeValue' ]) [ index ]

     */

    //go to the web page. https://www.amazon.com/
//Search "city bike" in the search box (locate the search box with xpath)
//Print the number of relevant results displayed on Amazon
//Just print the result number
//Then click on the text of the first result that appears.
//close the page


    @Test
    void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get(" https://www.amazon.com/");

        Thread.sleep(5000);//captcha yi manuel olarak asmak icin sure koyduk



        //Arama kutusunda "city bike" aratin (arama kutusunu xpath ile locate edin)

        WebElement searcBox = driver.findElement(By.xpath("//input[ @ type = 'text' ]"));
        searcBox.sendKeys("city bike", Keys.ENTER);
        
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

       WebElement resultText =  driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("resultText = " + resultText.getText());

        //Sadece sonuc sayısını yazdırınız
        System.out.println("Sonuc Sayisi =" + resultText.getText().split(" ")[2]);


        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        driver.findElement(By.xpath("(//h2)[1]/a")).click();



        //sayfayi kapatınız
driver.quit();


    }
}