package FirstTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/ibrar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://beta05.uaccount.uk/");
		
	}

}
