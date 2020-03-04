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

Mobile.tap(findTestObject('pocket page/btn_nearlyexp_tab'), 2)

if (Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_recieve_month'), 2, FailureHandling.OPTIONAL) == 
false) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/icon_no_voucher_available'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('pocket page/desc_no_voucher_nearexp'), 'Your vouchers are still good to go.', 
        FailureHandling.CONTINUE_ON_FAILURE)

    println = 'No Voucher on nearly expired, check completed'
} else {
    Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_recieve_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/desc_rp_onvoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/desc_voucher_onvoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/title_valid_onvoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_onvoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/txt_activedate_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    println = 'Voucher available on nearly expired'
}

Mobile.tap(findTestObject('pocket page/btn_history_tab'), 2)

if (Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_recieve_month'), 2, FailureHandling.OPTIONAL) == 
false) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/icon_no_voucher_available'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('pocket page/desc_no_voucher_expired'), 'You haven\'t used your vouchers and no vouchers has expired.', 
        FailureHandling.CONTINUE_ON_FAILURE)

    println = 'No expired Voucher on history, check completed'
} else {
    Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_recieve_month'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/desc_rp_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/desc_voucher_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/logo_dana_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/title_valid_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/txt_expired_voucher_history'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/txt_voucher_amount'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    println = 'Expired Voucher available on history'
}

Mobile.tap(findTestObject('pocket page/btn_voucher_tab'), 2)

if (Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_recieve_month'), 2, FailureHandling.OPTIONAL) == 
false) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/icon_no_voucher_available'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('pocket page/desc_no_voucher_vouchertab'), 'Let\'s fill up this page with vouchers!', 
        FailureHandling.CONTINUE_ON_FAILURE)

    println = 'No Voucher on voucher tab, check completed'
} else {
    Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_recieve_month'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/desc_rp_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/desc_voucher_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/logo_dana_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/title_valid_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/title_voucher_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/txt_activedate_onvoucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('pocket page/txt_voucher_amount'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    println = 'New Voucher available on voucher tab'
}

