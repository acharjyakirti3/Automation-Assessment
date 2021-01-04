package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class AmazonSearchPO extends BasePage{

	public AmazonSearchPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[text()='Amazon.in']")
	private WebElement SearchLink;
	public WebElement seacrchLink() {
		return SearchLink;
	}
}
