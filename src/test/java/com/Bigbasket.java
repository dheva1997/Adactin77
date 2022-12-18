package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {
	
	public static WebDriver driver;

	public static void browser_Launch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();

	}
	
	public static void Search() {
		WebElement findElement = driver.findElement(By.id("input"));
		findElement.sendKeys("Rice");
		//driver.
		
		
		
		
	}

	public static void main(String[] args) {
		browser_Launch();
		Search();

	}

}
