import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

class TestGoogleWebsite {

	@Test
	void testGoogleWebsite() {
		 WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        
	        WebElement search_box = driver.findElement(By.name("q"));
	        search_box.sendKeys("NPRU");
	        search_box.sendKeys(Keys.ENTER);
	        
	        String result = driver.findElement(By.className("VuuXrf")).getText();
	        assertEquals("มหาวิทยาลัยราชภัฏนครปฐม",result);
	
	}
	

}
