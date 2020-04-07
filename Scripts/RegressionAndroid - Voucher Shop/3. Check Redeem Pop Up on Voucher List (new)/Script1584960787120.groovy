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

Mobile.waitForElementPresent(findTestObject('Voucher List page/vouchlist_vouch1_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Voucher List page/vouchlist_vouch1_btnRedeem'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnDismissX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnDismissX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_VoucherTitle'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_VoucherTitle'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_VoucherTitle'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_VoucherDesc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_VoucherDesc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_VoucherDesc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_KFCPoints'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_KFCPoints'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_KFCPoints'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_imgCoupon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_imgCoupon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_TC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_TC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_TC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnCancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnCancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnCancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnConfirm_disabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Voucher List page/Pop up Redeem Voucher/redvouch_btnCancel'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

