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
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.KeyEventFlag as KeyEventFlag
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Login Page/BTN_LOGIN'), 3)

Mobile.comment('Login USER 0818918919')

Mobile.setText(findTestObject('Login Page/FIELD_MOBILENUMBER'), '08118918919', 1)

Mobile.setText(findTestObject('Login Page/FIELD_PASS'), '111111', 0)

Mobile.tap(findTestObject('Login Page/BTN_LOGIN'), 2)

Mobile.comment('Redirect to DANA LOGIN PAGE')

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Login to DANA/android.widget.TextView0 - Login to DANA'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('DANA PIN INPUT')

Mobile.tap(findTestObject('PIN DANA Trial/1st PIN'), 1)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1).withFlag(KeyEventFlag.SOFT_KEYBOARD).withFlag(KeyEventFlag.KEEP_TOUCH_MODE).withFlag(
        KeyEventFlag.EDITOR_ACTION))

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

