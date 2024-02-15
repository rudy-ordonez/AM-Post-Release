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

WebUI.navigateToUrl('https://www.tipwebarlingtonps.us/tipwebit')

WebUI.delay(4)

WebUI.setText(findTestObject('RapidIdentity/input_Need help_identification'), 'tipwebit')

WebUI.delay(2)

WebUI.click(findTestObject('RapidIdentity/button_Go'))

WebUI.delay(4)

WebUI.setText(findTestObject('RapidIdentity/Arlington/input_Password_ember532'), 'Frid@y@2110.tipW3b_!')

WebUI.click(findTestObject('RapidIdentity/Arlington/button_Go'))

WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 30)

WebUI.click(findTestObject('TIPWebIT/Tags Grid/span_Tags'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TIPWebIT/Tags Grid/input_ButtonGo'), 10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

WebUI.click(findTestObject('RapidIdentity/span_TIPWeb IT'))

WebUI.click(findTestObject('RapidIdentity/span_Log Off'))

