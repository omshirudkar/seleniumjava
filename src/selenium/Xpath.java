package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.demo.guru99.com/test/newtours/register.php");

	}

}
