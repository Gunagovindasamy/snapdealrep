package org.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\programming practice\\Guna\\Snapdeal\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("iphone 6");
		
		//JavascriptExecutor k=(JavascriptExecutor)driver;
		//k.executeScript("arguments[0].setAttribute('value','iphone x')", sb);
		//k.executeScript("arguments[0].click();", t);
		WebElement t = driver.findElement(By.xpath("//span[text()='Search']"));
		t.click();
		driver.findElement(By.xpath("//img[@class='product-image ']")).click();
		 Set<String> allwindow = driver.getWindowHandles();
		 List <String>li=new LinkedList<String>();
		 li.addAll(allwindow);
		 driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//div[@class='col-xs-6 btn btn-xl rippleWhite buyLink buyNow marR15  ']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gunaanjali03@gmail.com");
		driver.findElement(By.xpath("//button[@id='login-continue']")).click();
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Guna1234");
		driver.findElement(By.xpath("//button[@id='otp-done']")).click();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code");
		String k = sc.next();
		WebElement code = driver.findElement(By.xpath("//input[@id='verification-code-val']"));
		code.sendKeys(k);
		driver.findElement(By.xpath("//button[@id='login-otp-submit']")).click();
	
	
	}

}
