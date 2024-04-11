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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import groovy.json.JsonSlurper as JsonSlurper
import groovy.json.JsonOutput as JsonOutput
import groovy.transform.Field as Field
import com.kms.katalon.core.testobject.ConditionType as ConditionType

response = WS.sendRequestAndVerify(findTestObject('API/POST Login', [('HHD_API_Url') : GlobalVariable.HHD_API_Url, ('HHD_API_User') : GlobalVariable.HHD_API_User
            , ('HHD_API_Password') : GlobalVariable.HHD_API_Password]))

def outputText = response.getResponseText()

println(JsonOutput.prettyPrint(outputText))

def slurper = new JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

GlobalVariable.HHD_API_Bearer = String.format('Bearer %s', result.hayesToken)

sites = WS.sendRequestAndVerify(findTestObject('API/GET GetSites', [('HHD_API_Url') : GlobalVariable.HHD_API_Url, ('HHD_API_Bearer') : GlobalVariable.HHD_API_Bearer]))

def sites2 = sites.getResponseText()

println(JsonOutput.prettyPrint(sites2))

//Write all sites to a text file
f = new File('C://Temp/sites.txt')

f.append(JsonOutput.prettyPrint(sites2))

tags = WS.sendRequestAndVerify(findTestObject('API/GET GetTag', [('HHD_API_Url') : GlobalVariable.HHD_API_Url, ('HHD_API_Bearer') : GlobalVariable.HHD_API_Bearer
            , ('HHD_API_Tag') : GlobalVariable.HHD_API_Tag]))

def tags2 = tags.getResponseText()

println(JsonOutput.prettyPrint(tags2))

//Write all tags to a text file
g = new File('C://Temp/tags.txt')

g.append(JsonOutput.prettyPrint(tags2))

