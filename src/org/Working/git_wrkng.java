package org.Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class git_wrkng {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanna\\eclipse-workspace\\Prasanna_Working\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement uname=driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		uname.sendKeys("9940815294");
		WebElement pass=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		pass.sendKeys("valambal");
		WebElement login=driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		login.click();
		WebElement w=driver.findElement(By.xpath("//a[text()='Canon Pixma Ink Efficent G1010 Single Function Printer']"));
		
		//Actions acc=new Actions(driver);
		//acc.moveToElement(w).perform();
		//Thread.sleep(1000);
		w.click();
		
		//WebElement w1=driver.findElement(By.xpath("//div[@id='buy-button-id']"));
		//acc.moveToElement(w1).perform();
		//Thread.sleep(1000);
		//w1.click();
		
		
	}

}
