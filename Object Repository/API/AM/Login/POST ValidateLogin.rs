<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST ValidateLogin</name>
   <tag></tag>
   <elementGuidId>2c5296ea-be34-4fe2-82ef-86a352ba2665</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;Key\&quot;: \&quot;${TIPWebAPI_Key}\&quot;,\r\n    \&quot;Phrase\&quot;: \&quot;${TIPWebAPI_Phrase}\&quot;\r\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>2652a5f1-9e7a-4537-98c0-b09f07178aff</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${TIPWebAPI_Url}api/Login/ValidateLogin</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.TIPWebAPI_Url</defaultValue>
      <description></description>
      <id>41318b60-915f-4a54-bc70-ce5d67da26b6</id>
      <masked>false</masked>
      <name>TIPWebAPI_Url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.TIPWebAPI_Key</defaultValue>
      <description></description>
      <id>1ac923f1-a16b-49f2-a698-c05d87974c8d</id>
      <masked>false</masked>
      <name>TIPWebAPI_Key</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.TIPWebAPI_Phrase</defaultValue>
      <description></description>
      <id>2e721fd6-dabd-4f06-a6ab-f68654609c55</id>
      <masked>false</masked>
      <name>TIPWebAPI_Phrase</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
