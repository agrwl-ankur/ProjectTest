package chromeLaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerEvent.class)
public class RobotClass {
	@Test
	public void f2() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		WebElement body = driver.findElement(By.id("tinymce"));
		Robot rb = new Robot();
		body.click();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DELETE);
		rb.keyRelease(KeyEvent.VK_DELETE);
		// body.clear();
		body.sendKeys("Iframe Test");
		Thread.sleep(2000);
		driver.close();
	}

}
