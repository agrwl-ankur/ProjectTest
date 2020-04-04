package chromeLaunch;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchChrome {
@Test
@Parameters({"firstname","URL"})
	public void launch(String name, String URL) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(5000);
		WebElement foot = driver.findElement(By.className("footer"));
		System.out.println(foot.getText());
		WebElement reg = driver.findElement(By.linkText("REGISTER"));
		reg.click();

		if (driver.getTitle().equalsIgnoreCase("Register: Mercury Tours")) {
			WebElement firstname = driver.findElement(By.name("firstName"));
			firstname.sendKeys(name);
			WebElement lastname = driver.findElement(By.name("lastName"));
			lastname.sendKeys("Agrawal");
			WebElement phone = driver.findElement(By.name("phone"));
			phone.sendKeys("0123456789");
			WebElement email = driver.findElement(By.id("userName"));
			email.sendKeys("ankureuthenics0789@gmail.com");
			WebElement address1 = driver.findElement(By.name("address1"));
			address1.sendKeys("123");
			WebElement address2 = driver.findElement(By.name("address2"));
			address2.sendKeys("456 Street");
			WebElement city = driver.findElement(By.name("city"));
			city.sendKeys("Pune");
			WebElement state = driver.findElement(By.name("state"));
			state.sendKeys("Maharashtra");
			WebElement pcode = driver.findElement(By.name("postalCode"));
			pcode.sendKeys("411033");
			Select country = new Select(driver.findElement(By.name("country")));
			country.selectByVisibleText("INDIA");
			WebElement user_info = driver.findElement(By.id("email"));
			user_info.sendKeys("ankureuthenics0789@gmail.com");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("acbdefg");
			WebElement conf_password = driver.findElement(By.name("confirmPassword"));
			conf_password.sendKeys("acbdefg");
			WebElement submit = driver.findElement(By.name("register"));
			Random rn = new Random();
			int x = rn.nextInt(10000);
			TakesScreenshot scr = ((TakesScreenshot) driver);
			File scrfile = scr.getScreenshotAs(OutputType.FILE);
			File destfile = new File("C:\\Users\\AnkurDeep\\eclipse-workspace\\ProjectTest\\src\\main\\java\\chromeLaunch\\" + x + ".png");
			FileHandler.copy(scrfile, destfile);

			submit.click();
			Thread.sleep(5000);
			driver.close();

		} else {
			driver.close();
			throw new RuntimeException("Register page is not opened");

		}
	}

}
