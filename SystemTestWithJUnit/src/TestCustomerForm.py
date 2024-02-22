from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import unittest

class TestCustomer(unittest.TestCase):

    def setUp(self):
        self.driver = None
        self.driver_path = "D:\\webdriver\\chromedriver.exe"
        self.chrome_options = webdriver.ChromeOptions()
        self.chrome_options.add_argument("--disable-extensions")
        self.driver = webdriver.Chrome(executable_path=self.driver_path, options=self.chrome_options)

    def tearDown(self):
        if self.driver is not None:
            self.driver.quit()

    def save_screenshot(self, filename):
        self.driver.save_screenshot(filename)

    def testCase1(self):
        self.driver.get("http://localhost/customer/form.html")
        firstNameInput = self.driver.find_element(By.ID, "first-name")
        lastNameInput = self.driver.find_element(By.ID, "last-name")
        ageInput = self.driver.find_element(By.ID, "age")
        submitButton = self.driver.find_element(By.ID, "sub")
        firstNameInput.send_keys("johnjohn")
        lastNameInput.send_keys("canonc")
        ageInput.send_keys("2")
        # Submit the form
        submitButton.click()
        result = self.driver.find_element(By.ID, "firstname").text
        self.assertEqual("First Name: johnjohn", result)
        self.save_screenshot("D:/screenshots/test_case1.png")
        time.sleep(2)
        
    def testCase2(self):
        self.driver.get("http://localhost/customer/form.html")
        firstNameInput = self.driver.find_element(By.ID, "first-name")
        lastNameInput = self.driver.find_element(By.ID, "last-name")
        ageInput = self.driver.find_element(By.ID, "age")
        submitButton = self.driver.find_element(By.ID, "sub")
        firstNameInput.send_keys("Johnj")
        lastNameInput.send_keys("canoncanoncano")
        ageInput.send_keys("149")
        # Submit the form
        submitButton.click()
        result = self.driver.find_element(By.ID, "firstname").text
        self.assertEqual("First Name: Johnj", result)
        self.save_screenshot("D:/screenshots/test_case2.png")
        time.sleep(2)

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
        self.save_screenshot("D:/screenshots/test_case3.png")
        time.sleep(2)


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
        self.save_screenshot("D:/screenshots/test_case4.png")
        time.sleep(2)


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
        self.save_screenshot("D:/screenshots/test_case5.png")
        time.sleep(2)


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
        self.save_screenshot("D:/screenshots/test_case6.png")
        time.sleep(2)


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
        self.save_screenshot("D:/screenshots/test_case10.png")
        time.sleep(2)


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
        self.save_screenshot("D:/screenshots/test_case11.png")
        time.sleep(2)



if __name__ == "__main__":
    unittest.main()

