package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate3 {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.jotform.com/42382403598964");
		
		WebElement we = wd.findElement(By.name("q3_name"));
		we.click();
		Thread.sleep(2000);
		
		
		we.sendKeys("Om");
		
	
		
		WebElement we2 = wd.findElement(By.name("q4_email"));
		we2.click();
		
		we2.sendKeys("llhgdsv@gmail.com");
		Thread.sleep(2000);
		
		Select sr = new Select(wd.findElement(By.id("input_7_month")));
		
		sr.selectByIndex(5);
		
		Thread.sleep(2000);
		
		Select sr2 = new Select(wd.findElement(By.id("input_7_day")));
		sr2.selectByValue("22");
		
	Thread.sleep(2000);
		
		Select sr3 = new Select(wd.findElement(By.id("input_7_year")));
		sr3.selectByValue("2003");
		
		WebElement we3 = wd.findElement(By.name("q5_address5[addr_line1]"));
		we3.click();
		we3.sendKeys("Om");
		WebElement we4 = wd.findElement(By.name("q5_address5[addr_line2]"));
		we4.click();
		we4.sendKeys("Om");
		
		WebElement we5 = wd.findElement(By.name("q5_address5[city]"));
		we5.click();
		we5.sendKeys("Om");
		
		WebElement we6 = wd.findElement(By.name("q5_address5[state]"));
		we6.click();
		we6.sendKeys("Om");
		
		Select sr5 = new Select(wd.findElement(By.id("q5_address5[country]")));
		sr5.selectByValue("India");
		
		 wd.findElement(By.id("input_2")).click();
		
		
		
		

	}

}
