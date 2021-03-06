package Pages;

import Utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/div[1]/a/span")
    public WebElement Dashborad;

    @FindBy(xpath = "( //span[contains(text(),'Delivery Orders')])")
    public WebElement DeliveryOrders;

    @FindBy(xpath = "(//span[contains(text(),'Manufacturing')])")
    public WebElement ManufacturingPage;

    @FindBy(xpath = "(//a[@href='/web#menu_id=376&action=516'])")
    public WebElement productMove;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[9]/div/div[1]/div[1]/div[1]/a")
    public WebElement sunnySun;


}
