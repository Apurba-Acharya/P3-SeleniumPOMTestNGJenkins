package Pages;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static Tests.SeleniumTest.*;


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

    public static void formalShoes_verifyTitle() throws IOException {
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(actualTitleFS, expectedTitleFS);
        if (expectedTitleFS.equals(actualTitleFS)){
            test.log(Status.PASS, "Test Passed for title verification of Formal Shoes");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver)) + "Test Passed");
        }else{
            test.log(Status.FAIL, "Test Failed for title verification of Formal Shoes");
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

    public static void sportsShoes_verifyTitle(){
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(actualTitleSS, expectedTitleSS);
        if (expectedTitleSS.equals(actualTitleSS)){
            test.log(Status.PASS, "Test Passed for title verification of Sports Shoes");
        }else{
            test.log(Status.FAIL, "Test Failed for title verification of Sports Shoes");
        }
    }

    public static void snickersShoes_verifyTitle(){
        String expectedTitleSn = "Sneakers";
        String actualTitleSn = driver.findElement(By.xpath(snickersShoes_xpath)).getText();
        Assert.assertEquals(actualTitleSn, expectedTitleSn);
        if (expectedTitleSn.equals(actualTitleSn)){
            test.log(Status.PASS, "Test Passed for title verification of Snickers Shoes");
        }else{
            test.log(Status.FAIL, "Test Failed for title verification of Snickers Shoes");
        }
    }

    public static void formalShoes_firstShoe_verify(){
        String expectedFirstFormalShoe = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesdrpdown_xpath)).click();
        String actualFirstFormalShoe = driver.findElement(By.xpath(formalShoes_firstShoeName)).getText();
        Assert.assertEquals(expectedFirstFormalShoe, actualFirstFormalShoe);
        if (expectedFirstFormalShoe.equals(actualFirstFormalShoe)){
            test.log(Status.PASS, "Test Passed for first shoe name of Formal shoe i.e Classic Cheltenham");
        }else{
            test.log(Status.FAIL, "Test Failed for first shoe name of Formal shoe i.e Classic Cheltenham");
        }
    }

    public static void sportsShoes_firstShoe_verify(){
        String expectedFirstSportsShoe = "   Ultimate";
        driver.findElement(By.xpath(sportsShoesdrpdown_xpath)).click();
        String actualFirstSportsShoe = driver.findElement(By.xpath(sportsShoes_firstShoeName)).getText();
        Assert.assertEquals(expectedFirstSportsShoe, actualFirstSportsShoe);
        if (expectedFirstSportsShoe.equals(actualFirstSportsShoe)){
            test.log(Status.PASS, "Test Passed for first shoe name of Formal shoe i.e Ultimate");
        }else{
            test.log(Status.FAIL, "Test Failed for first shoe name of Formal shoe i.e Ultimate");
        }
    }

    public static void snickersShoes_firstShoe_verify(){
        String expectedFirstSnickersShoe = "   Archivo";
        driver.findElement(By.xpath(snickersShoesdrpdown_xpath)).click();
        String actualFirstSnickersShoe = driver.findElement(By.xpath(snickersShoes_firstShoeName)).getText();
        Assert.assertEquals(expectedFirstSnickersShoe, actualFirstSnickersShoe);
        if (expectedFirstSnickersShoe.equals(actualFirstSnickersShoe)){
            test.log(Status.PASS, "Test Passed for first shoe name of Formal shoe i.e Archivo");
        }else{
            test.log(Status.FAIL, "Test Failed for first shoe name of Formal shoe i.e Archivo");
        }
    }

    public static void formalShoes_firstshoename_getTitle(){

    }

    public static void sportsShoes_firstshoename_getTitle(){

    }

    public static void snickersShoes_firstshoename_getTitle(){

    }


}
