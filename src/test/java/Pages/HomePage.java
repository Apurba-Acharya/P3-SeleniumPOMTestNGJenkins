package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String onlineProducts_link_xpath = "//li[normalize-space()='Online Products']";


    public static void click_hamburger_menu(){
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_OrderProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(onlineProducts_link_xpath)).click();
    }

}
