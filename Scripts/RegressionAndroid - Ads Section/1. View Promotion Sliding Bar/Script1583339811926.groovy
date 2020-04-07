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

WebUI.callTestCase(findTestCase('Additional Cases/Device Info'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Login Page/DESC_WELCOME'), 2, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.callTestCase(findTestCase('Additional Cases/Login Dana - User 1919'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in, Homepage ready'
}

Mobile.swipe(500, 1500, 500, 1200)

for (int i = 0; i <= 6; i++) {
    Mobile.delay(2)

    Mobile.verifyElementExist(findTestObject('Home Screen/img_banner_promo_1'), 1)

    Mobile.verifyElementVisible(findTestObject('Home Screen/img_banner_promo_1'), 1)

    Mobile.verifyElementAttributeValue(findTestObject('Home Screen/img_banner_promo_1'), 'clickable', 'true', 0)

    Mobile.verifyElementAttributeValue(findTestObject('Home Screen/img_banner_promo_1'), 'enabled', 'true', 0)

    Mobile.swipe(900, 1500, 100, 1500)

    System.out.println('Banner (Swipe Right) Checked')
}

for (int i = 0; i <= 6; i++) {
    WebUI.delay(2)

    Mobile.verifyElementExist(findTestObject('Home Screen/img_banner_promo_1'), 1)

    Mobile.verifyElementVisible(findTestObject('Home Screen/img_banner_promo_1'), 1)

    Mobile.verifyElementAttributeValue(findTestObject('Home Screen/img_banner_promo_1'), 'clickable', 'true', 0)

    Mobile.verifyElementAttributeValue(findTestObject('Home Screen/img_banner_promo_1'), 'enabled', 'true', 0)

    Mobile.swipe(100, 1500, 900, 1500)

    System.out.println('Banner (Swipe Left) Checked')
}

