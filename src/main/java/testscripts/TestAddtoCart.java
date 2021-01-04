package testscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pageobject.AddtoCartPO;

public class TestAddtoCart extends BaseTest{
	@Test
	public void addtocart() {
		try {
			AddtoCartPO atc= new AddtoCartPO(driver);
			atc.Searchbar().clear();
			atc.Searchbar().click();
			atc.Searchbar().sendKeys(search);
			atc.Searchbar().sendKeys(Keys.ENTER);
			
			atc.EarPhone().click();
			ArrayList<String> secondtab = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(secondtab.get(1));
		    driver.navigate();
		    WebElement cart = driver.findElement(By.xpath("(//input[contains(@value,'Add to Cart')])[1]"));
		    cart.click();
		    Thread.sleep(10000);
		    Reporter.log("item added to cart successfully",true);		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
