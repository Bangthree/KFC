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

Mobile.verifyElementExist(findTestObject('Home Screen/btn_points_option'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/btn_points_option'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_points_option'), 2)

WebUI.comment('Check Earn on Choose Action')

Mobile.verifyElementExist(findTestObject('Choose Action/logo_earn_kfc_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Choose Action/logo_earn_kfc_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Choose Action/title_earn_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Choose Action/title_earn_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Choose Action/title_earn_chooseaction'), 'Earn', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Choose Action/desc_earn_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Choose Action/desc_earn_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Choose Action/desc_earn_chooseaction'), 'Show QR to the cashier to earn KFC Points for cash and non-cash payments', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Check Redeem on Choose Action')

Mobile.verifyElementExist(findTestObject('Choose Action/logo_redeem_coupon_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Choose Action/logo_redeem_coupon_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Choose Action/title_redeem_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Choose Action/title_redeem_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Choose Action/title_redeem_chooseaction'), 'Redeem', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Choose Action/desc_redeem_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Choose Action/desc_redeem_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Choose Action/desc_redeem_chooseaction'), 'You can redeem your KFC Points with DANA voucher', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

