package shopizer.tools;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil extends GenericPage{
	
public PageAccueil(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
		@FindBy(xpath="//img[@src='https://s3.ca-central-1.amazonaws.com/shopizer-lightsail/files/DEFAULT/banner.jpg']")
		WebElement image_accueil;
        public void CheckImagePageAccueil() {
    	  
    	  Assert.assertEquals(true, image_accueil.isDisplayed());
    		
    	 
      }
}
