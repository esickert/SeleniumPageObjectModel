package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    private static WebElement element = null;

    public static WebElement lnk_MyAccount(WebDriver driver) {

        element = driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li.dropdown > a"));
        return element;

    }

    public static WebElement dropDown_Login(WebDriver driver)    {

        element = driver.findElement(By.cssSelector("#s-menu-d > li:nth-child(1) > a"));
        return element;

    }

    public static WebElement dropDown_Logout(WebDriver driver)  {

        element = driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li > a"));
        return element;
    }

}
