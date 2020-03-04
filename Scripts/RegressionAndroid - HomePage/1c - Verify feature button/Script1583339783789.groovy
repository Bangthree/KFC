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

WebUI.comment('Check Delivery Order Button on Home')

Mobile.verifyElementExist(findTestObject('Home Screen/icon_deliveryorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/icon_deliveryorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/txt_deliveryorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/txt_deliveryorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Screen/txt_deliveryorder'), 'DELIVERY \nORDER', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/btn_deliveryorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/btn_deliveryorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_deliveryorder'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Delivery Order Redirection')

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Selection/addrs_search_btnMap'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Selection/addrs_search_searchbar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

WebUI.delay(2)

WebUI.comment('Check Pay & Pick Button on Home')

Mobile.verifyElementExist(findTestObject('Home Screen/btn_paypick'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/btn_paypick'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/icon_paypick'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/icon_paypick'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/txt_paypick'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/txt_paypick'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Screen/txt_paypick'), 'PAY ’N PICK', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_paypick'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Pay & Pick Redirection')

if (Mobile.verifyElementExist(findTestObject('Camera Permission/desc_allowcam'), 2, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Camera Permission/btn_allowcam_allow'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Camera Permission/btn_allowcam_deny'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Camera Permission/desc_allowcam'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Camera Permission/img_allowcam_camicon'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Camera Permission/btn_allowcam_allow'), 2, FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Camera permission not appear, permission already granted'
}

Mobile.verifyElementExist(findTestObject('Pay n Pick Scan/PAYPICKDANA - Desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Pay n Pick Scan/PAYPICKDANA - Desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

