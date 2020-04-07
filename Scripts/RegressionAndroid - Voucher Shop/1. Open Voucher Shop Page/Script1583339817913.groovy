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

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_points_option'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Choose Action/cont_btnViewRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Choose Action/cont_btnViewRedeem'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.waitForElementPresent(findTestObject('Voucher List page/vouchlist_vouch1_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

Mobile.verifyElementExist(findTestObject('Voucher List page/container_mybalance(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/container_mybalance(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/desc_mybalance_mybalance(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/desc_mybalance_mybalance(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/desc_mybalance_mybalance(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/desc_mybalance_pointamt(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/desc_mybalance_pointamt(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/desc_mybalance_pointamt(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/img_mybalance_kfc(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/img_mybalance_kfc(new)'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_redeem_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_redeem_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_redeem_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_redeem_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_redeem_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_redeem_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch1_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch1_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch1_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch1_couponlogo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch1_couponlogo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch1_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch1_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch1_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch1_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch1_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch1_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch1_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch1_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch1_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch1_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch1_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch2_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch2_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch2_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch2_couponlogo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch2_couponlogo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch2_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch2_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch2_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch2_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch2_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch2_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch2_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch2_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Voucher List page/vouchlist_vouch2_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher List page/vouchlist_vouch2_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Voucher List page/vouchlist_vouch2_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 800, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(500, 800, 500, 1500, FailureHandling.CONTINUE_ON_FAILURE)

