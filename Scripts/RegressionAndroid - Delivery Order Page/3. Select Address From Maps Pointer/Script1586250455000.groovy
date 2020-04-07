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

Mobile.tap(findTestObject('Home Screen - New/btn_delivery_new'), 1)

Mobile.waitForElementPresent(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('Before Swipe', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(150, 1000, 900, 1000, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('After Swipe', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/New Maps/maps_btnConfirmRed'), 1)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_header_title_ADDRESSCON'), 
    1, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_btnOrderNowred'), 1)
} else {
    println = 'Order Page Ready'
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/title_header_order'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/title_header_order'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Order page/btn_back_order'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

