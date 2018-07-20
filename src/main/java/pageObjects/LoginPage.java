package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver){

        element = driver.findElement(By.cssSelector("#EmailAddress"));
        //     element = driver.findElement(By.id("log"));
        return element;
    }

    public static WebElement txtbx_Password(WebDriver driver) {

        element = driver.findElement(By.cssSelector("#Password"));
        //    element = driver.findElement(By.id("pwd"));

        return element;
    }

    public static WebElement btn_LogIn(WebDriver driver){

        element = driver.findElement(By.cssSelector("#btn-login"));
        return element;
    }

    public static WebElement logoutPullDown(WebDriver driver)    {

        element = driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li > a"));
        return element;

    }

    public static void Log_Out(WebDriver driver)  {                                //Im stuck here. Can open dropdown but not click on 8th <li>

        element = driver.findElement(By.xpath("#mobile-navbar-search > ul > li > ul > li:nth-child(8) > a"));
        element.click();
 //       return element;
    }
}

//  cssselector    #mobile-navbar-search > ul > li > ul > li:nth-child(8) > a
//xpath            //*[@id="mobile-navbar-search"]/ul/li/ul/li[8]/a