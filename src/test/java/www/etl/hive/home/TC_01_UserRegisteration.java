package www.etl.hive.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.etl.hive.newTours.HomePage;
import com.etl.hive.newTours.RegisterPage;

public class TC_01_UserRegisteration {
	@Test
	public void exec() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// creating objects of base classes
		HomePage hm = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);

		// test steps start from here

		driver.get("http://newtours.demoaut.com/");
		Assert.assertTrue(hm.clickonRegister(), "Clicking on register link");
		Assert.assertTrue(rp.enterFirstName(), "Entering first name");
		Assert.assertTrue(rp.enterLastName(), "Entering last name");
		Assert.assertTrue(rp.selectCountry(),"Selecting a country");
		Thread.sleep(5000);
		driver.close();
	}

}
