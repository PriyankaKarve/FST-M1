import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateJobListing {
	public static void main(String[] args) throws InterruptedException {
	       
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
    	
        String baseUrl = "https://alchemy.hguy.co/jobs/";
             
        driver.get(baseUrl);
        Thread.sleep(5000);
        driver.findElement(By.linkText("Post a Job")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='create_account_email']")).sendKeys("p@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"job_title\"]")).sendKeys("job");
        driver.switchTo().frame("job_description_ifr");
        driver.findElement(By.xpath("/html/body")).sendKeys("job description");
        WebElement Element = driver.findElement(By.xpath("//*[@id=\'application\']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.sendKeys("job@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"company_name\"]")).sendKeys("Priyanka company");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/p/input[4]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"job_preview_submit_button\"]")).click();
        
  
     }
	}
