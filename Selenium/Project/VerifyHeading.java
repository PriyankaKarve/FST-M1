import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyHeading {
	public static void main(String[] args) {
	       
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "https://alchemy.hguy.co/jobs/";
        String expectedHeader = "Welcome to Alchemy Jobs";
       // WebElement actualHeader = "";

       
        driver.get(baseUrl);

        WebElement ActualHeader = driver.findElement(By.className("entry-title"));
        String actualHeader = ActualHeader.getText();
       
        if (actualHeader.contentEquals(expectedHeader)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}


