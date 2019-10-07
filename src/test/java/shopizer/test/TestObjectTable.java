package shopizer.test;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import shopizer.tools.Outils;
import shopizer.tools.PageAccueil;
import shopizer.tools.PageTable;

public class TestObjectTable {

		WebDriver driver;
		String b = "firefox";
		//private String BROWSER=System.getProperty("browser");
		String url= "http://192.168.102.185:8091/shopizer/shop";
		
		@Before
		public void setUp() {
			System.out.println("\n@Before");
			driver= Outils.choisirNavigateur(b);
			//driver= Outils.choisirNavigateur(BROWSER);
			driver.manage().window().maximize();
			driver.get(url);
			driver.findElements(By.xpath("//img[@src='https://s3.ca-central-1.amazonaws.com/shopizer-lightsail/files/DEFAULT/banner.jpg']"));
		}
		
		@Test
		public void test() throws FileNotFoundException, InterruptedException {
		PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
		pageAccueil.goPageTable(driver);
		PageTable pageTable = PageFactory.initElements(driver, PageTable.class);
		//Verif du fil d'arianne
		driver.findElements(By.xpath("//ol[@class='breadcrumb']"));
		
		//Verif des 4 éléments
		PageTable pagetable = new PageTable(driver);
		pagetable.CheckProductsPrices();
		
		driver.close();	
		
	
		
}
}


