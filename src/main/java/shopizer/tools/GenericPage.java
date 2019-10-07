package shopizer.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GenericPage {

	
	protected final WebDriver driver;

	public GenericPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	@FindBy(xpath="//div[@class='mainmenu hidden-xs']//li[@class]//a[@href='/shopizer/shop/category/tables.html/ref=c:1']")
	WebElement bouton_table;
	
	@FindBy(xpath="//div[@class='mainmenu hidden-xs']//li[@class]//a[@href='/shopizer/shop/category/bedroom.html/ref=c:50']")
	WebElement bouton_bedroom;
	
	public PageTable goPageTable(WebDriver driver) {
		bouton_table.click();
		return PageFactory.initElements(driver, PageTable.class);
	}
	
	public PageBedroom goPageBedroom(WebDriver driver) {
		bouton_table.click();
		return PageFactory.initElements(driver, PageBedroom.class);
	}

	
}
