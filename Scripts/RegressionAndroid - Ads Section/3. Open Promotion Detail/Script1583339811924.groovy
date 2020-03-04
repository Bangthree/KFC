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

Mobile.tap(findTestObject('Home Screen/btn_ongoingprmo_viewall'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Ads section/title_header_promo_promopage'), 1)

Mobile.tap(findTestObject('Ads section/img_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Ads section/insidepromo_header_btnBack'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/insidepromo_header_btnBack'), 1)

Mobile.verifyElementExist(findTestObject('Ads section/insidepromo_header_btnBack'), 1)

Mobile.verifyElementVisible(findTestObject('Ads section/insidepromo_header_title'), 1)

Mobile.verifyElementExist(findTestObject('Ads section/insidepromo_header_title'), 1)

Mobile.verifyElementVisible(findTestObject('Ads section/webview_onpromo'), 1)

Mobile.verifyElementExist(findTestObject('Ads section/webview_onpromo'), 1)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('Promo 1 Redirection Page', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Ads section/title_header_promo_promopage'), 1)

Mobile.tap(findTestObject('Ads section/img_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Ads section/insidepromo_header_btnBack'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/insidepromo_header_btnBack'), 1)

Mobile.verifyElementExist(findTestObject('Ads section/insidepromo_header_btnBack'), 1)

Mobile.verifyElementVisible(findTestObject('Ads section/insidepromo_header_title'), 1)

Mobile.verifyElementExist(findTestObject('Ads section/insidepromo_header_title'), 1)

Mobile.verifyElementVisible(findTestObject('Ads section/webview_onpromo'), 1)

Mobile.verifyElementExist(findTestObject('Ads section/webview_onpromo'), 1)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('Promo 2 Redirection Page', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

