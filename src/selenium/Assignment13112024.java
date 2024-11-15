package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment13112024 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.demo.guru99.com/test/newtours/register.php");
		
		WebElement we = wd.findElement(By.name("firstName"));
		we.click();
		Thread.sleep(2000);
		we.sendKeys("Om");
		Thread.sleep(2000);
		we.clear();
		Thread.sleep(2000);
		we.click();

		we.sendKeys("ll");
		
		
		Thread.sleep(2000);
		String s = we.getAttribute("value");
		System.out.println(s);
		
		
	
		
	}
}
