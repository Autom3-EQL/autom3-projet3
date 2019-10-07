package shopizer.tools;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTable extends GenericPage {

	@FindBy(xpath="(//ul[@class=\"nav nav-list\"]/li/a)[1]")
	private static WebElement bouton_default;
	
	@FindBy(xpath="(//ul[@class=\"nav nav-list\"]/li/a)[2]")
	private static WebElement bouton_asian_wood;
	
	@FindBy(xpath="(//ul[@class=\"nav nav-list\"]/li/a)[3]")
	private static WebElement bouton_roots;
	
	public PageTable(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void CheckProductsPrices() throws FileNotFoundException {
		List<String> Liste1 = Outils.loadFile("src/main/resources/FichiersProduits/ObjetsTable.txt");
		List<WebElement> Liste2 = driver.findElements(By.xpath("//div[@id='productsContainer']//h3 | //div[@id='productsContainer']//span"));
		List<String> Liste3 = new ArrayList<String>();
		Liste2.stream().map(WebElement::getText).forEach(Liste3::add);
		assertEquals(Liste1, Liste3);
	}
	public void ClickFiltreDefault()  {
		bouton_default.click();
	}
	
	public void CheckProductsPricesDefault() throws FileNotFoundException {
		List<String> Liste4 = Outils.loadFile("src/main/resources/FichiersProduits/ObjetsTableDefault.txt");
		List<WebElement> Liste5 = driver.findElements(By.xpath("//div[@id='productsContainer']//h3"));
		List<String> Liste6 = new ArrayList<String>();
		Liste5.stream().map(WebElement::getText).forEach(Liste6::add);
		assertEquals(Liste4, Liste6);
	}
		
	public void ClickFiltreAsianWood()  {
		bouton_asian_wood.click();
	}
	
	public void CheckProductsPricesAsianWood() throws FileNotFoundException {
		List<String> Liste7 = Outils.loadFile("src/main/resources/FichiersProduits/ObjetsTableDefault.txt");
		List<WebElement> Liste8 = driver.findElements(By.xpath("//div[@id='productsContainer']//h3"));
		List<String> Liste9 = new ArrayList<String>();
		Liste8.stream().map(WebElement::getText).forEach(Liste9::add);
		assertEquals(Liste7, Liste9);
		
	}
	public void ClickFiltreRoots()  {
		bouton_roots.click();
	}
	
	public void CheckProductsPricesRoot() throws FileNotFoundException {
		List<String> Liste10 = Outils.loadFile("src/main/resources/FichiersProduits/ObjetsTableDefault.txt");
		List<WebElement> Liste11 = driver.findElements(By.xpath("//div[@id='productsContainer']//h3"));
		List<String> Liste12 = new ArrayList<String>();
		Liste11.stream().map(WebElement::getText).forEach(Liste12::add);
		assertEquals(Liste10, Liste12);
	}
}
