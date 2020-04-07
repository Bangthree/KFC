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

Mobile.callTestCase(findTestCase('Additional Cases/Device Info'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.kfc.mobile.hkStaging')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_current_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/addrs_current_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/addrs_current_addrstitle'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/btn_add_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/btn_add_menu_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Order page/btn_add_menu_1'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order page/a. after select/btn_next_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order page/a. after select/btn_next_orderpage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Order page/a. after select/btn_next_orderpage'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Review Order Reached')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_header_btnBack_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_header_btnBack_img'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_header_title_revieworder'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_header_title_revieworder'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_header_title_revieworder'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Check Info Section')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_info_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_info_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_info_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_info_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_info_desc'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_info_imgCup'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_info_imgCup'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Review Order Page/revord_info_btnX'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Review Order Page/revord_info_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Review Order Page/revord_info_imgCup'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Order Details Section')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_orddet_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_menu_1_name'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_menu_1_name'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_orddet_menu_1_name'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_menu_1_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_menu_1_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_orddet_menu_1_price'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_menu_1_amount'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_menu_1_amount'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_orddet_menu_1_amount'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_menu_1_btnAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_menu_1_btnAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_menu_1_btnLess'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_menu_1_btnLess'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_desc_custom'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_desc_custom'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_orddet_imgCustom'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_orddet_imgCustom'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Address Details Section')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_desc_address'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_desc_address'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_desc_address'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_btnEditNotes'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_field_addnotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_field_addnotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_field_addnotes'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_btnChangeAdd'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_imgLocation'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_adddet_imgLocation'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Payment Method Section')

Mobile.scrollToText('Order Now!')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paymet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paymet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paymet_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paymet_radio_dana'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paymet_radio_dana'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paymet_imgDana'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paymet_imgDana'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paymet_desc_DanaID'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paymet_desc_DanaID'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paymet_desc_DanaID'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paymet_desc_paywith'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paymet_desc_paywith'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paymet_desc_paywith'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paymet_radio_cash'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paymet_radio_cash'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paymet_desc_Cash'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paymet_desc_Cash'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Payment Method Section')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_taxbaseamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_taxbaseamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_taxbaseamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_taxbaseamt_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_taxbaseamt_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_taxbaseamt_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_delivfee'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_delivfee'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_delivfee'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_delivfee_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_delivfee_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_delivfee_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_restax'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_restax'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_restax'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_restax_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_restax_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_restax_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_delivtax'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_delivtax'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_delivtax'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_delivtax_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_delivtax_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_delivtax_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_rounding'), 1, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.OPTIONAL)

    Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_rounding'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_rounding'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_rounding'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_rounding_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_rounding_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_rounding_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)
} else {
    println = 'No ROUNDING'
}

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_title_voucherwithimage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_title_voucherwithimage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_paydet_desc_voucherwithimage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_paydet_desc_voucherwithimage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_paydet_desc_voucherwithimage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Total & Order Now Section')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_total'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_total'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_total'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_total_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_total_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_total_amt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_btnOrderNowRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_btnOrderNowRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_btnOrderNowRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_desc_OrderNow'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/revord_desc_OrderNow'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_desc_OrderNow'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Review Order Page Completed')

