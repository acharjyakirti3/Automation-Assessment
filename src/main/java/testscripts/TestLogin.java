package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pageobject.AmazonSearchPO;
import pageobject.AmazonSearchResultPO;

public class TestLogin extends BaseTest {
	@Test
	public void amazonsignin() {
		try {
			AmazonSearchPO asp=new AmazonSearchPO(driver);
//			asp.seacrchLink().click();
			
			Actions actions=new Actions(driver);
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
			
			asr.LogInButton().click();
			Thread.sleep(4000);
			
			Reporter.log("Login Successfull",true);			
		}
		catch(Exception e){
			Reporter.log("Login unsuccessfull",true);	
			
		}
	}
	
}
