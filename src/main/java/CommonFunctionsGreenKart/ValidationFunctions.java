package CommonFunctionsGreenKart;

import org.openqa.selenium.By;
import org.testng.Assert;

import ObjectRepository.RepositoryGreenKart;
import TestBase.TestInitialization;

public class ValidationFunctions extends TestInitialization{
	
//This is a sample comment1
	public void discountValidation(String itemName, String price, String discountPrice)
	{
		do {
			if(driver.findElements(By.xpath(RepositoryGreenKart.pricePrefix + "'" 
				     + itemName + "']]")).size() == 1)
			{
			 Assert.assertTrue(driver.findElement(By.xpath(RepositoryGreenKart.discountPricePrefix + "'" 
			     + itemName + "'" + RepositoryGreenKart.discountPriceSuffix)).getText().equals(discountPrice));
			 Assert.assertTrue(driver.findElement(By.xpath(RepositoryGreenKart.pricePrefix + "'" 
				     + itemName + "'" + RepositoryGreenKart.priceSuffix)).getText().equals(price));
			 
			 break;
			}
			
			
			try {
				driver.findElement(By.xpath(RepositoryGreenKart.nextButton)).click();
			}
			catch(Exception e)
			{
				Assert.fail("The item being looked for is not being found");
				break;
			}
		
	    } while (true);

    }
}
