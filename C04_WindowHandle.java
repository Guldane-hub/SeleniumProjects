package day9_iframe_windowhandles_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C04_WindowHandle extends TestBase {


    @Test
    void test01() {

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

        //Başlığın "TechPro Education" icerdigini doğrulayın
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.WINDOW);//-->yeni bir pencere acar ve driveri buraya gecis yaptirir
        driver.get("https://www.youtube.com");


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        waitForSecond(2);

        /*
        Acilmis olan tum pencerelerin window handle degerlerini getWindowHandles() method ile aldik.
        Bu method bize Set return eder, ancak setlerde index kullanarak istedigimiz bir elemani secmek mumkun degildir
        Bu nedenle bizde bu seti kullanarak bir tane List olusturduk
        Listlerde get methodu sayesinde index ile istedigimiz pencereye rahat gecis yapabiliriz
         */

        //techproeducation sayfasına geçiniz,

        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(0));
        waitForSecond(2);

        //youtube sayfasına geçiniz,
        driver.switchTo().window(windowsList.get(1));
        waitForSecond(2);

        //linkedIn sayfasına geçiniz
        driver.switchTo().window(windowsList.get(2));

    }


    @Test
    void test02() {

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

        //Başlığın "TechPro Education" icerdigini doğrulayın
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.WINDOW);//-->yeni bir pencere acar ve driveri buraya gecis yaptirir
        driver.get("https://www.youtube.com");


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        waitForSecond(2);

        //techproeducation sayfasına geçiniz,

        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        waitForSecond(2);

        //youtube sayfasına geçiniz,
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        waitForSecond(2);

        //linkedIn sayfasına geçiniz
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());

    }
}