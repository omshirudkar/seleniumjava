package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.demo.guru99.com/test/newtours/register.php");
		
		wd.findElement(By.name("firstName")).sendKeys("Om");
		Thread.sleep(300);
	
		wd.findElement(By.name("lastName")).sendKeys("Shirudkar");
		wd.findElement(By.name("phone")).sendKeys("464646946");
		wd.findElement(By.name("userName")).sendKeys("omshirudkar");
		wd.findElement(By.name("address1")).sendKeys("dhule");
		wd.findElement(By.name("city")).sendKeys("Dhule");
		wd.findElement(By.name("state")).sendKeys("Maharashtra"); 
		wd.findElement(By.name("postalCode")).sendKeys("4545");

		Select sr = new Select(wd.findElement(By.name("country")));
		sr.selectByValue("INDIA");
		
		
		
		
		wd.findElement(By.name("email")).sendKeys("Djxb@gmail.com");
		wd.findElement(By.name("password")).sendKeys("Dhule");
		
		wd.findElement(By.name("confirmPassword")).sendKeys("Dhule");
		
	    Thread.sleep(3000);
	    wd.findElement(By.name("submit")).click();
//		wd.findElement(By.id("sign-username")).sendKeys("welcome@gmail.com");

	}

}
