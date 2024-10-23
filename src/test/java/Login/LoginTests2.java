package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.baseTest;
import org.testng.annotations.Test;

public class LoginTests2 extends baseTest {
    @Test
    public void successfulLogin3(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
        closeBrowser();
    }
}
