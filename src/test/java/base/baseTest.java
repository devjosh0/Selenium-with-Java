package base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeTest
    public void setup() throws MalformedURLException {
WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
  homePage = new HomePage(driver);

        //driver.manage().window().setSize(new Dimension(375,812));
    }
    @AfterTest
    public void closeBrowser(){
        if (driver != null ){
           driver.quit();
        }
    }

}
