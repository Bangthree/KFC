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

Mobile.comment('Must have favorite address available')

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_deliveryorder'), 1)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Selection/addrs_favadd_title'), 2, FailureHandling.STOP_ON_FAILURE) == 
false) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.pressBack()

    Mobile.callTestCase(findTestCase('RegressionAndroid - Favorite Address (Need Edit)/Assist Test/Add a Favorite Address'), [:], 
        FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Favorite Address already Available'
}

Mobile.tap(findTestObject('Delivery Address/New Address Selection/addrs_favadd1_favicon'), 1)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Remove Popup/title_removeadd_popup'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Remove Popup/title_removeadd_popup'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Favorite Address/Remove Popup/title_removeadd_popup'), 'Remove Favorite?', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Remove Popup/desc_removeadd_popup'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Remove Popup/desc_removeadd_popup'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Favorite Address/Remove Popup/desc_removeadd_popup'), 'Do you want to remove this favorite address?', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Remove Popup/btn_cancel_removeadd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Remove Popup/btn_cancel_removeadd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Favorite Address/Remove Popup/btn_cancel_removeadd'), 'CANCEL', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Remove Popup/btn_yes_removeadd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Remove Popup/btn_yes_removeadd'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Favorite Address/Remove Popup/btn_yes_removeadd'), 'YES', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Favorite Address/Remove Popup/btn_cancel_removeadd'), 1)

Mobile.verifyElementVisible(findTestObject('Delivery Address/New Address Selection/addrs_favadd1_addrsdesc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address/New Address Selection/addrs_favadd1_addrsdesc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address/New Address Selection/addrs_favadd1_addrsdesc'), 1)

Mobile.tap(findTestObject('Delivery Address/New Address Selection/addrs_favadd1_favicon'), 1)

Mobile.tap(findTestObject('Favorite Address/Remove Popup/btn_yes_removeadd'), 1)

Mobile.takeScreenshot('Address Removed', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Delivery Address/New Address Selection/addrs_favadd1_addrsdesc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.checkElement(findTestObject(null), 0)

