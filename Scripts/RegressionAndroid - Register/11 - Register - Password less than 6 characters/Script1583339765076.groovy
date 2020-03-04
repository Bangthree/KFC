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

Mobile.delay(2)

Mobile.clearText(findTestObject('Register/Password/passw_typepass_edittext'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Register/Password/passw_retypepass_edittext'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Register/Password/passw_typepass_edittext'), 'Hello', 1)

Mobile.setText(findTestObject('Register/Password/passw_retypepass_edittext'), 'Hello', 1)

Mobile.tap(findTestObject('Register/Password/passw_header_nextbtn'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register/Password/Error - Less than 6 Char/desc_passw_error6char'), 3)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Less than 6 Char/title_passw_error6char'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Less than 6 Char/desc_passw_error6char'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Register/Password/Error - Less than 6 Char/desc_passw_error6char'), 'Password should be at least 6 characters', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Less than 6 Char/btn_passw_error6char_OK'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Register/Password/Error - Less than 6 Char/btn_passw_error6char_OK'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Register/Password/passw_typepass_edittext'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Register/Password/passw_retypepass_edittext'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register/Password/passw_header_nextbtn'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register/Password/Error - Required Fields/passw_errorreqpop_title'), 3)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Required Fields/passw_errorreqpop_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Required Fields/passw_errorreqpop_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Register/Password/Error - Required Fields/passw_errorreqpop_desc'), 'Please fill in all of the required fields', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Required Fields/passw_errorreqpop_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Register/Password/Error - Required Fields/passw_errorreqpop_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.delay(2)

