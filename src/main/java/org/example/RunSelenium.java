package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RunSelenium {
    public WebDriver driver;
    @Test
    public void tryNewSelenium(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals("Web form",title);

//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3L));
//        wait.until(ExpectedConditions.visibilityOf());

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
       WebElement textBox = driver.findElement(By.name("my-text"));
       WebElement submitButton = driver.findElement(By.cssSelector("button"));


       textBox.sendKeys("my-text");
       submitButton.click();

       WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        Assert.assertEquals("Received!",value);

        driver.quit();


    }
}
