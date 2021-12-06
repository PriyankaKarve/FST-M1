import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifySecondHeading {
	public static void main(String[] args) throws InterruptedException {
	       
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "https://alchemy.hguy.co/jobs/";
        String expectedSecondHeader = "Quia quis non";
        // WebElement actualHeader = "";

        
         driver.get(baseUrl);
         Thread.sleep(15000);

         WebElement ActualsecondHeader = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]"));
         String actualsecondHeader = ActualsecondHeader.getText();
        
         if (actualsecondHeader.contentEquals(expectedSecondHeader)){
             System.out.println("Test Passed!");
         } else {
             System.out.println("Test Failed");
         }
        
         //close Fire fox
         driver.close();
        
     }

 }

  