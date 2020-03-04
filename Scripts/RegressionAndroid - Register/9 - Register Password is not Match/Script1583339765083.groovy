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

Mobile.clearText(findTestObject('Register/Join Us/field_joinus_fullname_typeyourfull'), 3)

Mobile.clearText(findTestObject('Register/Join Us/field_joinus_phonenum_mobile'), 3)

Mobile.setText(findTestObject('Register/Join Us/field_joinus_fullname_typeyourfull'), 'Automate' + RandomStringUtils.randomNumeric(
        3), 2)

Mobile.setText(findTestObject('Register/Join Us/field_joinus_phonenum_mobile'), '0858230' + RandomStringUtils.randomNumeric(
        6), 2)

Mobile.tap(findTestObject('Register/Join Us/reg_header_nextbtn'), 3)

Mobile.waitForElementPresent(findTestObject('Register/Password/passw_kfc_logo'), 3)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_bottom_3_lines'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_desc_createyour'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_desc_password'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_header_backbtn'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_header_nextbtn'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_kfc_logo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_retypepass_btnShow'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_retypepass_edittext'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_retypepass_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_typepass_btnShow'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_typepass_edittext'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/passw_typepass_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Register/Password/passw_typepass_edittext'), RandomStringUtils.randomAlphabetic(6), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Register/Password/passw_retypepass_edittext'), RandomStringUtils.randomAlphabetic(6), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Register/Password/btn_passw_next_new'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register/Password/Error - Not Match/passw_errorpop_title'), 3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Not Match/passw_errorpop_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Not Match/passw_errorpop_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Register/Password/Error - Not Match/passw_errorpop_desc'), 'The password you type does not match', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Password/Error - Not Match/passw_errorpop_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Register/Password/Error - Not Match/passw_errorpop_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Register Password Done, Next password less than 6')

