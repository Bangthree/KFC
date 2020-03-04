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

Mobile.tap(findTestObject('Home Screen/btn_ongoingprmo_viewall'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/title_header_promo_promopage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

'Check Promo Title Header'
Mobile.verifyElementVisible(findTestObject('Ads section/title_header_promo_promopage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/btn_back_promopage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/btn_back_promopage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

'Check Back Button Functionality\n'
Mobile.tap(findTestObject('Ads section/btn_back_promopage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/img_kfc_bucket'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/img_kfc_jago'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_ongoingprmo_viewall'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/desc_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/desc_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Ads section/desc_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/title_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/title_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Ads section/title_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/img_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/img_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/desc_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/desc_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Ads section/desc_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/title_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/title_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Ads section/title_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Ads section/img_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Ads section/img_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 750)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('OpenPromoList', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

