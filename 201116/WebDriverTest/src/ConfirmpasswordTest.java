import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class ConfirmpasswordTest {
	public WebDriver driver;
    public ConfirmpasswordTest() throws InterruptedException {
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
   		pass.sendKeys("123iit");
   		confirmPass.sendKeys("12ii");
   		Thread.sleep(2000);
   		submit.submit();
   		
   		
   		
   			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Did not match with Password']"));
   			assertEquals("Did not match with Password", textDemo.getText());
   		
   	    
   		Thread.sleep(1000);
   	    driver.close();	
   	}
   	
   	
   	@Test
   	void test2() throws InterruptedException {
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
   		pass.sendKeys("123iit");
   		confirmPass.sendKeys("123it");
   		Thread.sleep(2000);
   		submit.submit();
           
   		
   		
   		
   			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Did not match with Password']"));
   			assertEquals("Did not match with Password", textDemo.getText());
   		
   	    
   		Thread.sleep(1000);
   	    driver.close();	
   	}
   	@Test
   	void test3() throws InterruptedException {
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
   		email.sendKeys("asad@gmail.command");
   		phoneNumber.sendKeys("01718543211");
   		pass.sendKeys("123iit");
   		confirmPass.sendKeys("123iit");
   		Thread.sleep(2000);
   		submit.submit();
   		
   		
   			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Registration Successful.']"));
   			assertEquals("Registration Successful.", textDemo.getText());
   		
   	    
   		Thread.sleep(1000);
   	    driver.close();	
   	}
   	@Test
   	void test4() throws InterruptedException {
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
   		pass.sendKeys("123iit");
   		confirmPass.sendKeys("123456789iiiiiiiiit");
   		Thread.sleep(2000);
   		submit.submit();
   			
   		
   			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Did not match with Password']"));
   			assertEquals("Did not match with Password", textDemo.getText());
   		
   	    
   		Thread.sleep(1000);
   	    driver.close();	
   	}
   	@Test
   	void test5() throws InterruptedException {
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
   		pass.sendKeys("123iit");
   		confirmPass.sendKeys("123456789iiiiiiiiitt");
   		Thread.sleep(2000);
   		submit.submit();
   			
   		
   			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Did not match with Password']"));
   			assertEquals("Did not match with Password", textDemo.getText());
   		
   	    
   		Thread.sleep(1000);
   	    driver.close();	
   	}
   	@Test
   	void test6() throws InterruptedException {
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
   		pass.sendKeys("123iit");
   		confirmPass.sendKeys("123456789iiiiiiiiittt");
   		Thread.sleep(2000);
   		submit.submit();
   			
   		
   			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Did not match with Password']"));
   			assertEquals("Did not match with Password", textDemo.getText());
   		
   	    
   		Thread.sleep(1000);
   	    driver.close();	
   	}
   	@Test
   	void test7() throws InterruptedException {
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
   		pass.sendKeys("123iit");
   		confirmPass.sendKeys("");
   		Thread.sleep(2000);
   		submit.submit();
   			
   	
   			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Did not match with Password']"));
   			assertEquals("Did not match with Password", textDemo.getText());
   		
   	    
   		Thread.sleep(1000);
   	    driver.close();	
   	}
}
