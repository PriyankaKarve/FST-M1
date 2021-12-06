import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderImageURL {
	

	public static void main(String[] args) {
	       
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "https://alchemy.hguy.co/jobs/";
         driver.get(baseUrl);
        // WebElement l=driver.findElement(By.className("entry-header ast-no-meta"));
         WebElement l=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img"));
         String value = l.getAttribute("src");
         System.out.println("URL of image is: "+ value);
         driver.close();
     
        }
       
       
       
    }


