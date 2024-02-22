import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestCustomerForm {

	@Test
	void testCase1() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canonc");
        ageInput.sendKeys("2");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohn",result);
        driver.close();     
	}

	@Test
	void testCase2() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("Johnj");
        lastNameInput.sendKeys("canoncanoncano");
        ageInput.sendKeys("149");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: Johnj",result);
        driver.close();     
	}

	@Test
	void testCase3() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjo");
        lastNameInput.sendKeys("canoncanoncanon");
        ageInput.sendKeys("150");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjo",result);
        driver.close();     
	}
	
	@Test
	void testCase4() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohnjohnjo");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohnjohnjo",result);
        driver.close();     
	}	

	@Test
	void testCase5() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohnjohnjoh");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohnjohnjoh",result);
        driver.close();     
	}		
	
	
	@Test
	void testCase6() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("cannoncan");
        ageInput.sendKeys("75");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Detail Form",result);
        driver.close();     
	}
	
	@Disabled
	void testCase7() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/web/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohnjohnjohn");
        lastNameInput.sendKeys("cannoncan");
        ageInput.sendKeys("75");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Detail Form",result);
        driver.close();     
	}
	
	@Test
	void testCase8() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("cano");
        ageInput.sendKeys("75");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Detail Form",result);
        driver.close();     
	}

	@Disabled
	void testCase9() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncanoncanonc");
        ageInput.sendKeys("75");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Detail Form",result);
        driver.close();     
	}
	
	@Test
	void testCase10() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("0");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Detail Form",result);
        driver.close();     
	}
	
	@Test
	void testCase11() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/form.html");
        
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("151");

        // Submit the form
        submitButton.click();
        
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Detail Form",result);
        driver.close();     
	}
}
