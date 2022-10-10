package org.example.DrLapushkin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        WebElement webElement1 = driver.findElement(By.xpath(".//bdi[contains(.,'Корм для кошек')]"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath(".//img[@id='det_img_97desktop']"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath(".//button[@id='button_cart_97']/span/span"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath(".//span[contains(.,'Продолжить покупки')]"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.xpath(".//i/span"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath(".//a[contains(text(),'Корзина')]"));
        webElement6.click();
    }
}
