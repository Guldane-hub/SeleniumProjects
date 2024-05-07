package day16_extentreport_webtables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_ExtentReport extends TestBase {


    //Go to Amazon page
    //Search selenium in the search box
    //Verify that the page title contains selenium

    @Test
    void test01() {

        //Amazon title test adinda yeni bir test raporu olusturmak icin alt yapiyi ayarlar
        createExtentReport("Amazon Title Test");

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        extentTest.info("Kullanici amazon sayfasina gider");
        waitForSecond(3);

        //tüm sayfa ekran görüntüsünü alarak rapora ekler
        addScreenShotToReport();


        //Arama kutusunda selenium aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");

        //searchbox webelementinin ekran görüntüsün rapora ekledik
        addScreenShotOfWebElementToReport(searchBox);

        searchBox.submit();
        extentTest.info("Arama kutusunda selenium yazilarak aratildi");

        waitForSecond(1);
        //Sayfa basliginin selenium icerdigini doğrulayalim
        Assertions.assertTrue(driver.getTitle().contains("selenium"));
        extentTest.pass("Sayfa basliginin selenium icerdigini doğrulandi");

        //tüm sayfa ekran görüntüsünü alarak rapora ekler
        addScreenShotToReport();

        extentReports.flush();
    }
}
