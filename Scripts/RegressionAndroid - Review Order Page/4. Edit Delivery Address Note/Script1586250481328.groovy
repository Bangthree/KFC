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

Mobile.comment('Address Details Section')

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_desc_address'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_desc_address'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/revord_adddet_field_addnotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_field_addnotes'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Review Order Page/revord_adddet_btnEditNotes'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Add Notes/revord_addnotes_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Add Notes/revord_addnotes_header_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_header_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.STOP_ON_FAILURE)

'Before\n'
Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), ' I Love You KFC', 1)

'After\n'
Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.STOP_ON_FAILURE)

'After\n'
Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Cancel add notes')

Mobile.tap(findTestObject('Review Order Page/Add Notes/revord_addnotes_btnCancel'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_field_addnotes'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Review Order Page/revord_adddet_btnEditNotes'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Add Notes/revord_addnotes_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Add Notes/revord_addnotes_header_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_header_title'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.STOP_ON_FAILURE)

'Before\n'
Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 'I Love You KFC', 1)

'After\n'
Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_field_text'), 1, FailureHandling.STOP_ON_FAILURE)

'After\n'
Mobile.getText(findTestObject('Review Order Page/Add Notes/revord_addnotes_charamt'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Save Notes')

Mobile.tap(findTestObject('Review Order Page/Add Notes/revord_addnotes_btnContinue'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Review Order Page/revord_adddet_field_addnotes'), 1, FailureHandling.STOP_ON_FAILURE)

