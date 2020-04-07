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

Mobile.tap(findTestObject('Delivery Address - New/addrs_search_searchbar'), 1)

Mobile.setText(findTestObject('Delivery Address - New/addrs_search_searchbar'), 'Jl. Tebet Barat VIII', 
    5)

Mobile.tap(findTestObject('Delivery Address - New/addrs_current_favicon_notselected'), 1)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Favorite Address/Save Fav Address/field_name'), 'Rumah Mantan', 5)

Mobile.setText(findTestObject('Favorite Address/Save Fav Address/field_notes'), 'Kadang teringat malam itu', 5)

Mobile.tap(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1)

Mobile.waitForElementPresent(findTestObject('Favorite Address/Save Fav Address/savsuccess_popup'), 1)

Mobile.tap(findTestObject('Favorite Address/Save Fav Address/savsuccess_btnOk'), 1)

Mobile.pressBack()

