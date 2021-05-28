import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


class PhonenumberTest {
	public WebDriver driver;
    public PhonenumberTest() throws InterruptedException {
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
		phoneNumber.sendKeys("0171854321");
		pass.sendKeys("123456789");
		confirmPass.sendKeys("123456789");
		Thread.sleep(2000);
		submit.submit();
		
		
		
			WebElement textDemo = driver.findElement(By.xpath("//*[text()='number invalid,too short']"));
			assertEquals("number invalid,too short", textDemo.getText());
		
	    
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
		dob.sendKeys("01-01-1990");
		gender.click();
		email.sendKeys("asad@gmail.command");
		phoneNumber.sendKeys("017185432111");
		pass.sendKeys("123456789");
		confirmPass.sendKeys("123456789");
		Thread.sleep(2000);
		submit.submit();
		
		
			WebElement textDemo = driver.findElement(By.xpath("//*[text()='number invalid,too long']"));
			assertEquals("number invalid,too long", textDemo.getText());
		
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
		phoneNumber.sendKeys("");
		pass.sendKeys("123456789");
		confirmPass.sendKeys("123456789");
		Thread.sleep(2000);
		submit.submit();
			
		
			WebElement textDemo = driver.findElement(By.xpath("//*[text()='Please enter your phone Number']"));
			assertEquals("Please enter your phone Number", textDemo.getText());
		
	    
		Thread.sleep(1000);
	    driver.close();	
	}

}
