<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GetNotifications</name>
   <tag></tag>
   <elementGuidId>2c214a5f-8b9b-4862-a697-9fa7b76f7df8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\u003c?xml version\u003d\&quot;1.0\&quot; encoding\u003d\&quot;utf-8\&quot;?\u003e\r\n\u003csoap:Envelope xmlns:xsi\u003d\&quot;http://www.w3.org/2001/XMLSchema-instance\&quot; xmlns:xsd\u003d\&quot;http://www.w3.org/2001/XMLSchema\&quot; xmlns:soap\u003d\&quot;http://schemas.xmlsoap.org/soap/envelope/\&quot;\u003e\r\n  \u003csoap:Body\u003e\r\n    \u003cGetNotifications xmlns\u003d\&quot;http://hayessoft.com/webservices\&quot;\u003e\r\n      \u003capplication\u003e2\u003c/application\u003e\r\n      \u003cuserView\u003e1\u003c/userView\u003e\r\n      \u003cuserRole\u003e1\u003c/userRole\u003e\r\n      \u003chosted\u003e1\u003c/hosted\u003e\r\n    \u003c/GetNotifications\u003e\r\n  \u003c/soap:Body\u003e\r\n\u003c/soap:Envelope\u003e&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml</value>
      <webElementGuid>d1f805da-acc4-469f-8a71-83fcd43a0153</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>SOAPAction</name>
      <type>Main</type>
      <value>&quot;#MethodName&quot;</value>
      <webElementGuid>9e88c804-f01d-40ea-81ce-32cf742e0b5f</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://www.tipwebhelp.com/TIPWebNotifications/WebService.asmx</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
