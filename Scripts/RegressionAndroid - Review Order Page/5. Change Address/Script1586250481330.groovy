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

Mobile.comment('Reached Review Order Page')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_desc'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btncancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btncancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btncancel'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Change Address Cancelled')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_desc'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btncancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btncancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Review Order Page/Change Address Prompt/revord_chgadd_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Change Address Executed, Redirect to Address selection')

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_search_btnBack'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_search_btnBack'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_search_searchbar'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_search_searchbar'), 1)

Mobile.pressBack()

