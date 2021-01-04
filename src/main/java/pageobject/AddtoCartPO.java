package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class AddtoCartPO extends BasePage {

	public AddtoCartPO(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement Searchbar;
	public WebElement Searchbar() {
		return Searchbar;
	}
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement Earphone;
	public WebElement EarPhone() {
		return Earphone;
	}

}
