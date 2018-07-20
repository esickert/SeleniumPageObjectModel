package automationFramework;

import pageObjects.HomePage;
import pageObjects.LoginPage;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import pageObjects.*;

        import java.util.concurrent.TimeUnit;
//
        import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*

        import pageObjects.HomePage;
        import pageObjects.LoginPage;

public class PageObjectModel {

    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception{   // I don't think throwing exception on main is good idea!!!!!!!!!!!!

        //       System.setProperty("webdriver.gecko.driver","c://seleniumDrivers//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","c://seleniumDrivers//chromedriver.exe");

        //       driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.monster.com");
        driver.manage().window().maximize();
        //   driver.get("http://www.store.demoqa.com");

        //******Use page Object library now *************************************************************

        HomePage.lnk_MyAccount(driver).click();
        HomePage.dropDown_Login(driver).click();


        LoginPage.txtbx_UserName(driver).sendKeys("test@paris.com");

        LoginPage.txtbx_Password(driver).sendKeys("Paris111");


        LoginPage.btn_LogIn(driver).click();
        System.out.println("Login Successfully, now lets log off.");

        Thread.sleep(5000);

        HomePage.dropDown_Logout(driver).click();
        LoginPage.Log_Out(driver);
        //I'm confused here!!!!!!!

 //       HomePage.dropDown_Logout(driver).click();
  //      HomePage.Log_Out(driver).click();
 //       System.out.println("Logout Successful!!!!!");

 //       Thread.sleep(5000);
 //       driver.quit();

    }

}
