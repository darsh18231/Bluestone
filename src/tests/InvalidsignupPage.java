package tests;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ValidsignupPage;

public class InvalidsignupPage extends BaseTest{
	@Test
	public void testInvalidsignuppage(){
		ValidsignupPage inv= new ValidsignupPage(driver);
				//enter name
				inv.Setname("Priya");
			
				//enter company name
				inv.Setcompanyname("testyantra");
				
				//enter invalid phn number
				inv.Setphnnum("57589cgjhcg");
				
				//enter email
				inv.Setemail("shani.darsh@gmail.com");
				
				//error message displayed
				inv.emailerrordispllayed();
			
				//enter invalid password
				inv.Setpassword("uydgwiuqgdkqj");
				
				//enter domain
				inv.Setdomain("testyantra.muvi.com");
				
				//click checkbox
				inv.Clickchckbox();
				
				//click next button
				inv.Clicknxt();
				
				//error message displayed
				inv.errmsgDisplayed();
				
				//error message displayed
				inv.pwerrdisplayed();
				
	}

}
