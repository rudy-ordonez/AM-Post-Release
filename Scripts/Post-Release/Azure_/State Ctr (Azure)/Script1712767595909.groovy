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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://statecentercc.tipwebhss.com/tipwebit/')

WebUI.setText(findTestObject('Object Repository/Azure/State Center (Azure)/input_Sign in_loginfmt'), 'tipweb-test-user@scccd.edu')

WebUI.click(findTestObject('Object Repository/Azure/State Center (Azure)/input_Sign in_idSIButton9'))

WebUI.delay(4)

WebUI.setText(findTestObject('Azure/State Center (Azure)/input_Password'), 'Blouse_Dock_Smile_570!')

WebUI.click(findTestObject('Azure/State Center (Azure)/span_Sign in'))

WebUI.click(findTestObject('Azure/State Center (Azure)/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 30)

WebUI.click(findTestObject('TIPWebIT/Tags Grid/span_Tags'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TIPWebIT/Tags Grid/input_ButtonGo'), 10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

WebUI.click(findTestObject('Azure/State Center (Azure)/span_tipweb-test-user'))

WebUI.click(findTestObject('Azure/State Center (Azure)/span_Log Off'))

