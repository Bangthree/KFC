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

Mobile.tap(findTestObject('Home Screen - New/btn_userprofile'), 1)

Mobile.waitForElementPresent(findTestObject('Profile Page - New/btn_mybalance_history'), 1)

Mobile.tap(findTestObject('Profile Page - New/btn_mybalance_history'), 1)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Points History Page/historypage_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Points History Page/historypage_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Points History Page/historypage_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Points History Page/historypage_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Points History Page/historypage_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Points History Page/historypage_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Points History Page/historypage_webview_historycontainer'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Points History Page/historypage_webview_historycontainer'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Points History Page/historypage_webview_historycontainer'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Points History Page/historypage_webview_historycontent'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Points History Page/historypage_webview_historycontent'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.pressBack()

Mobile.pressBack()

