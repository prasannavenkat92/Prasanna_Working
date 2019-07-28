package org.Working;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanna\\eclipse-workspace\\Prasanna_Working\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement w=driver.findElement(By.xpath("(//div[text()='Lenovo Ideapad 330 81G200CAIN (i3 7020U /4 GB RAM/1 TB HDD/ 35.56cm (14 inch)HD /DOS/No ODD) (Onyx Black 2.2 Kg)'])[1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(w).perform();
		Thread.sleep(1000);
		w.click();
		Thread.sleep(3000);
		 String MainWindow=driver.getWindowHandle();		
 		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))	
	            {
	            	driver.switchTo().window(ChildWindow);
		WebElement w1=driver.findElement(By.xpath("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
		//acc.moveToElement(w1).perform();
		w1.click();
		driver.switchTo().window(ChildWindow);
		WebElement w2=driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
		w2.click();
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("9940815294");
		WebElement btncon=driver.findElement(By.id("login-continue"));
		btncon.click();
		WebElement pass=driver.findElement(By.id("w_password"));
		pass.sendKeys("valambal");
		WebElement login=driver.findElement(By.id("login-done"));
		login.click();
	            }
	        }
		
		
	}

}
