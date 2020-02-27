package com.myendnoteweb.tests.registration;

import com.myendnoteweb.tests.base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class RegistrationPageTest extends BaseTest {
    String email;
    @Test
    public void registration() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.get("http://www.yopmail.com/ru/email-generator.php");
        email = driver.findElement(By.xpath(".//input[contains(value, '') and (@name)]")).getAttribute("value");
        System.out.println(email);
        driver.findElement(By.xpath(".//input[contains(@value, 'Проверить почту')]")).click();
        driver.switchTo().window(tabs.get(1));
        driver.get(getHost());
        getRegistrationPage().getFirstRegistrationButton().click();
        getRegistrationPage().getEmailAddressField().click();
        getRegistrationPage().getEmailAddressField().clear();
        getRegistrationPage().getEmailAddressField().sendKeys(email);
        getRegistrationPage().getPasswordField().sendKeys(getPassword());
        getRegistrationPage().getReEnterPassword().click();
        getRegistrationPage().getReEnterPassword().clear();
        getRegistrationPage().getReEnterPassword().sendKeys(getPassword());
        getRegistrationPage().getFirstNameField().click();
        getRegistrationPage().getFirstNameField().clear();
        getRegistrationPage().getFirstNameField().sendKeys(getFirstName());
        getRegistrationPage().getLastNameField().click();
        getRegistrationPage().getLastNameField().clear();
        getRegistrationPage().getLastNameField().sendKeys(getLastName());
        getRegistrationPage().getSecondRegistrationButton().click();
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000); //This will be changed!!!
        driver.findElement(By.xpath(".//a[contains(@id,'lrefr')]")).click();
        driver.switchTo().frame(getRegistrationPage().getIframeInBox());
        driver.findElement(By.xpath(".//span[contains(text(),'EndNote')]")).click();
        driver.navigate().refresh();
        driver.switchTo().frame(getRegistrationPage().getIframeMail());
        driver.findElement(By.xpath(".//a[contains(text(),'Click here to activate')]")).click();
        driver.get("https://access.clarivate.com/notification?app=endnote&email="+email+"&status=activate_link_success");
        driver.switchTo().window(tabs.get(1));
        driver.findElement(By.xpath(".//button")).click();
        getRegistrationPage().getLoginOnTheLoginPage().sendKeys(email);
        getRegistrationPage().getPasswordOnTheLoginPage().sendKeys(getPassword());
        getRegistrationPage().getSignInButtonOnLoginPage().click();

        System.out.println("All good?");

    }

}
