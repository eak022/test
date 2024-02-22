from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
import time
import unittest

class TestCustomerForm(unittest.TestCase):
    def setUp(self):
        # Initialize the Chrome WebDriver with ChromeOptions
        options = webdriver.ChromeOptions()
        options.add_experimental_option('excludeSwitches', ['enable-logging'])
        s = Service('D:\webdriver\chromedriver.exe')
        self.driver = webdriver.Chrome(service=s, options=options)

    def test_input1(self):
       
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(0)
        
        name.send_keys("johnjohn")
        last.send_keys("canonc")
        age.send_keys("2")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) 
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: johnjohn", result)

    def test_input2(self):
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("Johnj")
        last.send_keys("canoncanoncano")
        age.send_keys("149")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name:Johnj", result)
        print("Test case test_input2 completed successfully.")

    def test_input3(self):
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("johnjo")
        last.send_keys("canoncanoncanon")
        age.send_keys("150")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: johnjo", result)
        print("Test case test_input2 completed successfully.")

    def test_input4(self):
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("johnjohnjohnjo")
        last.send_keys("canoncan")
        age.send_keys("75")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: johnjohnjohnjo", result)
        print("Test case test_input2 completed successfully.")

    def test_input5(self):
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("johnjohnjohnjoh")
        last.send_keys("canoncan")
        age.send_keys("75")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: johnjohnjohnjoh", result)
        print("Test case test_input2 completed successfully.")

    def test_input6(self):
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("John")
        last.send_keys("cannoncan")
        age.send_keys("75")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: John", result)
        print("Test case test_input2 completed successfully.")

    def test_input8(self):
      
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("johnjohn")
        last.send_keys("canon")
        age.send_keys("75")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: johnjohn", result)
        print("Test case test_input2 completed successfully.")


    def test_input10(self):
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("johnjohn")
        last.send_keys("canoncan")
        age.send_keys("10")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: mary", result)
        print("Test case test_input2 completed successfully.")
    def test_input11(self):
        print("Running test_input2...")
        self.driver.get("http://localhost/customerphp/customer.php")
        
        name = self.driver.find_element(By.ID, "firstName")
        last = self.driver.find_element(By.ID, "lastName")
        age = self.driver.find_element(By.ID, "age")
        drp_title = Select(self.driver.find_element(By.ID, "title"))
        drp_title.select_by_index(1)
        
        name.send_keys("johnjohn")
        last.send_keys("canoncan")
        age.send_keys("150")

        submit = self.driver.find_element(By.ID, "submit")
        submit.click()

        time.sleep(1) # Give some time for the page to update
        
        result = self.driver.find_element(By.ID, "firstName").text
        self.assertEqual("First Name: johnjohn", result)
        print("Test case test_input2 completed successfully.")    

    def tearDown(self):
        print("Capturing screenshot...")
        self.driver.save_screenshot(self._testMethodName + '.png')
        print("Screenshot captured.")
        print("Tearing down...")
        self.driver.close()

if __name__ == "__main__":
    unittest.main()