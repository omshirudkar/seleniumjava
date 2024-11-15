package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();	
		
		String cw = wd.getWindowHandle();
	Actions act = new Actions(wd);
		wd.get("https://demo.guru99.com/test/drag_drop.html");
		wd.switchTo().window(cw);
		WebElement drag = wd.findElement(By.id("fourth"));
		WebElement drop = wd.findElement(By.id("amt7"));
		act.dragAndDrop(drag, drop).build().perform();
		
	}

}
