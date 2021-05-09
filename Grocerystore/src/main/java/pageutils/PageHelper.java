package pageutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHelper {
	
		public void waitImplement(WebDriver driver, int q, WebElement e) {
			
			WebDriverWait w=new WebDriverWait(driver,q);
			
			w.until(ExpectedConditions.visibilityOf(e));
			
			
			
			
			
		}


}
