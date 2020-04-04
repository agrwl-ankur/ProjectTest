package chromeLaunch;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiWindow {

	@Test
	public void f1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement win = driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		String parent = driver.getWindowHandle();
		win.click();
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> ite = windows.iterator();
		while (ite.hasNext()) {
			String child = ite.next();
			if (!child.equals(parent)) {
				driver.switchTo().window(child);
				WebElement video = driver.findElement(By.name("lap1"));
				video.click();
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		WebElement link = driver.findElement(By.linkText("WebTable"));
		link.click();
		Thread.sleep(3000);
		driver.close();
	}

}
