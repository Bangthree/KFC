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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Login Page/ICO_KFC'), 2, FailureHandling.OPTIONAL) == false) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.callTestCase(findTestCase('Additional Cases/Log Out'), [:], FailureHandling.OPTIONAL)
} else {
    println = 'Login Page Ready'
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Additional Cases/Login Dana - User 1919'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_points_option'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Choose Action/cont_btnViewRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Choose Action/cont_btnViewRedeem'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Voucher List page/vouchlist_vouch1_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Voucher List page/vouchlist_vouch1_btnRedeem'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnConfirm_disabled'), 
    'enabled', 'false', 2)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnCancel'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('Voucher List page/vouchlist_vouch1_img'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Voucher Detail Page/vouchdet_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher Detail Page/vouchdet_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Voucher Detail Page/vouchdet_btnConfirm_disabled'), 'enabled', 'false', 
    2)

Mobile.getText(findTestObject('Voucher Detail Page/vouchdet_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Voucher Detail Page/vouchdet_btnCancel'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

