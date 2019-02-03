package Test;

import Pages.ConfigurationPage;
import Pages.HomePage;
import Pages.InventoryPage;
import Utilites.ConfigurationReader;
import Utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZulhumarSmokeTest extends TestBase {


    @Test
    public void  ConfigurationTest(){

            HomePage homePage = new HomePage();
            driver.get(ConfigurationReader.getProperty("url"));
            homePage.DatabaseDropDown.click();
            homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
            homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            homePage.SignInButton.click();
            homePage.InventoryPage.click();

             ConfigurationPage configurationPage = new ConfigurationPage();
        softAssert.assertTrue(configurationPage.configurationButton.isDisplayed());

        softAssert.assertTrue(ConfigurationPage.isClickable(configurationPage.warehousesManagement));
        softAssert.assertTrue(ConfigurationPage.isClickable(configurationPage.products));

        }

     @Test
    public void WarehousesTest() throws InterruptedException{
         HomePage homePage = new HomePage();
         driver.get(ConfigurationReader.getProperty("url"));
         homePage.DatabaseDropDown.click();
         homePage.username.sendKeys(ConfigurationReader.getProperty("username"));
         homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
         homePage.SignInButton.click();
         homePage.InventoryPage.click();

         ConfigurationPage configurationPage = new ConfigurationPage();
         configurationPage.warehousesManagement.click();

         softAssert.assertTrue(configurationPage.warehouses.isDisplayed());
         Thread.sleep(10000);
         softAssert.assertTrue(configurationPage.operationTypes.isDisplayed());

        softAssert.assertTrue(ConfigurationPage.isClickable(configurationPage.warehouses));
        softAssert.assertTrue(ConfigurationPage.isClickable(configurationPage.operationTypes));
     }
    }

