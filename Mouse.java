package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\master\\eclipse-workspace\\MouseOver1\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement btn = driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btn).perform();
		WebElement btnN = driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		btnN.click();
		driver.quit();
	}

}
