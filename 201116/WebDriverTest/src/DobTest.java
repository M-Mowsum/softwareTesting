import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class DobTest {
	public WebDriver driver;
    public DobTest() throws InterruptedException {
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
		dob.sendKeys("12-31-1989");
		gender.click();
		email.sendKeys("asad@gmail.com");
		phoneNumber.sendKeys("01718543211");
		pass.sendKeys("123456789");
		confirmPass.sendKeys("123456789");
		Thread.sleep(2000);
		submit.submit();
		
		
		
		WebElement textDemo = driver.findElement(By.xpath("//*[text()='Please enter a value greater than or equal to 1990-01-01.']"));
		assertEquals("Please enter a value greater than or equal to 1990-01-01.", textDemo.getText());

	    
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
		WebElement gender=driver.findElement(By.id("male"));
		WebElement email=driver.findElement(By.id("email"));
		WebElement phoneNumber=driver.findElement(By.id("phoneNumber"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement confirmPass=driver.findElement(By.id("confirmPass"));
		WebElement submit=driver.findElement(By.id("mybutton"));
		
		firstName.sendKeys("Asad");
		lastName.sendKeys("khan");
		dob.sendKeys("02-01-1990");
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
		dob.sendKeys("11-30-2020");
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
		dob.sendKeys("12-31-2020");
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
		dob.sendKeys("01-01-2021");
		gender.click();
		email.sendKeys("asad@gmail.com");
		phoneNumber.sendKeys("01718543211");
		pass.sendKeys("123456789");
		confirmPass.sendKeys("123456789");
		Thread.sleep(5000);
		submit.submit();
		
	
		WebElement textDemo = driver.findElement(By.xpath("//*[text()='Please enter a value less than or equal to 2020-12-31.']"));
		assertEquals("Please enter a value less than or equal to 2020-12-31.", textDemo.getText());
		
	    
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
		dob.sendKeys("");
		gender.click();
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
