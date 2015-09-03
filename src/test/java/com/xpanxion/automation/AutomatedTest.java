package com.xpanxion.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatedTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/index.html");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		WebElement guestField = driver.findElement(By.name("guest"));
		guestField.sendKeys("bob");
		guestField.submit();
		WebElement greeting = driver.findElement(By.xpath("/html/body/h1"));
		System.out.println(greeting.getText());
		driver.quit();
	}

}
