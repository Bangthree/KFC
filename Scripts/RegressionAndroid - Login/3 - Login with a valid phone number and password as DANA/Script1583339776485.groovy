import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.android.nativekey.KeyEventFlag as KeyEventFlag
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.comment('Login USER 085643628232')

Mobile.clearText(findTestObject('Login Page/FIELD_MOBILENUMBER'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Login Page/FIELD_PASS'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Login Page/FIELD_MOBILENUMBER'), '085643628232', 1)

Mobile.setText(findTestObject('Login Page/FIELD_PASS'), '111111', 0)

Mobile.tap(findTestObject('Login Page/BTN_LOGIN'), 2)

Mobile.delay(12, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Redirect to DANA LOGIN PAGE')

Mobile.waitForElementPresent(findTestObject('PIN DANA Trial/1st PIN'), 15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('PIN DANA Trial/1st PIN'), 2)

Mobile.comment('DANA PIN INPUT')

Mobile.delay(3)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

Mobile.comment('Wait and Check Homepage redirection')

Mobile.delay(15)

Mobile.waitForElementPresent(findTestObject('Home Screen/btn_kfcpoint'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Home Screen - New/btn_PNP_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/btn_kfcpoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_delivery_new'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_PNP_new'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Additional Cases/Log Out'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Login Page/DESC_PLSLOGIN'), 1, FailureHandling.CONTINUE_ON_FAILURE)

