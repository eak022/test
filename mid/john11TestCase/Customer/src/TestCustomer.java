import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class TestCustomer {

	@Test
	void testInput1() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("johnjohn");
		last.sendKeys("canonc");
		age.sendKeys("2");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: johnjohn",result);
        driver.close();
	}
	
	@Test
	void testInput2() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("Johnj");
		last.sendKeys("canoncanoncano");
		age.sendKeys("149");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: Johnj",result);
        driver.close();
	}

	@Test
	void testInput3() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("Johnjohnjohnjo");
		last.sendKeys("canoncanoncanon");
		age.sendKeys("150");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: Johnjohnjohnjo",result);
        driver.close();
	}
	
	@Test
	void testInput4() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("Johnjohnjohnjo");
		last.sendKeys("canoncan");
		age.sendKeys("75");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: Johnjohnjohnjo",result);
        driver.close();
	}
	
	@Test
	void testInput5() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("johnjohnjohnjoh");
		last.sendKeys("canoncan");
		age.sendKeys("75");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: johnjohnjohnjoh",result);
        driver.close();
	}
	
	@Test
	void testInput6() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("john");
		last.sendKeys("canoncan");
		age.sendKeys("75");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: john",result);
        driver.close();
	}
	
	@Test
	void testInput7() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("johnjohnjohnjohn");
		last.sendKeys("canoncan");
		age.sendKeys("75");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: johnjohnjohnjohn",result);
        driver.close();
	}
	
	@Test
	void testInput8() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("johnjohn");
		last.sendKeys("cano");
		age.sendKeys("75");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: johnjohn",result);
        driver.close();
	}
	
	@Test
	void testInput9() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("johnjohn");
		last.sendKeys("canoncanoncanonc");
		age.sendKeys("75");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: johnjohn",result);
        driver.close();
	}
	
	@Test
	void testInput10() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("johnjohn");
		last.sendKeys("canoncan");
		age.sendKeys("0");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: johnjohn",result);
        driver.close();
	}
	
	@Test
	void testInput11() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/customerphp/customer.php");
        
        WebElement name = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        Select drp_title = new Select(driver.findElement(By.id("title")));
		drp_title.selectByIndex(0);
		
		name.sendKeys("johnjohn");
		last.sendKeys("canoncan");
		age.sendKeys("151");
        
//		Thread.sleep(500);
		WebElement submit = driver.findElement(By.id("submit"));
//		submit.sendKeys(Keys.ENTER);
		submit.click();
//		Thread.sleep(500);
		
        String result = driver.findElement(By.id("firstName")).getText();
        assertEquals("First Name: johnjohn",result);
        driver.close();
	}

}
