import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ApplyJob {
	public static void main(String[] args) throws InterruptedException {
	       
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
    	
        String baseUrl = "https://alchemy.hguy.co/jobs/";
             
        driver.get(baseUrl);
        Thread.sleep(5000);
        
        //driver.findElement(By.xpath("//a[contains(text(),'Jobs')]")).click();
        driver.findElement(By.linkText("Jobs")).click();

       driver.findElement(By.id("search_keywords")).sendKeys("Banking");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@type='submit']")).click();

       Thread.sleep(3000);
       
       WebElement Element = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[2]"));
       js.executeScript("arguments[0].scrollIntoView();", Element);
       Element.click();
       Thread.sleep(3000);
       WebElement Element2 = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input"));
       js.executeScript("arguments[0].scrollIntoView();", Element2);
       Element2.click();
       
       WebElement Element3 = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/div/p/a"));
       String emailId = Element3.getText();
      System.out.println(emailId);
    		   driver.close();
       
       
       
    		   
        //close Fire fox
        //driver.close();
       
    }

}


