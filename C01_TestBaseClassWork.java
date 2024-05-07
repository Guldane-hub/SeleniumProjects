package day08_testbase_alert;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;

public class C01_TestBaseClassWork  extends TestBase {

    @Test
    void test01() {
        driver.get("https://google.com")  ;
    }


}





