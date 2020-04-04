package chromeLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FramesHandling {
@Test(dataProvider = "testData", dataProviderClass = DPClass.class)
	public void handle(String url, String text, String text2) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
		 driver.switchTo().frame(0);
		 WebElement body=driver.findElement(By.id("tinymce"));
		 body.clear();
		 body.sendKeys(text);
		 Thread.sleep(2000);
		 body.sendKeys(text2);
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent();
		 WebElement abc=driver.findElement(By.id("mceu_15-open"));
		 abc.click();
		 Thread.sleep(2000);
//		 
//		 Actions act = new Actions(driver);
//				 act.keyDown(Keys.TAB).build().perform();
//		 act.keyUp(Keys.TAB).build().perform();
		 
		 driver.close();
		 }


}
