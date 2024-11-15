package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAuto {
public static void main(String[] args) throws InterruptedException {
	WebDriver wd = new ChromeDriver();
	wd.get("https://www.demo.guru99.com/test/radio.html");
	
	WebElement we = wd.findElement(By.name("webform"));
	we.click();
	Thread.sleep(2000);
	
	WebElement we1 = wd.findElement(By.id("vfb-6-1"));
	we1.click();
	Thread.sleep(2000);
	
	
	
	
	
	
	
}

}
