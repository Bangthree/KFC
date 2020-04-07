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

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Order page/a. After Select/btn_reduceamt_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/a. After Select/btn_reduceamt_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Order page/a. After Select/btn_reduceamt_menu_1'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/a. After Select/btn_reduceamt_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/a. After Select/btn_reduceamt_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Order page/a. After Select/btn_reduceamt_menu_2'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Order page/a. After Select/icon_button_confirm_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Order page/a. After Select/icon_button_confirm_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Order page/a. After Select/txt_amount_item'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Order page/a. After Select/txt_amount_item'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Order page/a. After Select/txt_total_price_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Order page/a. After Select/txt_total_price_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Order page/a. After Select/txt_amount_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Order page/a. After Select/txt_amount_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Order page/a. After Select/txt_amount_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Order page/a. After Select/txt_amount_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Order page/a. After Select/btn_next_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Order page/a. After Select/btn_next_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_add_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_add_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_add_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_add_menu_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

