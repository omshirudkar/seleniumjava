package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.demo.guru99.com/test/newtours/register.php");
		
		wd.findElement(By.id("signin2")).click();
		Thread.sleep(300);
		wd.findElement(By.id("sign-username")).sendKeys("welcome@gmail.com");
		
		wd.findElement(By.id("sign-password")).sendKeys("welcome");

		wd.findElement(By.name("Signup")).click();
	}

}
