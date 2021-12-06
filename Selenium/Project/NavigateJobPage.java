import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateJobPage {
	 public static void main(String[] args) throws InterruptedException {
	       
	    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
	    	
	        String baseUrl = "https://alchemy.hguy.co/jobs/";
	        String expectedTitle = "Alchemy Jobs – Job Board Application";
	        String actualTitle = "";

	       
	        driver.get(baseUrl);
	        Thread.sleep(8000);
	        
	        //driver.findElement(By.xpath("//a[contains(text(),'Jobs')]")).click();
	        driver.findElement(By.linkText("Jobs")).click();

	        actualTitle = driver.getTitle();

	       
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	       
	    }

	}

