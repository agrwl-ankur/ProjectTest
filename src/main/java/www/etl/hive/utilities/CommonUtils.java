package www.etl.hive.utilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	WebDriver driver;
	
	public CommonUtils(WebDriver driver){
		this.driver=driver;
	}
	
	public boolean clickSafelyOn(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			return true;
			
		}catch(NoSuchElementException ex) {
			return false;
		}
		
	}
	
	public boolean enterSafelyIn(WebElement ele, String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(text);
			return true;
			
		}catch(NoSuchElementException ex) {
			return false;
		}
	}
	
	public boolean selectFromDropdown(WebElement ele, String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			Select dd=new Select(ele);
			dd.selectByVisibleText(text);
			return true;
		}catch(NoSuchElementException ex) {
			return false;
		}
	}

}
