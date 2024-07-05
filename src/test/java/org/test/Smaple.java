package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smaple {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
//		TAKS1 NO OF RESULTS
		WebElement result = driver.findElement(By.xpath("//span[@class='BUOuZu']"));
//		String text = result.getText();
		System.out.println(result.getText());
		String text = result.getText();
		String[] split = text.split(" ");
		System.out.println("no of results ina a page"+split[3]);
		System.out.println("total results"+split[5]);
		
//		 TAKS 2 TO PRINT ALL PRODUCT
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for(WebElement x:name) {
			System.out.println(x.getText());
		}
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		for(WebElement x:price) {
			System.out.println(x.getText().substring(1));

	}

}

	}


