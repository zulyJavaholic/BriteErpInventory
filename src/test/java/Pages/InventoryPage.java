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

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[4]/div/div[1]/div[1]/div[1]/a")
    public WebElement DeliveryOrders;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/a")
    public WebElement ManufacturingPage;


}
