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

Mobile.startExistingApplication('com.kfc.mobile.hkStaging')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_current_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_current_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/addrs_current_addrstitle'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/title_header_order'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/title_header_order'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_add_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_add_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_add_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_add_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_add_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_add_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_add_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_add_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_exp_img_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_exp_img_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_exp_img_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_exp_img_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_exp_img_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_exp_img_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_exp_img_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_exp_img_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/desc_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/desc_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/desc_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/desc_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/desc_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/desc_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/desc_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/desc_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/desc_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/desc_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/desc_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/desc_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/img_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/img_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/img_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/img_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/img_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/img_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/img_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/img_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/title_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/title_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/title_menu_1'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/title_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/title_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/title_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/title_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/title_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/title_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/title_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/title_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/title_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/txt_price_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/txt_price_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/txt_price_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/txt_price_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/txt_price_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/txt_price_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/txt_price_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/txt_price_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/txt_price_menu_3'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/txt_price_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/txt_price_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Order page/txt_price_menu_4'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

