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

Mobile.tap(findTestObject('Home Screen/btn_deliveryorder'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Selection/addrs_search_btnMap'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address/New Address Selection/addrs_search_btnMap'), 1)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Maps/maps_header_title'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_selection_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_selection_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Maps/maps_selection_desc'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_selection_title_DELIVADDRESS'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_selection_title_DELIVADDRESS'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Maps/maps_selection_title_DELIVADDRESS'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_google_location'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_google_location'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Delivery Address/New Maps/maps_google_location'), 'enabled', 'true', 
    1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_selection_pinIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_selection_pinIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_RedPinPoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_RedPinPoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Maps/maps_btnConfirmRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Maps/maps_btnConfirmRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Maps/maps_btnConfirmRed'), 1)

Mobile.tap(findTestObject('Delivery Address/New Maps/maps_btnConfirmRed'), 1)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_header_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_header_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_header_title_ADDRESSCON'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_header_title_ADDRESSCON'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Address Confirmation/addrscon_header_title_ADDRESSCON'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_favIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_favIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_pinIconred'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_pinIconred'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_title_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_title_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Address Confirmation/addrscon_title_TEBETDALAM'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_desc_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_desc_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Address Confirmation/addrscon_desc_TEBETDALAM'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_TextNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_TextNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Confirmation/addrscon_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Confirmation/addrscon_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address/New Address Confirmation/addrscon_btnOrderNowred'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.pressBack()

Mobile.takeScreenshot()

Mobile.pressBack()

