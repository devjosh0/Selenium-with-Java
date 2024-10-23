package DropDown;

import Pages.DropdownPage;
import base.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDownTest extends baseTest {
    public WebDriver driver;

    @Test
    public  void testSelectOption(){
        WebElement element = driver.findElement(By.id("jbeca"));
        WebDriverWait wait = new WebDriverWait((WebDriver) element,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
