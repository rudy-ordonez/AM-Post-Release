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

WebUI.setText(findTestObject('ADFS/input_Sign in with your organizational acco_d4c899'), username)

WebUI.setText(findTestObject('ADFS/input_Sign in with your organizational acco_04b8f7'), password)

WebUI.click(findTestObject('ADFS/span_Sign in'))

WebUI.delay(10)

// WebUI.click(findTestObject('TIPWebIT/train1/span_'))
// WebUI.click(findTestObject('TIPWebIT/Add Notifications/input_Panel Display_dropdown'))
// WebUI.click(findTestObject('TIPWebIT/Add Notifications/li_Notifications'))
// WebUI.click(findTestObject('TIPWebIT/Add Notifications/input_Save'))
// WebUI.delay(5)
WebUI.verifyTextPresent('Successful Ticket Creations', true)

WebUI.click(findTestObject('Log Off/span_Toggle'))

WebUI.click(findTestObject('Log Off/span_Log Off'))

