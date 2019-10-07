package shopizer.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import shopizer.tools.Outils;
import shopizer.tools.PageBedroom;

public class AddElementPanierTest {

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
	public void test() {
		System.out.println("\n@Test");
		PageBedroom bedroom = new PageBedroom(driver);
		bedroom.goPageBedroom(driver);
		driver.close();	
	}
}
