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

Mobile.comment('Default location must be set to Tebet Dalam First')

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen - New/btn_delivery_new'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/Current - Tebet Dalam Barat VIII/current_title_tebetdalamviii'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Delivery Address - New/Current - Tebet Dalam Barat VIII/current_favicon'), 
    'selected', 'false', 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/Current - Tebet Dalam Barat VIII/current_favicon'), 1)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_btnBack'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_title'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_name'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_name'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_name'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_address'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_address'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_address'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_notes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_notes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_notes'), 1)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/field_address'), 1)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/field_name'), 1)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/field_notes'), 1)

Mobile.clearText(findTestObject('Favorite Address/Save Fav Address/field_name'), 1)

Mobile.clearText(findTestObject('Favorite Address/Save Fav Address/field_notes'), 1, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Favorite Address/Save Fav Address/field_name'), 'Rumah Mantan SMA', 1)

Mobile.setText(findTestObject('Favorite Address/Save Fav Address/field_notes'), 'Rasa kenangan tidak selalu manis', 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1)

Mobile.tap(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savsuccess_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savsuccess_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savsuccess_desc'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savsuccess_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savsuccess_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Favorite Address/Save Fav Address/savsuccess_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.pressBack()

