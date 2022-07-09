import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

@Test
public class LoginPageTest extends TestBase {
	WebDriver driver;
	LoginPage LP;
	HomePage homepage;
	Properties pro;
	TestUtil testu;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		Initializion();

		LP = new LoginPage();
		testu = new TestUtil();

	}

	@Test(priority = 1)
	public void Login() {

		homepage = LP.login("rahulpawar@2353@gmail.com", "Pass@123");

	}

	@AfterMethod
	public void teardown() {
		// driver.quit();
	}

}
