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

Mobile.startExistingApplication('com.kfc.mobile.hkStaging')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Check History Button Existence')

Mobile.verifyElementExist(findTestObject('Home Screen/btn_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/btn_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_history'), 2)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Check History Button Redirection')

Mobile.verifyElementExist(findTestObject('Order History/ORDER HISTORY - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order History/ORDER HISTORY - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap using Back Button (Embedded Back Button)'
Mobile.tap(findTestObject('Order History/BACK BUTTON'), 2)

WebUI.comment('Check History Button Back Button Redirection')

Mobile.waitForElementPresent(findTestObject('Home Screen - New/img_kfc_newhomepage'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/img_btn_delivorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/img_btn_delivorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/img_btn_PNP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/img_btn_PNP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_history'), 2)

WebUI.comment('Check History Button Redirection')

Mobile.verifyElementExist(findTestObject('Order History/ORDER HISTORY - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order History/ORDER HISTORY - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap using Back Button (Device Button)'
Mobile.pressBack()

WebUI.comment('Check Device Back Button Redirection from History')

Mobile.verifyElementExist(findTestObject('Home Screen - New/img_btn_delivorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/img_btn_delivorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/img_btn_PNP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/img_btn_PNP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

