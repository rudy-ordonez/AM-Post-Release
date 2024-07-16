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

WebUI.navigateToUrl('https://weldcsd.tipwebhss.com/tipwebit/')

WebUI.setText(findTestObject('Object Repository/Google/Weld (Google)/input_Use your Google Account_identifier'), 'tipweb_it@greeleyschools.org')

WebUI.click(findTestObject('Object Repository/Google/Weld (Google)/span_Next'))

WebUI.setText(findTestObject('Page_RapidIdentity/input_Forgot UsernamePassword_identification'), 'tipweb_it@greeleyschools.org')

WebUI.click(findTestObject('Page_RapidIdentity/button_Go'))

WebUI.setText(findTestObject('Page_RapidIdentity/input_Forgot UsernamePassword_ember564'), 'T!pw3b_!T')

WebUI.click(findTestObject('Page_RapidIdentity/button_Go'))

WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 30)

WebUI.click(findTestObject('TIPWebIT/Tags Grid/span_Tags'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TIPWebIT/Tags Grid/input_ButtonGo'), 30)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

WebUI.click(findTestObject('Page_Asset Management 13.3.2.0/span_tipweb_it Unknown'))

WebUI.click(findTestObject('Page_Asset Management 13.3.2.0/span_Log Off'))

