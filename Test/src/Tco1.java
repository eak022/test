import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tco1 {
	 @Test
	    void test() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohn");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canonc");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("2");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("johnjohn",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test2() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnj");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncanoncano");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("149");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("johnj",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test3() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjo");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncanoncanon");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("150");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("johnjo",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test4() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohnjohnjo");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("johnjohnjohnjo",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test5() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohnjohnjoh");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("firstname")).getText();
	        assertEquals("johnjohnjohnjoh",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test6() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("john");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("formname")).getText();
	        assertEquals("Modern Form",result);
	        
	        driver.quit();
	    }
	 @Disabled
	    void test7() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohnjohnjohn");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("formname")).getText();
	        assertEquals("Modern Form",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test8() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohn");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("cano");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("149");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("formname")).getText();
	        assertEquals("Modern Form",result);
	        
	        driver.quit();
	    }
	 @Disabled
	    void test9() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohn");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncanoncanonc");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("75");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("formname")).getText();
	        assertEquals("Modern Form",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test10() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohn");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canoncan");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("0");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("formname")).getText();
	        assertEquals("Modern Form",result);
	        
	        driver.quit();
	    }
	 @Test
	    void test11() {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost/customer/index.html");

	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("johnjohn");
	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("canonc");
	        WebElement ageInput = driver.findElement(By.id("age"));
	        ageInput.sendKeys("151");
	        WebElement submitButton = driver.findElement(By.tagName("button"));
	        submitButton.click();
	        
	        String result = driver.findElement(By.id("formname")).getText();
	        assertEquals("Modern Form",result);
	        
	        driver.quit();
	    }
	 private void assertEquals(String string, String result) {
		 // TODo Auto-generated method stub
	 }
	
}
