package testscripts;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pageobject.AddtoCartPO;
import pageobject.AmazonSearchResultPO;

public class TestDeleteItem extends BaseTest{
	@Test
	public void deleteitem() {
		try {
			
/*			Actions actions=new Actions(driver);
			WebElement mousemovetosignin= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			actions.moveToElement(mousemovetosignin).build().perform();
			mousemovetosignin.click();
			Thread.sleep(4000);
			
			AmazonSearchResultPO asr=new AmazonSearchResultPO(driver);
			
			asr.username().click();
			asr.username().sendKeys(username);
			Thread.sleep(4000);
			
			asr.ContinueButton().click();
			Thread.sleep(4000);
			
			asr.Password().clear();
			asr.Password().sendKeys(pwd);
			Thread.sleep(4000);
			
			asr.LogInButton().click();*/
			//from line number 20 to 39 will work only when i will accept the invitation on my phone as i signin with my number.
			
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
