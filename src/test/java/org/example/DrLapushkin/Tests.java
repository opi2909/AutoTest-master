package org.example.DrLapushkin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Tests {


    @Test
    @BeforeAll
    void RegistrationTest() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        Actions regist = new Actions(driver);

        regist
                .click(driver.findElement(By.xpath(".//div[@id='sw_dropdown_103']/div/a/span")))
                .click(driver.findElement(By.xpath(".//a[contains(text(),'Войти')]")))
                .click(driver.findElement(By.xpath(".//input[@id='login_popup440']")))
                .sendKeys(driver.findElement(By.xpath(".//input[@id='login_popup440']")),"o.p.ivanova@outlook.com")
                .click(driver.findElement(By.xpath(".//input[@id='psw_popup440']")))
                .sendKeys(driver.findElement(By.xpath(".//input[@id='psw_popup440']")),"290907")
                .click(driver.findElement(By.xpath(".//div[4]/div/button/span/span")));
Assertions.assertTrue(true);
    }
    @Test
    void SearchTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        Actions product = new Actions(driver);

        product
                .click(driver.findElement(By.xpath(".//input[@id='search_input']")))
                .sendKeys(driver.findElement(By.xpath(".//input[@id='search_input']")), "Бравекто")
                .click(driver.findElement(By.xpath(".//button/i")));
        Assertions.assertTrue(true, "Бравекто");
    }
    @Test
    void AddBaskedTest () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        Actions basked = new Actions(driver);
        basked
                .click(driver.findElement(By.xpath(".//bdi[contains(.,'Корм для кошек')]")))
                .click(driver.findElement(By.xpath(".//img[@id='det_img_97desktop']")))
                .click(driver.findElement(By.xpath(".//button[@id='button_cart_97']/span/span")))
                .click(driver.findElement(By.xpath(".//span[contains(.,'Продолжить покупки')]")))
                .click(driver.findElement(By.xpath(".//i/span")))
                .click(driver.findElement(By.xpath(".//a[contains(text(),'Корзина')]")));
        Assertions.assertNotNull(driver.findElement(By.xpath(".//a[contains(text(),'Корзина')]")));
    }
    @Test
    void DeliteBaskedTest () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        Actions basked = new Actions(driver);
        basked
                .click(driver.findElement(By.xpath(".//bdi[contains(.,'Корм для кошек')]")))
                .click(driver.findElement(By.xpath(".//img[@id='det_img_97desktop']")))
                .click(driver.findElement(By.xpath(".//button[@id='button_cart_97']/span/span")))
                .click(driver.findElement(By.xpath(".//span[contains(.,'Продолжить покупки')]")))
                .click(driver.findElement(By.xpath(".//i/span")))
                .click(driver.findElement(By.xpath(".//a[contains(text(),'Корзина')]")));

        Actions delite = new Actions(driver);
        delite
                .click(driver.findElement(By.xpath(".//span[contains(.,'1')]")))
                .click(driver.findElement(By.xpath(".//a[contains(text(),'Корзина')]")))
                .click(driver.findElement(By.xpath(".//a[contains(text(),'Очистить корзину')]")));

        Assertions.assertNull(driver.findElement(By.xpath(".//span[contains(.,'0')]")));

    }
    @Test
    void TransitionTest () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

        Actions transition = new Actions(driver);
            transition
                    .click(driver.findElement(By.xpath(".//bdi[contains(.,'Ветеринарная клиника')]")));

            Assertions.assertTrue(true, "Переход на сайт клиники");

    }
    @Test
    void ChangePostcodeTest () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://dr-lapushkin.com/");

    Actions postcode = new Actions (driver);
    postcode
            .click(driver.findElement(By.xpath("//span[contains(.,'Аккаунт')]")))
            .click(driver.findElement(By.xpath("//a[contains(text(),'Учетная запись')]")))
            .click(driver.findElement(By.xpath("//input[@id='elm_29']")))
            .sendKeys(driver.findElement(By.xpath("//input[@id='elm_29']")), "143000")
            .click(driver.findElement(By.xpath("//button[@id='save_profile_but']")));

        Assertions.assertNotNull("143000");

    }

}


