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

Mobile.comment('Login USER 085643628232')

Mobile.setText(findTestObject('Login Page/FIELD_MOBILENUMBER'), '085643628232', 1)

Mobile.setText(findTestObject('Login Page/FIELD_PASS'), '111111', 0)

Mobile.tap(findTestObject('Login Page/BTN_LOGIN'), 2)

Mobile.delay(10)

Mobile.pressBack()

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('Session Time Out/Session Time Out - Title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session Time Out/Button YES'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session Time Out/Button NO'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session Time Out/STO_Desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Session Time Out/Button YES'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.delay(2)

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('Session Time Out/Session Time Out - Title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session Time Out/Button YES'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session Time Out/Button NO'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Session Time Out/STO_Desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Session Time Out/Button NO'), 2, FailureHandling.STOP_ON_FAILURE)

