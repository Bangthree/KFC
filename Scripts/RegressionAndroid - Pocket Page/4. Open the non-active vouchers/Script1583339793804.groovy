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

Mobile.tap(findTestObject('pocket page/btn_history_tab'), 2)

Mobile.tap(findTestObject('pocket page/voucher'), 2)

WebUI.delay(2)

Mobile.verifyElementExist(findTestObject('pocket page/voucher detail/title_voucherdetail_header'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/voucher detail/title_voucherdetail_header'), 1)

Mobile.getText(findTestObject('pocket page/voucher detail/title_voucherdetail_header'), 1)

Mobile.verifyElementExist(findTestObject('pocket page/voucher detail/desc_amount_onvoucher'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/voucher detail/desc_amount_onvoucher'), 1)

Mobile.getText(findTestObject('pocket page/voucher detail/desc_amount_onvoucher'), 1)

Mobile.verifyElementExist(findTestObject('pocket page/voucher detail/desc_onvoucher'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/voucher detail/desc_onvoucher'), 1)

Mobile.getText(findTestObject('pocket page/voucher detail/desc_onvoucher'), 1)

Mobile.verifyElementExist(findTestObject('pocket page/voucher detail/title_onvoucher_detail'), 1)

Mobile.verifyElementVisible(findTestObject('pocket page/txt_expired_voucher_history'), 1)

Mobile.pressBack()

