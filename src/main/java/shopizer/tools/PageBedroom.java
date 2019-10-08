package shopizer.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBedroom extends GenericPage {

	public PageBedroom(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='productsContainer']//a[@productid='50']")
	WebElement compact_night_table;
	
	@FindBy(xpath="//div[@id='productsContainer']//a[@productid='152']")
	WebElement antique_recycle_wood_storage;
	
	@FindBy(xpath="//span[@class='lnr lnr-cart']/..")
	WebElement panier_d_achat;
	
	@FindBy(xpath="//a[@onclick='viewShoppingCartPage();']")
	WebElement bouton_paiement;
	
	public PageBedroom addCompactNightTable(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		compact_night_table.click();
		Thread.sleep(1000);
		return PageFactory.initElements(driver, PageBedroom.class);
	}
	
	public PageBedroom addAntiqueRecycleWoodStorage(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		antique_recycle_wood_storage.click();
		Thread.sleep(1000);
		return PageFactory.initElements(driver, PageBedroom.class);
	}
	
	public ShoppingCartPage paiement(WebDriver driver) {
		Actions hover = new Actions(driver);
		hover.moveToElement(panier_d_achat).build().perform();
		bouton_paiement.click();
		return PageFactory.initElements(driver, ShoppingCartPage.class);
	}

}
