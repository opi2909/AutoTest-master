package org.example.DrLapushkin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        WebElement webElement1 = driver.findElement(By.xpath(".//div[@id='sw_dropdown_103']/div/a/span"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath(".//a[contains(text(),'Войти')]"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='login_popup440']"));
        webElement3.click();
        webElement3.sendKeys("o.p.ivanova@outlook.com");

        WebElement webElement4 = driver.findElement(By.xpath(".//input[@id='psw_popup440']"));
        webElement4.click();
        webElement4.sendKeys("290907");

        WebElement webElement5 = driver.findElement(By.xpath(".//div[4]/div/button/span/span"));
        webElement5.click();
    }
}
