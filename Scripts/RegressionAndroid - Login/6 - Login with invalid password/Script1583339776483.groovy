import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.clearText(findTestObject('Login Page/FIELD_MOBILENUMBER'), 2)

Mobile.setText(findTestObject('Login Page/FIELD_MOBILENUMBER'), '085643628232', 1)

Mobile.setText(findTestObject('Login Page/FIELD_PASS'), 'akuganteng', 0)

Mobile.tap(findTestObject('Login Page/BTN_LOGIN'), 2)

Mobile.waitForElementPresent(findTestObject('Login Page/ERR HANDLING/LOGIN FAIL - TITLE'), 1)

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/LOGIN FAIL - TITLE'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/LOGIN FAIL - DESC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Login Page/ERR HANDLING/LOGIN FAIL - DESC'), 'Invalid login credentials. Please try again.', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Login Page/ERR HANDLING/LOGIN FAIL - TITLE'), 'Login Failed', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/OK BUTTON'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/ERR HANDLING/OK BUTTON'), 3)

