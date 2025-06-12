package Tests;

import Pages.HomePage;
import Pages.ProductsPages;
import Pages.ProductsPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class SeleniumTest {

    public static WebDriver driver;
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        HomePage.click_hamburger_menu();
        HomePage.click_OrderProducts_link();
    }

    public static String capture(WebDriver driver) throws IOException, IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../ExecImages/" + System.currentTimeMillis() + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }

    @Test
    void validateTitles_onlineProducts() throws IOException {
        test = extent.createTest("Validate Shoe Titles on Products Page", "This test validates that the different Shoetypes are correct on Online products Page");
        ProductsPages.formalShoes_verifyTitle();
        ProductsPages.sportsShoes_verifyTitle();
        ProductsPages.snickersShoes_verifyTitle();
        extent.flush();
    }

    @Test
    void validateFirstFormalShoes(){
        test = extent.createTest("ValidateFirst Formal Shoename", "This test validates first formal shoes on Online products Page");
        ProductsPages.formalShoes_firstShoe_verify();
    }

    @Test
    void validateFirstSportsShoes(){
        test = extent.createTest("ValidateFirst Sports Shoename", "This test validates first sports shoes on Online products Page");
        ProductsPages.sportsShoes_firstShoe_verify();
    }

    @Test
    void validateFirstSnickersShoes(){
        test = extent.createTest("ValidateFirst Snickers Shoename", "This test validates first snickers shoes on Online products Page");
        ProductsPages.snickersShoes_firstShoe_verify();
    }

    @AfterSuite
    public static void cleanup (){
        extent.flush();
    }
}
