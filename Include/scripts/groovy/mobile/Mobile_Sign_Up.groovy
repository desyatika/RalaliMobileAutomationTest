package mobile
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Mobile_Sign_Up {
	@Given("user navigates to Sign up page on mobile apps")
	def navigateToSignUpPage() {
		
		Mobile.startApplication("C:\\Users\\AVOWS\\Documents\\Desy\\Test Automation Ralali Desy\\Test Automation Ralali\\apk\\sample-android.apk", false)
		Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/SignIn/button_Login'), 20)
		
	}
	
	@When("user clicks on Create Account label")
	def clickCreateAccount() {
		
		Mobile.tap(findTestObject('Object Repository/Mobile/SignUp/label_CreateNewAccount'), 0)
				
	}
	
	@And("user inputs (.*) in name field")
	def inputName(String name) {
		
		Mobile.setText(findTestObject('Object Repository/Mobile/SignUp/text_Name'), name, 0)
						
	}
	
	@And("user inputs (.*) in email field")
	def inputEmail(String email) {
		
		Mobile.setText(findTestObject('Object Repository/Mobile/SignUp/text_Email'), email, 0)
		
	}
	
	@And("user inputs (.*) in password field")
	def inputPassword(String password) {
		
		Mobile.setText(findTestObject('Object Repository/Mobile/SignUp/text_Password'), password, 0)
		
	}
	
	@And("user inputs (.*) in confirm password field")
	def inputConfirmPassword(String confirm_password) {
		
		Mobile.setText(findTestObject('Object Repository/Mobile/SignUp/text_Confirm_Password'), confirm_password, 0)
		
	}
	
	@And("user clicks on Register button")
	def clickRegisterBtn() {
		
		Mobile.tap(findTestObject('Object Repository/Mobile/SignUp/button_Register'), 0)
		
	}
	
	@Then("an account is successfully created")
	def verifyRegistrationSuccessful() {
		
		Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/SignUp/label_Registration Successful'), 5)
		
	}
}