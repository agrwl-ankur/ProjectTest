package chromeLaunch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		WebElement popup_link2 = driver.findElement(By.linkText("Good PopUp #2"));
		popup_link2.click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println("Child popup title" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("Parent page title" + driver.getTitle());
		// 3rd popup
		System.out.println("**************");
		WebElement popup_link3 = driver.findElement(By.linkText("Good PopUp #3"));
		popup_link3.click();
		Set<String> handles_2= driver.getWindowHandles();
		Iterator<String> it2=handles_2.iterator();
		String parent2 = it2.next();
		String child2 = it2.next();
		driver.switchTo().window(child2);
		System.out.println("Child popup title  " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent2);
		System.out.println("Parent page title  " + driver.getTitle());
		
	}

}
