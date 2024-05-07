package day04_assertions_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C01_Assertions {


/*
    Junit 4 te assertion yapmak icin Assert classi kullaniliyordu
    Junit 5 te assertion yapmak icin Assertions classi kullanilir
     */


    @Test
    void test01() {
        String expectedData="Junit 4";
        String actualData="Junit 4";

        Assertions.assertEquals(expectedData,actualData);
    }



    @Test
    void test02() {

        Assertions.assertTrue(13<5);
    }

    @Test
    void test03() {
        Assertions.assertFalse("selenium".contains("E"));
    }

    @Test
    void test04() {
        Assertions.assertNotEquals("selenium","junit");
    }

    //Not : iki array in esit olmasi icin ayni index te ayni eleman olmasi gerekir.
    @Test
    void test05() {
        char [] expectedArray ={'j','u','n','i','t'};
        char [] actualArray ={'J','u','i','n','t'};
        Assertions.assertArrayEquals(expectedArray,actualArray);
    }

    //assertNull(str); parantez icinde belirtilen deger null ise test basarili olur
    //degilse test basarisiz olur
    @Test
    void test06(){
        String str =null;

        Assertions.assertNull(str);


    }
    //assertNotNull(str); parantez icinde belirtilen deger null degil ise test basarili olur
    //null ise test basarisiz olur
    @Test
    void test07(){
        String str ="junit";
        Assertions.assertNotNull(str);
    }
}
