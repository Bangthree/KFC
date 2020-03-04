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

Mobile.verifyElementExist(findTestObject('Home Screen/btn_profile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_profile'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('User Profile Page Component check begin')

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_header_profile_back'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/btn_header_profile_back'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/title_header_profile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/title_header_profile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Profile Section')

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_userprofile_editprofile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/btn_profile_userprofile_editprofile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_userprofile_phonenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_userprofile_phonenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_userprofile_phonenum'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_userprofile_username'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_userprofile_username'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_userprofile_username'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/container_profile_userprofile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Dana Section')

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_dana_topup'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/btn_profile_dana_topup'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_dana_status'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_dana_status'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_dana_status'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_dana_danabalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_dana_danabalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_dana_danabalance'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_dana_phonenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_dana_phonenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_dana_phonenum'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_dana_currentbalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_dana_currentbalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_dana_currentbalance'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/container_profile_dana'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/img_profile_dana_danaimg'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/img_profile_dana_danaimg'), 2, FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.scrollToText('Log Out')

Mobile.comment('Info Section')

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_CC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_CC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_CC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/img_profile_CC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_CC_next'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_CC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_PP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_PP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_PP'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_PP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_PP_next'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/img_profile_PP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_howto'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_howto'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_howto'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_howto_next'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_howto'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/img_profile_howto'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_TC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_TC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_TC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_TC_next'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_TC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/img_profile_TC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Logout Pop Up')

Mobile.scrollToText('Log Out', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/desc_profile_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/desc_profile_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page - New/desc_profile_logout'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/btn_profile_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/btn_profile_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page - New/img_profile_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page - New/img_profile_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Profile Page - New/btn_profile_logout'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page/LOGOUT/LOGOUT - DESC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page/LOGOUT/LOGOUT - DESC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Profile Page/LOGOUT/LOGOUT - DESC'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page/LOGOUT/LOGOUT - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page/LOGOUT/LOGOUT - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page/LOGOUT/LOGOUT - CANCEL BUTTON'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page/LOGOUT/LOGOUT - CANCEL BUTTON'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Profile Page/LOGOUT/LOGOUT - OK BUTTON'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile Page/LOGOUT/LOGOUT - OK BUTTON'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Profile Page/LOGOUT/LOGOUT - CANCEL BUTTON'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile Page - New/btn_header_profile_back'), 2, FailureHandling.STOP_ON_FAILURE)

