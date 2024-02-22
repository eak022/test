from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import unittest

class TestCustomer(unittest.TestCase):

    def testCase1(self):
        driver = None
        driver_path = "D:\\webdriver\\chromedriver.exe"
        chrome_options = webdriver.ChromeOptions()
        chrome_options.add_argument("--disable-extensions")
        driver = webdriver.Chrome(executable_path=driver_path, options=chrome_options)
        
        driver.get("http://localhost/customer/form.html")
        
        firstNameInput = driver.find_element(By.ID, "first-name")
        lastNameInput = driver.find_element(By.ID, "last-name")
        ageInput = driver.find_element(By.ID, "age")
        submitButton = driver.find_element(By.ID, "sub")
        firstNameInput.send_keys("johnjohn")
        lastNameInput.send_keys("canonc")
        ageInput.send_keys("2")

        # Submit the form
        submitButton.click()
        
        result = driver.find_element(By.ID, "firstname").text
        self.assertEqual("First Name: johnjohn", result)

        driver.save_screenshot("D:/screenshots/test_case1.png")
        time.sleep(2)  # หน่วงเวลา 5 วินาที
        driver.close()  # แก้ไขเป็น driver.close() แทน self.driver.close()

    def test_case2(self):
        self.driver.get("http://localhost/customer/form.html")

        firstNameInput = self.driver.find_element_by_id("first-name")
        lastNameInput = self.driver.find_element_by_id("last-name")
        ageInput = self.driver.find_element_by_id("age")
        submitButton = self.driver.find_element_by_id("sub")

        firstNameInput.send_keys("Johnj")
        lastNameInput.send_keys("canoncanoncano")
        ageInput.send_keys("149")

        submitButton.click()

        result = self.driver.find_element_by_id("firstname").text
        self.assertEqual("First Name: Johnj", result)

    def testCase3(self):
        self.driver.get("http://localhost/customer/form.html")
        first_name_input = self.driver.find_element_by_id("first-name")
        last_name_input = self.driver.find_element_by_id("last-name")
        age_input = self.driver.find_element_by_id("age")
        submit_button = self.driver.find_element_by_id("sub")
        first_name_input.send_keys("johnjo")
        last_name_input.send_keys("canoncanoncanon")
        age_input.send_keys("150")
        # Submit the form
        submit_button.click()
        result = self.driver.find_element_by_id("firstname").text
        self.assertEqual("First Name: johnjo", result)

    def testCase4(self):
        self.driver.get("http://localhost/customer/form.html")
        first_name_input = self.driver.find_element_by_id("first-name")
        last_name_input = self.driver.find_element_by_id("last-name")
        age_input = self.driver.find_element_by_id("age")
        submit_button = self.driver.find_element_by_id("sub")
        first_name_input.send_keys("johnjohnjohnjo")
        last_name_input.send_keys("canoncan")
        age_input.send_keys("75")
        # Submit the form
        submit_button.click()
        result = self.driver.find_element_by_id("firstname").text
        self.assertEqual("First Name: johnjohnjohnjo", result)

    def testCase5(self):
        self.driver.get("http://localhost/customer/form.html")
        first_name_input = self.driver.find_element_by_id("first-name")
        last_name_input = self.driver.find_element_by_id("last-name")
        age_input = self.driver.find_element_by_id("age")
        submit_button = self.driver.find_element_by_id("sub")
        first_name_input.send_keys("johnjohnjohnjoh")
        last_name_input.send_keys("canoncan")
        age_input.send_keys("75")
        # Submit the form
        submit_button.click()
        result = self.driver.find_element_by_id("firstname").text
        self.assertEqual("First Name: johnjohnjohnjoh", result)

    def testCase6(self):
        self.driver.get("http://localhost/customer/form.html")
        first_name_input = self.driver.find_element_by_id("first-name")
        last_name_input = self.driver.find_element_by_id("last-name")
        age_input = self.driver.find_element_by_id("age")
        submit_button = self.driver.find_element_by_id("sub")
        first_name_input.send_keys("John")
        last_name_input.send_keys("cannoncan")
        age_input.send_keys("75")
        # Submit the form
        submit_button.click()
        result = self.driver.find_element_by_id("formname").text
        self.assertEqual("Customer Detail Form", result)

    def testCase10(self):
        self.driver.get("http://localhost/customer/form.html")
        first_name_input = self.driver.find_element_by_id("first-name")
        last_name_input = self.driver.find_element_by_id("last-name")
        age_input = self.driver.find_element_by_id("age")
        submit_button = self.driver.find_element_by_id("sub")
        first_name_input.send_keys("johnjohn")
        last_name_input.send_keys("canoncan")
        age_input.send_keys("0")
        # Submit the form
        submit_button.click()
        result = self.driver.find_element_by_id("formname").text
        self.assertEqual("Customer Detail Form", result)

    def testCase11(self):
        self.driver.get("http://localhost/customer/form.html")
        first_name_input = self.driver.find_element_by_id("first-name")
        last_name_input = self.driver.find_element_by_id("last-name")
        age_input = self.driver.find_element_by_id("age")
        submit_button = self.driver.find_element_by_id("sub")
        first_name_input.send_keys("johnjohn")
        last_name_input.send_keys("canoncan")
        age_input.send_keys("151")
        # Submit the form
        submit_button.click()
        result = self.driver.find_element_by_id("formname").text
        self.assertEqual("Customer Detail Form", result)


if __name__ == "__main__":
    unittest.main()

