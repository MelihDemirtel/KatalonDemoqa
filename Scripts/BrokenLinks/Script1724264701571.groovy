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

WebUI.callTestCase(findTestCase('Elements'), [('baseUrl') : 'https://demoqa.com/'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BrokenLinks/span_Broken_links'))

WebUI.waitForElementVisible(findTestObject('Page_BrokenLinks/img_Valid'), 2)

// JavaScript ile naturalWidth ve naturalHeight değerlerini al
String imgWidth1 = WebUI.executeJavaScript('return document.querySelector("img[src=\'/images/Toolsqa.jpg\']").naturalWidth', 
    null)

String imgHeight1 = WebUI.executeJavaScript('return document.querySelector("img[src=\'/images/Toolsqa.jpg\']").naturalHeight', 
    null)

// Görselin yüklenip yüklenmediğini kontrol et
if ((imgWidth1 > '0') && (imgHeight1 > '0')) {
    println('Görsel başarılı şekilde yüklenmiş.')
} else {
    println('Görsel kırık.')
}

// JavaScript ile naturalWidth ve naturalHeight değerlerini al
String imgWidth2 = WebUI.executeJavaScript('return document.querySelector("img[src=\'/images/Toolsqa_1.jpg\']").naturalWidth', null)
String imgHeight2 = WebUI.executeJavaScript('return document.querySelector("img[src=\'/images/Toolsqa_1.jpg\']").naturalHeight', null)

// Görselin yüklenip yüklenmediğini kontrol et
if (imgWidth2 == '0' && imgHeight2 == '0') {
	println("Görsel kırık.")
} else {
	println("Görsel başarılı şekilde yüklenmiş.")
}

WebUI.click(findTestObject('Page_BrokenLinks/a_Valid_link'))

actualUrl = WebUI.getUrl()

WebUI.verifyMatch(actualUrl, expectedUrl, false)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BrokenLinks/a_Broken_link'))

WebUI.waitForElementVisible(findTestObject('Page_BrokenLinks/p_Status_code_message'), 3)

WebUI.verifyElementVisible(findTestObject('Page_BrokenLinks/p_Status_code_message'))

WS.sendRequestAndVerify(findTestObject('Page_BrokenLinks/Internal Server Error'))

