import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class Gender {
	public WebDriver driver;
	public Gender() throws InterruptedException {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\munim\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("http://localhost/registerform/");
		driver.manage().window().maximize();
    }
	 @Test
		void test1() throws InterruptedException {
			WebElement firstName=driver.findElement(By.id("firstName"));
			WebElement lastName=driver.findElement(By.id("lastName"));
			WebElement dob=driver.findElement(By.id("dob"));
			WebElement gender=driver.findElement(By.id("male"));
			WebElement email=driver.findElement(By.id("email"));
			WebElement phoneNumber=driver.findElement(By.id("phoneNumber"));
			WebElement pass=driver.findElement(By.id("pass"));
			WebElement confirmPass=driver.findElement(By.id("confirmPass"));
			WebElement submit=driver.findElement(By.id("mybutton"));
			
			
			firstName.sendKeys("Asad");
			lastName.sendKeys("khan");
			dob.sendKeys("01-01-1990");
			gender.click();
			email.sendKeys("asad@gmail.com");
			phoneNumber.sendKeys("01718543211");
			pass.sendKeys("123456789");
			confirmPass.sendKeys("123456789");
			Thread.sleep(2000);
			submit.submit();
			
			
			
				WebElement textDemo = driver.findElement(By.xpath("//*[text()='Registration Successful.']"));
				assertEquals("Registration Successful.", textDemo.getText());
			
			
		    
			Thread.sleep(1000);
		    driver.close();		
		}
		
		
		@Test
		void test2() throws InterruptedException {
			WebElement firstName=driver.findElement(By.id("firstName"));
			WebElement lastName=driver.findElement(By.id("lastName"));
			WebElement dob=driver.findElement(By.id("dob"));
			WebElement gender=driver.findElement(By.id("female"));
			WebElement email=driver.findElement(By.id("email"));
			WebElement phoneNumber=driver.findElement(By.id("phoneNumber"));
			WebElement pass=driver.findElement(By.id("pass"));
			WebElement confirmPass=driver.findElement(By.id("confirmPass"));
			WebElement submit=driver.findElement(By.id("mybutton"));
			
			firstName.sendKeys("Asad");
			lastName.sendKeys("khan");
			dob.sendKeys("01-01-1990");
			gender.click();
			email.sendKeys("asad@gmail.com");
			phoneNumber.sendKeys("01718543211");
			pass.sendKeys("123456789");
			confirmPass.sendKeys("123456789");
			Thread.sleep(2000);
			submit.submit();
	        
			
			
				WebElement textDemo = driver.findElement(By.xpath("//*[text()='Registration Successful.']"));
				assertEquals("Registration Successful.", textDemo.getText());
			
		    
			Thread.sleep(1000);
		    driver.close();		
		}
		@Test
		void test3() throws InterruptedException {
			WebElement firstName=driver.findElement(By.id("firstName"));
			WebElement lastName=driver.findElement(By.id("lastName"));
			WebElement dob=driver.findElement(By.id("dob"));
			WebElement email=driver.findElement(By.id("email"));
			WebElement phoneNumber=driver.findElement(By.id("phoneNumber"));
			WebElement pass=driver.findElement(By.id("pass"));
			WebElement confirmPass=driver.findElement(By.id("confirmPass"));
			WebElement submit=driver.findElement(By.id("mybutton"));
			
			firstName.sendKeys("Asad");
			lastName.sendKeys("khan");
			dob.sendKeys("01-01-1990");
			
			email.sendKeys("asad@gmail.com");
			phoneNumber.sendKeys("01718543211");
			pass.sendKeys("123456789");
			confirmPass.sendKeys("123456789");
			Thread.sleep(2000);
			submit.submit();
			
			
				WebElement textDemo = driver.findElement(By.xpath("//*[text()='This field is required.']"));
				assertEquals("This field is required.", textDemo.getText());
			
		    
			Thread.sleep(1000);
		    driver.close();		
		}

}
