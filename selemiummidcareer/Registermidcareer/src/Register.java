import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class Register {

	@Test
	void testRegister() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.coding-midcareer.com/");
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement waitWeb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("theme-btn")));
        waitWeb.click();
       
        Select drpname = new Select(driver.findElement(By.id("pre_name_th")));
        drpname.selectByVisibleText("���");
        WebElement name = driver.findElement(By.name("name_th"));
        name.sendKeys("เอกชัย");
        WebElement lastname = driver.findElement(By.name("lastname_th"));
        lastname.sendKeys("วิรุฬห์กุลภัทร");
        WebElement name_en = driver.findElement(By.name("name_en"));
        name_en.sendKeys("Eakkachai");
        WebElement lastname_en = driver.findElement(By.name("lastname_en"));
        lastname_en.sendKeys("Wirunkunlaphat");
        WebElement id_card = driver.findElement(By.name("id_card"));
        id_card.sendKeys("0000000000000");
        WebElement birthday = driver.findElement(By.name("birthday"));
        birthday.sendKeys("21/10/2545");
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("0978909960");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("ekeak@gmail.com");
        
        
        WebElement ageInput = driver.findElement(By.name("age"));
        String ageText = ageInput.getAttribute("value");
        int age = Integer.parseInt(ageText);
		System.out.println("AGE: " + age + " YEAR");
        Thread.sleep(5000);
		driver.close();
    }

}