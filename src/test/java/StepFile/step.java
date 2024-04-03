package StepFile;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.base;
import Page.page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import utilities.read;

public class step extends base {

	@Before
	public void setup() {
		
		rc = new read();
		switch (rc.getBrowser()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(base.implicit));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(base.pageLoadTimeOut));
		

	}

	@After
	public void tearDown(Scenario s) {
		
		if(s.isFailed()==true) {
			byte[] arr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.attach(arr, "image/png", s.getName());
		}
			
		
		driver.close();
	}

	@Given("user launed browser")
	public void user_launed_browser() {
		pom = new page(driver);
		 
	}

	@When("user enters url")
	public void user_enters_url() {
		driver.get(rc.getUrl());
	}

	@Then("user clicks on Myacc dropdown")
	public void user_clicks_on_myacc_dropdown() {
		pom.myacc();
	}

	@Then("user selects register option")
	public void user_selects_register_option() {
		pom.clkReg();
	}

	@Then("user enters all mandatory fields")
	public void user_enters_all_mandatory_fields() {
		pom.setFN(p.getProperty("firstname"));
		pom.setLN(p.getProperty("lastname"));
		pom.setemail(new RandomStringUtils().randomAlphanumeric(10) + "@mail.com");
		pom.setpswd(p.getProperty("password"));

	}

	@Then("user clicks on privacy policy slider")
	public void user_clicks_on_privacy_policy_slider() {
		pom.clkPP();
	}

	@Then("user clicks on continue button")
	public void user_clicks_on_continue_button(){
		pom.clkCBtn();
		
	}

	@Then("user verifies success message as {string}")
	public void user_verifies_success_message_as(String exp)  throws Exception{
		
		pom.verifyM(exp);
		
	}

	@Then("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		pom.clklogoutbtn();
	}
	
	@Then("user clicks on final continue button")
	public void user_clicks_on_final_continue_button() {
	
		pom.clkfinalconBtn();
	}

	
	@Then("user enters fields {string} {string} {string} {string}")
	public void user_enters_fields(String firstname, String lastname, String email, String password) {
		pom.setFN(firstname);
		pom.setLN(lastname);
		pom.setemail(new RandomStringUtils().randomAlphanumeric(10) + "@mail.com");
		pom.setpswd(password);
	
	}
	@Then("user enters required fields")
	public void user_enters_required_fields(DataTable d) {
		List<Map<String, String>> map =  d.asMaps(String.class,String.class);
		pom.setFN(map.get(0).get("firstname"));
		pom.setLN(map.get(0).get("lastname"));
		pom.setemail(new RandomStringUtils().randomAlphanumeric(10) + "@mail.com");
		pom.setpswd(map.get(0).get("password"));
	
	}
	
}
