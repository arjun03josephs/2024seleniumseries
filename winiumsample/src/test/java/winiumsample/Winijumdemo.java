package winiumsample;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.*;
import org.openqa.selenium.winium.WiniumDriver;
public class Winijumdemo {

	public static void main(String[] args) throws MalformedURLException  {
	
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\HP Web Jetadmin 10\\HP Web Jetadmin.lnk");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999/"), options);
		driver.findElement(By.name("Solutions")).click();
		
		
		
		
	}

}
