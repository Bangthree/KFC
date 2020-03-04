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

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Home Screen/img_kfc_bucket'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('PNP Page Check Begin')

Mobile.verifyElementExist(findTestObject('Home Screen/btn_paypick'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_paypick'), 2, FailureHandling.STOP_ON_FAILURE)

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

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Pay n Pick Scan/PAYPICKDANA - Desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Pay n Pick Scan/PAYPICKDANA - Desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Pay n Pick Scan/PAYPICK - i Button'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Pay n Pick Scan/PAYPICK - i Button'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Pay n Pick Scan/PAYPICKDANA - Desc'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Pay n Pick Scan/PAYPICKSCAN - X Button'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Pay n Pick Scan/PAYPICKSCAN - X Button'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Pay n Pick Scan/PAYPICK - Desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Pay n Pick Scan/PAYPICK - Desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Pay n Pick Scan/PAYPICK - Desc'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Pay n Pick Scan/PAYPICKSCAN - icon FLASHON'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Pay n Pick Scan/PAYPICKSCAN - icon FLASHON'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Pay n Pick Scan/PAYPICKSCAN - FlashStatusOFF'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Pay n Pick Scan/PAYPICKSCAN - FlashStatusOFF'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Pay n Pick Scan/PAYPICKSCAN - FlashStatusOFF'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Pay n Pick Scan/PAYPICKSCAN - X Button'), 1, FailureHandling.STOP_ON_FAILURE)

