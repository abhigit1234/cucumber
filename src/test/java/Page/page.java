package Page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class page extends base{

	
	public page(WebDriver driver) {
		this.driver=driver;
		this.jse=(JavascriptExecutor)this.driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
 	@FindBy(xpath = "//span[text()='My Account']")WebElement clk_MyAccDD;
	@FindBy(linkText = "Register")WebElement clk_Reg;
	@FindBy(name = "firstname")WebElement enter_fn;
	@FindBy(name = "lastname")WebElement enter_ln;
	@FindBy(name = "email")WebElement enter_email;
	@FindBy(name = "password")WebElement enter_pswd;
	@FindBy(name = "agree")WebElement clk_pp;
	@FindBy(xpath = "//button[@type='submit']")WebElement clk_conBtn;
	@FindBy(xpath = "//div[@id='content']/h1")WebElement verifyMess;
	@FindBy(linkText = "Continue")WebElement clkContButton;
	@FindBy(linkText = "Logout")WebElement clk_logoutBtn;
	@FindBy(xpath = "//div[@class='text-end']/a")WebElement clk_confinalBtn;
	
	public void myacc() {
		clk_MyAccDD.click();
	}
	public void clkReg() {
		clk_Reg.click();
	}
	public void setFN(String fn) {
		enter_fn.sendKeys(fn);
	}
	public void setLN(String ln) {
		enter_ln.sendKeys(ln);
	}
	public void setemail(String e) {
		enter_email.sendKeys(e);
	}
	public void setpswd(String p) {
		enter_pswd.sendKeys(p);
	}
	public void clkPP() {
		jse.executeScript("arguments[0].click()", clk_pp);
		
	}
	
	public void clkCBtn() {
		jse.executeScript("arguments[0].click()",clk_conBtn);
	}
	public void verifyM(String expMess) {
		String act = verifyMess.getText();
		System.out.println(act);
		System.out.println(expMess);
		assertEquals(act, expMess);
	}
	
	public void clkConBtnInside() {
		jse.executeScript("arguments[0].click()",clkContButton);
	}
	
	public void clklogoutbtn() {
		jse.executeScript("arguments[0].click()",clk_logoutBtn);
	}
	public void clkfinalconBtn() {
		jse.executeScript("arguments[0].click()",clk_confinalBtn);
	}
	


}
