package shopizer.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import shopizer.tools.Outils;
import shopizer.tools.PageAccueil;
import shopizer.tools.PageBedroom;

public class AddElementPanierTest {

	WebDriver driver;
	String BROWSER = System.getProperty("browser");
	String url= "http://192.168.102.185:8091/shopizer/shop";
	
	@Before
	public void setUp() {
		System.out.println("\n@Before");
		driver = Outils.choisirNavigateur("firefox");
		//driver= Outils.choisirNavigateur(BROWSER);
		driver.manage().window().maximize();
		driver.get(url);
		
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		System.out.println("\n@Test");
		System.out.println("Etape 1 ---------------------------------------------------");
		PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
		pageAccueil.CheckImagePageAccueil();
		
		System.out.println("Etape 2 ---------------------------------------------------");
		Actions hover = new Actions(driver);
	
		hover.moveToElement(pageAccueil.bouton_bedroom).build().perform();
		
	
		
		System.out.println("Etape 3 ---------------------------------------------------");
		System.out.println("Etape 4 ---------------------------------------------------");
		System.out.println("Etape 5 ---------------------------------------------------");
	
	//	PageBedroom bedroom = pageAccueil.goPageBedroom(driver);
		//PageBedroom bedroom = new PageBedroom(driver);
	//	Thread.sleep(3000);
		//bedroom.goPageBedroom(driver);
		driver.close();
	}
}
