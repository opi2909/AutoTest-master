package org.example.DrLapushkin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        WebElement webElement1 = driver.findElement(By.xpath(".//input[@id='search_input']"));
        webElement1.click();
        webElement1.sendKeys("Бравекто");

        WebElement webElement2 = driver.findElement(By.xpath(".//button/i"));
        webElement2.click();

        driver.quit();
    }
}
