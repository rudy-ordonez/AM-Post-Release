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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.delay(7)

title = WebUI.getWindowTitle()

'Checks TIPIDCore'
WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 1), true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TIPWebIT/Login/input_Username'), username)

WebUI.setText(findTestObject('TIPWebIT/Login/input_Password'), password)

WebUI.click(findTestObject('TIPWebIT/Login/input_LogOnButton'))

WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 15, FailureHandling.STOP_ON_FAILURE)

Home = WebUI.verifyElementInViewport(findTestObject('TIPWebIT/a_Home'), 20, FailureHandling.OPTIONAL)

'If successful log in, continue'
if (Home == true) {
    title = WebUI.getWindowTitle()

    'Checks app version'
    WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

    WebUI.click(findTestObject('Log Off/span_Toggle'))

    WebUI.click(findTestObject('Log Off/span_Log Off'))
} else {
    WebUI.refresh()

    WebUI.setText(findTestObject('TIPWebIT/Login/input_Username'), username)

    WebUI.setText(findTestObject('TIPWebIT/Login/input_Password'), password)

    WebUI.click(findTestObject('TIPWebIT/Login/input_LogOnButton'))

    WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 30, FailureHandling.STOP_ON_FAILURE)

    title = WebUI.getWindowTitle()

    WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

    WebUI.click(findTestObject('Log Off/span_Toggle'))

    WebUI.click(findTestObject('Log Off/span_Log Off'))
}

