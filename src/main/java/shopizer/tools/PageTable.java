package shopizer.tools;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageTable extends GenericPage {

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
}
