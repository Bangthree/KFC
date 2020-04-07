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

WebUI.callTestCase(findTestCase('Additional Cases/Device Info'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Pocket Page Test Started')

if (Mobile.verifyElementExist(findTestObject('Session Time Out/Session Time Out - Title'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Additional Cases/Session Time Out Reset'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Session is new'
}

if (Mobile.verifyElementExist(findTestObject('Login Page/DESC_WELCOME'), 2, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Additional Cases/Login Dana - User 1919'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in, Homepage ready'
}

WebUI.delay(4)

Mobile.tap(findTestObject('Home Screen/btn_voucher_bottombar'), 1)

WebUI.delay(15)

Mobile.waitForElementPresent(findTestObject('pocket page/title_voucher_header_pocket'), 1)

Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_header_pocket'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/title_voucher_header_pocket'), 1)

Mobile.verifyElementText(findTestObject('pocket page/title_voucher_header_pocket'), 'Voucher')

Mobile.verifyElementExist(findTestObject('pocket page/btn_voucher_tab'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/icon_voucher_tab'), 1)

Mobile.verifyElementText(findTestObject('pocket page/title_voucher_tab'), 'Voucher')

Mobile.verifyElementExist(findTestObject('pocket page/btn_nearlyexp_tab'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/icon_nearlyexp_tab'), 1)

Mobile.verifyElementText(findTestObject('pocket page/title_nearlyexp_tab'), 'Nearly Expired')

Mobile.verifyElementExist(findTestObject('pocket page/btn_history_tab'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/icon_history_tab'), 1)

Mobile.verifyElementText(findTestObject('pocket page/title_history_tab'), 'History')

if (Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_recieve_month'), 2, FailureHandling.OPTIONAL) == 
false) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/icon_no_voucher_available'), 1)

    Mobile.verifyElementText(findTestObject('pocket page/desc_no_voucher_vouchertab'), 'Let\'s fill up this page with vouchers!')
} else {
    println = 'Pocket Page Opened Successfully'
}

