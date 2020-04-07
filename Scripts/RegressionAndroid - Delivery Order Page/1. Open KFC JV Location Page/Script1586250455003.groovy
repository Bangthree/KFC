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

Mobile.tap(findTestObject('Home Screen - New/btn_delivery_new'), 1)

Mobile.waitForElementPresent(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_search_btnBack'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_search_btnBack'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_search_searchbar'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_search_searchbar'), 1)

Mobile.tap(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_btnConfirmRed'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_btnConfirmRed'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_google_icon'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_google_icon'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_google_location'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_google_location'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_header_btnBack'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_header_btnBack'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_header_title'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_header_title'), 1)

Mobile.getText(findTestObject('Delivery Address - New/New Maps/maps_header_title'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_RedPinPoint'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_RedPinPoint'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_selection_desc'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_selection_desc'), 1)

Mobile.getText(findTestObject('Delivery Address - New/New Maps/maps_selection_desc'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_selection_pinIcon'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_selection_pinIcon'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_selection_title_DELIVADDRESS'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_selection_title_DELIVADDRESS'), 1)

Mobile.takeScreenshot('Address Selection By Maps', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.pressBack()

