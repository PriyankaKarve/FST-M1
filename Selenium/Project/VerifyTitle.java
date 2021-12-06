import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {

	

		
		  public static void main(String[] args) {
		       
		    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
		    	
		        String baseUrl = "https://alchemy.hguy.co/jobs/";
		        String expectedTitle = "Alchemy Jobs – Job Board Application";
		        String actualTitle = "";

		       
		        driver.get(baseUrl);

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