<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>get_token</name>
   <tag></tag>
   <elementGuidId>fbb58385-a899-4b80-9689-7d93d8724585</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{ \&quot;UserName\&quot;: \&quot;rudy_user\&quot;, \&quot;Password\&quot;: \&quot;Pas4user\&quot; }&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://sandbox.hsshelpdesk.com/api/Login/ValidateLogin</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager
import java.util.ArrayList as ArrayList
import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonOutput as JsonOutput
import groovy.transform.Field
import com.kms.katalon.core.testobject.ConditionType

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

def outputText = response.getResponseText()

println(JsonOutput.prettyPrint(outputText))

def slurper = new JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

token = String.format('Bearer %s', result.hayesToken)

RequestObject ScopeToProject = findTestObject(‘API/get_sites2’)

ArrayList HTTPHeader = new ArrayList()

HTTPHeader.add(new TestObjectProperty(‘X-Auth-Token’, ConditionType.EQUALS, token))

ScopeToProject.setHttpHeaderProperties(HTTPHeader)

response = WS.sendRequest(ScopeToProject)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
