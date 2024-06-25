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

WebUI.navigateToUrl('https://adfs.hboe.org/adfs/ls/IdpInitiatedSignOn.aspx?SAMLRequest=lZJRb4IwFIX%2fCuk7FBEkNELi9GFNXCSCe9jLUmiVJtCy3rL584eoiXsx2eO5ufecnC93Caxre7IabKP24msQYB26SdEnj4NkUflHd%2bEfAzcMoshN4sh34ySpo2oezedRhZx3YUBqlaLA85FDAQZBFVim7Djyg8D1Q3eWlLOQRDEJkw%2fk5EZbXev2RSou1SlFg1FEM5BAFOsEEFuTYvW2JaMjqa5LQF7LMnfzXVEiZwUgjB1D11rB0AlTCPMta3HYb1PUWNsDwbiRbSuZ4TVwz8r%2bR1QNgFfrDpc0p5u1NgIXxQ5fku4%2bHoP%2bjJzNiEAqZqdadz%2fGj%2bA1lRaeNqdJ4RYw5T1V0kpmBS%2fkSe3UzePctQrIhPZ5wf5GA2XLyzaZCJqH%2b%2bfn7M4CZf9pvsQPYdlV%2ff2B7Bc%3d')

WebUI.setText(findTestObject('Object Repository/ADFS/Hilliard/Page_Sign In/input_Login with your Hilliard City Schools_6f9ed1'), 
    'svc_TIPWEB')

WebUI.setText(findTestObject('Object Repository/ADFS/Hilliard/Page_Sign In/input_Login with your Hilliard City Schools_9db9c5'), 
    '@FcradRg6Dv#M^8R6L23')

WebUI.click(findTestObject('Object Repository/ADFS/Hilliard/Page_Sign In/span_Sign in'))

WebUI.waitForElementClickable(findTestObject('TIPWebIT/Login/span_Home'), 30)

WebUI.click(findTestObject('Object Repository/ADFS/Hilliard/Page_Asset Management 12.1.2.0/span_Tags'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TIPWebIT/Tags Grid/input_ButtonGo'), 10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, findTestData('IT Version').getValue(1, 2), true)

WebUI.click(findTestObject('Object Repository/ADFS/Hilliard/Page_Asset Management 12.1.2.0/span_tipweb it'))

WebUI.click(findTestObject('Object Repository/ADFS/Hilliard/Page_Asset Management 12.1.2.0/span_Log Off'))

