package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class AmazonSearchResultPO extends BasePage{

	public AmazonSearchResultPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement Signin;
	public WebElement Signin() {
		return Signin;
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement username;
	public WebElement username() {
		return username;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement ContinueButton;
	public WebElement ContinueButton() {
		return ContinueButton;
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement Password;
	public WebElement Password() {
		return Password;
	}
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement LogInButton;
	public WebElement LogInButton() {
		return LogInButton;
	}
}