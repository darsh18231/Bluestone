package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ValidsignupPage;

public class ValidSignupPage extends BaseTest{
	
@Test
public  void testsignupPage() throws IOException{
	ValidsignupPage vsup=new ValidsignupPage(driver);
		//enter name
		vsup.Setname("Priya");
	
		//enter company name
		vsup.Setcompanyname("testyantra");
		
		//enter phn number
		vsup.Setphnnum("8197596022");
		
		//enter email
		vsup.Setemail("shani.darsh@gmail.com");
		
		//enter password
		vsup.Setpassword("be strong");
		
		//enter domain
		vsup.Setdomain("testyantra.muvi.com");
		
		//click checkbox
		vsup.Clickchckbox();
		
		//click next button
		vsup.Clicknxt();
	
	
}
	
	
	
	

}
