package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageutils.PageHelper;

public class Loginpage extends PageHelper {
WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement user;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwrd;
	
	//@FindBy(xpath="//input[@name='remember_me']")
	//WebElement chck;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement button;
	
	@FindBy(xpath="(/html/body/div/nav/ul[2]/li/a/text())[2]")
	WebElement admn;
	
	public void login(String us, String ps) throws InterruptedException {
    	Loginpage qa=new Loginpage(driver);
    	user.sendKeys(us);
    	qa.waitImplement(driver, 2, user);
    
    	
    	passwrd.sendKeys(ps);
    	qa.waitImplement(driver, 2, passwrd);
    	
    	
    	/*chck.click();
    	qa.waitImplement(driver, 2, chck);
    	*/
    	
    	qa.waitImplement(driver, 2, button);
    	button.submit();
    	
    	String g=admn.getText();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
    public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    
    

}
