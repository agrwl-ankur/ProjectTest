package chromeLaunch;

import org.testng.annotations.DataProvider;

public class DPClass {
@DataProvider(name="testData")
	public static Object[][] getDatafromhere(){
	return new Object[][] {
		{"http://the-internet.herokuapp.com/iframe", "iframe Test","text2222222"},
		{"http://newtours.demoaut.com/", "test test"}
		
		
	};
	
}

}
