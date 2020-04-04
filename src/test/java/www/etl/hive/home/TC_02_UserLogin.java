package www.etl.hive.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.etl.hive.newTours.HomePage;
import com.etl.hive.newTours.SignonPage;

public class TC_02_UserLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Creating objects
		HomePage hm = new HomePage(driver);
		SignonPage so = new SignonPage(driver);
		
		
		//  Step 1 - Enter URL
		driver.get("http://newtours.demoaut.com/");
    	//  Step 2 - Click on SignON link 
		Assert.assertTrue(hm.clickonSignOn(),"Step 2 - Clicking on Sign-On link");
		//  Step 3 - Enter username
		Assert.assertTrue(so.enterUsername(), "Step 3 - Entering username");
		//  Step 4 - Enter password
		Assert.assertTrue(so.enterPassword(),"Step 4 - Entering password");
		//  Step 5 - Click on Submit
		Assert.assertTrue(so.signon_submit(),"Step 5 - Submitting user details");
		System.out.println("Login Successfull");
	}
}
