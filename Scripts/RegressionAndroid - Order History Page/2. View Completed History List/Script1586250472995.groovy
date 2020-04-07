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

Mobile.comment('Check History Button Existence')

Mobile.verifyElementExist(findTestObject('Home Screen/btn_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/btn_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_history'), 2)

Mobile.comment('Check History Button Redirection')

Mobile.verifyElementExist(findTestObject('Order History/ORDER HISTORY - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order History/ORDER HISTORY - TITLE'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Order History/ORDER HISTORY - Completed (notseleted)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Order History/ORDER HISTORY - Completed (notseleted)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Order History/ORDER HISTORY - Completed (notseleted)'), 2)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_1st_icon'), 1, FailureHandling.OPTIONAL) == 
false) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Order History/NO ORDER - No Order Yet (Text)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/NO ORDER - No Order Yet (Text)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Order History/NO ORDER - No Order Yet (Text)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Order History/NO ORDER - Please place an order. (Text)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/NO ORDER - Please place an order. (Text)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Order History/NO ORDER - Please place an order. (Text)'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Order History/NO ORDER - ICON'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/NO ORDER - ICON'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
} else {
    Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_1st_icon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_1st_icon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_1st_OrderType_Status'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_1st_OrderType_Status'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Order History/Completed Order List/complord_1st_OrderType_Status'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_1st_OrderType_Title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_1st_OrderType_Title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Order History/Completed Order List/complord_1st_OrderType_Title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_1st_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_1st_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Order History/Completed Order List/complord_1st_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_1st_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_1st_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Order History/Completed Order List/complord_1st_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)

    if (Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_2nd_icon'), 1, FailureHandling.OPTIONAL) == 
    true) {
        Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_2nd_icon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_2nd_icon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_2nd_OrderType_Status'), 2, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_2nd_OrderType_Status'), 
            2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_2nd_OrderType_Status'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_2nd_OrderType_Title'), 2, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_2nd_OrderType_Title'), 2, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_2nd_OrderType_Title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_2nd_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_2nd_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_2nd_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_2nd_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_2nd_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_2nd_btnDetail'), 2, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_3rd_icon'), 1, FailureHandling.OPTIONAL) == 
    true) {
        Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_3rd_icon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_3rd_icon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_3rd_OrderType_Status'), 2, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_3rd_OrderType_Status'), 
            2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_3rd_OrderType_Status'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_3rd_OrderType_Title'), 2, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_3rd_OrderType_Title'), 2, 
            FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_3rd_OrderType_Title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_3rd_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_3rd_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_3rd_Time'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementExist(findTestObject('Order History/Completed Order List/complord_3rd_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Order History/Completed Order List/complord_3rd_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.getText(findTestObject('Order History/Completed Order List/complord_3rd_btnDetail'), 2, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println = 'Order History page Done'
    }
}

Mobile.takeScreenshot()

Mobile.pressBack()

