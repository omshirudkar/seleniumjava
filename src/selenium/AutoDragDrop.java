package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoDragDrop {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		

		 
		String cw = wd.getWindowHandle();
		wd.get("https://www.gmail.com");
		wd.switchTo().window(cw);
		
		Actions act  = new Actions(wd);
	
		WebElement we =wd.findElement(By.id("identifierId"));
		
		we.sendKeys("Shrikant is Fucking Hacker");
		act.doubleClick()
		

				
				
				
				
		
	}

}
