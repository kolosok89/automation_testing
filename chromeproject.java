package mytestpack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
/*import org.openqa.selenium.firefox.internal.ProfilesIni;*/
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Set;


public class chromeproject {

	public static void main(String[] args) throws InterruptedException {
		/*String getDate(int period,String format)
		
		     Calendar currentDate = Calendar.getInstance();
		     SimpleDateFormat formatter= new SimpleDateFormat(format);
		     currentDate.add(Calendar.DAY_OF_MONTH, period);
		     String date = formatter.format(currentDate.getTime());
		     return date;*/
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rostyk\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().deleteAllCookies();
		  
		   driver.navigate().refresh();
		   

		   driver.get("https://test.q9elements.com");
		   driver.manage().window().maximize();
		   
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.findElement(By.name("email")).sendKeys("olena.dyakiv@techmagic.co");
	       driver.findElement(By.name("password")).sendKeys("qwerty123654");
	       driver.findElement(By.className("btn-login")).click();
	       
	       
	       
	       WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mCSB_1_container']/div/div[3]/div/div[1]/div[1]")));
	       // button.submit();
	        driver.findElement(By.xpath(".//*[@id='maphead-collapse']/ul[3]/li/button")).click();
	      // create new Map button
	        driver.findElement(By.className("ng-pristine")).sendKeys("new map");

	      try {
	          Thread.sleep(6000);
	      } catch (InterruptedException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	      }
	      
	      String handle= driver.getWindowHandle();
	      
	        System.out.println(handle);

	        // Click on the Button "New Message Window"

	        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	        // Store and Print the name of all the windows open	              

	        java.util.Set<String> handles = driver.getWindowHandles();

	        System.out.println(handles);

	        // Pass a window handle to the other window

	        for (String handle1 : driver.getWindowHandles()) {

	        	System.out.println(handle1);

	     driver.switchTo().window(handle1);}

	     driver.findElement(By.xpath("//button[@ng-click='vm.toggleRight()']")).click();
	     
	     
	     driver.findElement(By.xpath("//a[contains(.,'Swimlanes')]")).click();
	   
	  
	        
	       
	 
	      
	            
	       
	}
	  
}


