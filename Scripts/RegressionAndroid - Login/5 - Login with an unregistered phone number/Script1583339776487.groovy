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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.clearText(findTestObject('Login Page/FIELD_MOBILENUMBER'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Login Page/FIELD_PASS'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Login Page/FIELD_MOBILENUMBER'), '0858230' + RandomStringUtils.randomNumeric(6), 2)

Mobile.setText(findTestObject('Login Page/FIELD_PASS'), '111111', 0)

Mobile.tap(findTestObject('Login Page/BTN_LOGIN'), 2)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Login Page/ERR HANDLING/ERRORCRED - TITLE'), 1)

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/ERRORCRED - TITLE'), 1)

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/ERRORCRED - DESC'), 1)

Mobile.verifyElementExist(findTestObject('Login Page/ERR HANDLING/ERRORCRED - BTNOK'), 1)

Mobile.tap(findTestObject('Login Page/ERR HANDLING/ERRORCRED - BTNOK'), 2)

Mobile.callTestCase(findTestCase('RegressionAndroid - Login/6 - Login with invalid password'), [:], FailureHandling.STOP_ON_FAILURE)

