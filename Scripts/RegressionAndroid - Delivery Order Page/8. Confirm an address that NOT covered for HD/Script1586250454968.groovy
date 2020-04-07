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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/addrs_search_searchbar'), 1)

Mobile.setText(findTestObject('Delivery Address - New/addrs_search_searchbar'), 'Purworejo', 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_desc_tebetdalam'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_desc_tebetdalam'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_desc_tebetdalam'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_favicon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_favicon'), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_pinicon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_pinicon'), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_title_tebetdalam'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_title_tebetdalam'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_title_tebetdalam'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/Search - Tebet Dalam Barat VIII/search_title_tebetdalam'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_err_outsidearea_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/addrs_err_outsidearea_text'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_err_outsidearea_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_err_outsidearea_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/addrs_err_outsidearea_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/addrs_err_outsidearea_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

