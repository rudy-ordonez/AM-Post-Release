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

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('TIPWebIT/Login/input_Username'), username)

WebUI.setText(findTestObject('TIPWebIT/Login/input_Password'), password)

WebUI.click(findTestObject('TIPWebIT/Login/input_LogOnButton'))

WebUI.delay(3)

WebUI.click(findTestObject('QC Zebra/a_Switch to site'))

WebUI.setText(findTestObject('QC Zebra/input_Site_SwitchBox'), site)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('QC Zebra/input_Site_SwitchBox'), Keys.chord(Keys.TAB, Keys.ENTER))

// WebUI.click(findTestObject('QC Zebra/li_Site'))
WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/QC Zebra/input_Tag  Serial_ctl00_RadSearchBoxInfo'), tag)

WebUI.click(findTestObject('QC Zebra/span_Tag  BeginSearch'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('QC Zebra/span_DetailTab'), 20)

WebUI.click(findTestObject('QC Zebra/a_ActionDD'))

WebUI.click(findTestObject('Object Repository/QC Zebra/li_Collect'))

WebUI.verifyElementPresent(findTestObject('QC Zebra/QC modal objects/th_Destination'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('QC Zebra/QC modal objects/input_Refresh'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('QC Zebra/QC modal objects/input_Save'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('QC Zebra/modal done/a_Done'))

WebUI.delay(4)

WebUI.click(findTestObject('QC Zebra/modal close/a_Close'))

WebUI.click(findTestObject('Log Off/span_Toggle'))

WebUI.click(findTestObject('Log Off/span_Log Off'))

