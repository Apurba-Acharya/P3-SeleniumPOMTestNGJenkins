package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class ProductsPages {

    public static String formalShoes_xpath= "//h2[@class='FormalShoesTitle']";
    public static String sportsShoes_xpath= "//h2[@class='SportsShoesTitle']";
    public static String snickersShoes_xpath= "//h2[@class='SneakerShoesTitle']";
    public static String formalShoesdrpdown_xpath = "//i[@class='fa fa-angle-double-down formalshoedropdown']";
    public static String sportsShoesdrpdown_xpath = "//i[@class='fa fa-angle-double-down sportsshoedropdown']";
    public static String snickersShoesdrpdown_xpath = "//i[@class='fa fa-angle-double-down sneakershoedropdown']";
    public static String formalShoes_firstShoeName= "/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]";
    public static String sportsShoes_firstShoeName= "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]";
    public static String snickersShoes_firstShoeName= "/html[1]/body[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]";

    public static void formalShoes_verifyTitle(){
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(actualTitleFS, expectedTitleFS);
    }

    public static void sportsShoes_verifyTitle(){
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(actualTitleSS, expectedTitleSS);
    }

    public static void snickersShoes_verifyTitle(){
        String expectedTitleSn = "Sneakers";
        String actualTitleSn = driver.findElement(By.xpath(snickersShoes_xpath)).getText();
        Assert.assertEquals(actualTitleSn, expectedTitleSn);
    }

    public static void formalShoes_drpdown_click(){

    }

    public static void sportsShoes_drpdown_click(){

    }

    public static void snickersShoes_drpdown_click(){

    }

    public static void formalShoes_firstshoename_getTitle(){

    }

    public static void sportsShoes_firstshoename_getTitle(){

    }

    public static void snickersShoes_firstshoename_getTitle(){

    }


}
