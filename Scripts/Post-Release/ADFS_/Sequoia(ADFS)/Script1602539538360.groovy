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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tipwebsequoiauhsd.org/tipwebit')

WebUI.setText(findTestObject('ADFS/Sequoia/input_User name_ctl00ContentPlaceHolder1Use_e9cb29'), 'TIPWEBITtest')

WebUI.setText(findTestObject('ADFS/Sequoia/input_Password_ctl00ContentPlaceHolder1Pass_01043e'), '#0suhsdtipwebit3670')

WebUI.click(findTestObject('ADFS/Sequoia/input_Password_ctl00ContentPlaceHolder1Subm_64e0e6'))

WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 30)

WebUI.click(findTestObject('TIPWebIT/Tags Grid/span_Tags'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TIPWebIT/Tags Grid/input_ButtonGo'), 10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

WebUI.click(findTestObject('Log Off/span_Toggle'))

WebUI.click(findTestObject('Log Off/span_Log Off'))

