import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverEngine {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\munim\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost/registerform/");
		driver.manage().window().maximize();
		
		WebElement firstName=driver.findElement(By.id("firstName"));
		WebElement lastName=driver.findElement(By.id("lastName"));
		WebElement dob=driver.findElement(By.id("dob"));
		WebElement gender=driver.findElement(By.id("male"));
		WebElement email=driver.findElement(By.id("email"));
		WebElement phoneNumber=driver.findElement(By.id("phoneNumber"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement confirmPass=driver.findElement(By.id("confirmPass"));
		WebElement submit=driver.findElement(By.id("mybutton"));
		
		
		firstName.sendKeys("azam");
		lastName.sendKeys("khan");
		dob.sendKeys("01-01-2000");
		gender.click();
		email.sendKeys("azam@gmail.com");
		phoneNumber.sendKeys("01718543211");
		pass.sendKeys("123456789");
		confirmPass.sendKeys("123456789");
		Thread.sleep(5000);
		submit.submit();
		
        
        
		Thread.sleep(10000);
		driver.close();

	}

}
