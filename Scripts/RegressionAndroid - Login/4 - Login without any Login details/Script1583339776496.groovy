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

Mobile.comment('Empty Phone Number and Password')

Mobile.clearText(findTestObject('Login Page/FIELD_MOBILENUMBER'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Login Page/FIELD_PASS'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/BTN_LOGIN'), 2)

Mobile.comment('Check Error Messages - Empty field')

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/ERROREMPTYCRED - TITLE'), 1)

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/ERROREMPTYCRED - DESC'), 1)

Mobile.verifyElementText(findTestObject('Login Page/ERR HANDLING/ERROREMPTYCRED - DESC'), 'Please fill in all of the required fields')

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/OK BUTTON'), 1)

Mobile.tap(findTestObject('Login Page/ERR HANDLING/OK BUTTON'), 2)

