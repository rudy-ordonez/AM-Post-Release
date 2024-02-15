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

WebUI.navigateToUrl('https://tipweb.aps.edu/LoginFormIdentityProvider/Login.aspx?ReturnUrl=%2fLoginFormIdentityProvider%2f%3fSP%3dHayesSoftware%26TargetURL%3dhttps%253A%252F%252Fwww.tipwebalbuquerqueps.com%252FTIPIDCore&SP=HayesSoftware&TargetURL=https%3A%2F%2Fwww.tipwebalbuquerqueps.com%2FTIPIDCore')

WebUI.setText(findTestObject('Object Repository/SSO/ABQ/input_User name_LoginUserUserName'), 'HayesAdmin')

WebUI.setText(findTestObject('Object Repository/SSO/ABQ/input_Password_LoginUserPassword'), 'dOLL5*cafe')

WebUI.click(findTestObject('Object Repository/SSO/ABQ/input__LoginUserLoginButton'))

WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 30)

WebUI.click(findTestObject('TIPWebIT/Tags Grid/span_Tags'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TIPWebIT/Tags Grid/input_ButtonGo'), 10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

WebUI.click(findTestObject('TIPWebIT/Log Off/span_Toggle'))

WebUI.click(findTestObject('TIPWebIT/Log Off/span_Log Off'))

