package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;


public class ValidsignupPage extends BasePage{
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="companyname")
	private WebElement compname;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phnnum;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="inputPassword")
	private WebElement password;
	
	@FindBy(id="subdomain")
	private WebElement domain;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement chckbox;
	
	@FindBy(id="nextbtn")
	private WebElement next;
	
	@FindBy(id="phone-error")
	private WebElement error;
	
	@FindBy(id="inputPassword-error")
	private WebElement pwerror;
	
	@FindBy(id="email-error")
	private WebElement emailerror;
	
	public ValidsignupPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void Setname(String username)
	{
		name.sendKeys(username);
		
	}
	
	public void Setphnnum( String number)
	{
		phnnum.sendKeys(number);
	}
	public void Setcompanyname( String companyname)
	{
		compname.sendKeys(companyname);
	}
	public void Setemail( String mail)
	{
		email.sendKeys(mail);
	}
	
	public void Setpassword( String pw)
	{
		password.sendKeys(pw);
	}
	
	public void Setdomain( String dm)
	{
		domain.sendKeys(dm);
	}
	
	public void Clickchckbox( )
	{
		chckbox.click();
	}
	
	public void Clicknxt()
	{
		next.sendKeys();
	}
	
	public void errmsgDisplayed()
	{
		error.isDisplayed();
	}
	

	public void pwerrdisplayed() {
		pwerror.isDisplayed();
		
	}
	
	public void emailerrordispllayed(){
		emailerror.isDisplayed();
	}
	
	
	
	
	
	
	
	
}
