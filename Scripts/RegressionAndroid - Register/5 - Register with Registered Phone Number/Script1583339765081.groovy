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

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Register Test Started')

if (Mobile.verifyElementExist(findTestObject('Session Time Out/Session Time Out - Title'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.callTestCase(findTestCase('b. RegressioniOS - Login/Assist Test/Session Time Out Reset'), [:], FailureHandling.OPTIONAL)
} else {
    println = 'Session is new'
}

Mobile.waitForElementPresent(findTestObject('Login Page/BTN_REG'), 3)

Mobile.tap(findTestObject('Login Page/BTN_REG'), 3)

Mobile.waitForElementPresent(findTestObject('Register/Join Us/reg_header_title'), 3)

Mobile.setText(findTestObject('Register/Join Us/field_joinus_fullname_typeyourfull'), 'Bang', 2)

Mobile.setText(findTestObject('Register/Join Us/field_joinus_phonenum_mobile'), '085643628232', 2)

Mobile.tap(findTestObject('Register/Join Us/reg_header_nextbtn'), 3)

Mobile.waitForElementPresent(findTestObject('Register/Join Us/Error - Already Used/title_joinus_alreused_errorpop'), 3)

Mobile.verifyElementExist(findTestObject('Register/Join Us/Error - Already Used/desc_joinus_alreused_errorpop'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Join Us/Error - Already Used/title_joinus_alreused_errorpop'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/Join Us/Error - Already Used/btn_joinus_alreused_errorpop_OK'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Register/Join Us/Error - Already Used/btn_joinus_alreused_errorpop_OK'), 3)

Mobile.comment('Registered phone number done, Next to Invalid phone number')

