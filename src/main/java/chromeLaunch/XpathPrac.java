package chromeLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPrac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S1846324878%3A1585580438699737&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(5000);

		WebElement lang = driver.findElement(By.xpath("//div[@jsname='LgbsSe']"));
		lang.click();
		Thread.sleep(5000);
		boolean flag =false;
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed']//div//span"));
		for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("‪हिन्दी‬"))
			{
				list.get(i).click();
				flag = true;
				break;
			}
				
		}
	}

}
