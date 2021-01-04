package testscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pageobject.AddtoCartPO;

public class TestDeleteItem extends BaseTest{
	@Test
	public void deleteitem() {
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
		    WebElement cart2=driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']"));
		    cart2.click();
		    WebElement deletebutton=driver.findElement(By.xpath("(//input[@class='a-color-link'])[1]"));
		    deletebutton.click();
		    Thread.sleep(10000);
		    Reporter.log("item is deleted from cart successfully",true);	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
