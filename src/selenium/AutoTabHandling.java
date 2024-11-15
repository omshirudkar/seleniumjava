package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTabHandling {
	public static void main(String[] args)
	{
		WebDriver wd = new ChromeDriver();
		String s= "https://www.google.com";	
//		wd.navigate().to("https://www.google.com");
		
		
		wd.navigate().to(s);
	    String pw =wd.getWindowHandle();
		wd.get("https://www.google.com");
	    wd.switchTo().newWindow(WindowType.TAB);

	    	

	    String pw1 =wd.getWindowHandle();
	    wd.get("https://www.gmail.com");
	    wd.switchTo().newWindow(WindowType.TAB);

	    
	
	    String pw2 =wd.getWindowHandle();
	    wd.get("https://www.youtube.com");
	    wd.switchTo().newWindow(WindowType.TAB);
	    
	
	    String pw3 =wd.getWindowHandle();
	    wd.get("https://www.bootstrap.com");
	    wd.switchTo().newWindow(WindowType.TAB);
	   
	    wd.switchTo().window(pw2);

	    wd.switchTo().window(pw1);
	    wd.switchTo().window(pw);
	    wd.switchTo().window(pw3);
	    
	    wd.switchTo().window(pw2);
	    wd.close();
	    wd.switchTo().window(pw1);
	    wd.close();
	    wd.switchTo().window(pw);
	    wd.close();
	    wd.switchTo().window(pw3);
	    wd.close();
	    
	    
	    
	}	
}