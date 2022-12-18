package miniProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathiya siva\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		// log in page
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("dhevasathya");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Sathiya@77");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		// search Hotel
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(4);
		
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(Hotel);
		s1.selectByIndex(1);
		
		WebElement Roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(Roomtype);
		s2.selectByVisibleText("Double");
		
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomnos);
		s3.selectByIndex(2);
		
		WebElement checkindate = driver.findElement(By.id("datepick_in"));
		checkindate.clear();
		
		WebElement checkoutdate = driver.findElement(By.id("datepick_out"));
		checkoutdate.clear();
		
		WebElement input = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		input.sendKeys("16/11/22");
		
		WebElement outinput = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		outinput.sendKeys("17/11/22");

		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(2);
		
		WebElement childrenroom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childrenroom);
		s5.selectByIndex(1);
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		// select hotel
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
		
		WebElement submit = driver.findElement(By.id("continue"));
		submit.click();

		// book a hotel
		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys("Dhevayani");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Sekar");
		
		WebElement adress = driver.findElement(By.id("address"));
		adress.sendKeys("209-near police station, chennai");
		
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys("1234567893156789");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardtype);
		s6.selectByIndex(2);
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmonth);
		s7.selectByIndex(3);
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expyear);
		s8.selectByIndex(12);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("506");
		
		WebElement booking = driver.findElement(By.id("book_now"));
		booking.click();
		
		Thread.sleep(8000);
		// Takes Screen Shot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sathiya siva\\eclipse-workspace\\Sel\\screenshot\\img3.png");
		FileUtils.copyFile(source, dest);

	}

}
