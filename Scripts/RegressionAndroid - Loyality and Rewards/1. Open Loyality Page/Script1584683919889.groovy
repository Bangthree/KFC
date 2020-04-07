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

Mobile.comment('Earn Page Components check started')

if (Mobile.verifyElementExist(findTestObject('Session Time Out/Session Time Out - Title'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.callTestCase(findTestCase('Additional Cases/Session Time Out Reset'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Session is new'
}

if (Mobile.verifyElementExist(findTestObject('Login Page/DESC_WELCOME'), 2, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.callTestCase(findTestCase('Additional Cases/Login Dana - User 1919'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in, Homepage ready'
}

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_userprofile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen - New/btn_userprofile'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.comment('Points Section')

Mobile.verifyElementExist(findTestObject('Profile Page - New/img_profile_mybalance_kfc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/img_profile_mybalance_kfc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_mybalance_mybalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_mybalance_mybalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_mybalance_balanceamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_mybalance_balanceamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_mybalance_balanceamt'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_mybalance_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/btn_mybalance_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_mybalance_redeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/btn_mybalance_redeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_acquired_profile_today'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_acquired_profile_today'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_acquired_profile_today'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_acquired_profile_todayamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_acquired_profile_todayamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_acquired_profile_todayamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_acquired_profile_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_acquired_profile_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_acquired_profile_month'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_acquired_profile_monthamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_acquired_profile_monthamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_acquired_profile_monthamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/progressbar_acquired_profile_today'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/progressbar_acquired_profile_today'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/progressbar_acquired_profile_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/progressbar_acquired_profile_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_expiry_profile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_expiry_profile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_expiry_profile_amtanddate'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_expiry_profile_amtanddate'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_expiry_profile_amtanddate'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/container_profile_mybalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.comment('Points section done checking')

