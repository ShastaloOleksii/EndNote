package com.myendnoteweb.tests;

import com.myendnoteweb.MainPage;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPageTests extends MainPage {
    WebDriverWait wait;


    @Test
    public void mainPageApprove() {
        signIN();
        clickByXpath(".//img[@id='proSmallImg']");
        Assert.assertTrue(isWebElementDisplayedXpath("//span[contains(@class,'fa-cog')]"));

    }

    /*@Test
    public void mainPageApprove() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'fa-cog')]")));
        driver.findElement(By.xpath("//img[@id='proSmallImg']")).click();
        driver.findElement(By.xpath("//span[contains(@class,'fa-cog')]")).isDisplayed();
    }*/
    @Test
    public void mainTabsMenu() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//div[contains(@class,'navbar-default')]"));
    }

    /*@Test
    public void mainTabsMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'navbar-default')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'navbar-default')]")).isDisplayed());
    }
*/
    @Test
    public void logoPresent() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedXpath("//img[contains(@alt,'Clarivate Analytics')]"));

    }
   /* @Test
    public void logoPresent() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt,'Clarivate Analytics')]")));
        driver.findElement(By.xpath("//img[contains(@alt,'Clarivate Analytics')]")).isDisplayed();

    }
*/

    @Test
    public void localizationPanel() {
        signIN();
        Assert.assertTrue(isWebElementDisplayedID("languages1"));


    }
    /*@Test
    public void localizationPanel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("languages1")));
        Assert.assertTrue(driver.findElement(By.id("languages1")).isDisplayed());
    }
*/

}
