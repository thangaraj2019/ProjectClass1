package org.com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Sanatorium\\Desktop\\Thangaraj\\FirstClass\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement TxtUser=driver.findElement(By.id("email"));
		TxtUser.sendKeys("rekaha");
		WebElement Txtpass=driver.findElement(By.id("pass"));
		Txtpass.sendKeys("pass");
		
			}
}
