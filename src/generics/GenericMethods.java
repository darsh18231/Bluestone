package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods {
	//Selection and deselection
	
		public static void selectByIndex(WebElement element, int n)
		{
			Select sel=new Select(element);
			sel.selectByIndex(n);
			
		}
		

		public static void selectByValue(WebElement element, String value)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
			
		}
		
		public static void selectByVisibleText(WebElement element, String visibleText)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(visibleText);
			
		}
		
		public static void deselectByIndex(WebElement element, int n)
		{
			Select sel=new Select(element);
			sel.deselectByIndex(n);
			
		}
		
		
		public static void deselectByValue(WebElement element, String value)
		{
			Select sel=new Select(element);
			sel.deselectByValue(value);
		}

}
