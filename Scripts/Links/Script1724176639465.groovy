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

WebUI.click(findTestObject('Object Repository/Page_Links/span_Links'))

WebUI.click(findTestObject('Object Repository/Page_Links/a_Home'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Page_Links/div_Elements'), 2)

homeUrl = WebUI.getUrl()

WebUI.verifyMatch(homeUrl, expectedHomeUrl, false)

WebUI.closeWindowUrl(homeUrl)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Page_Links/a_HomenckAH'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('Page_Links/div_Elements'), 2)

dynamicHomeUrl = WebUI.getUrl()

WebUI.verifyMatch(dynamicHomeUrl, expectedDynamicHomeUrl, false)

WebUI.closeWindowUrl(dynamicHomeUrl)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Page_Links/a_Created'))

WebUI.waitForElementVisible(findTestObject('Page_Links/p_Link_response'), 2)

WebUI.verifyElementText(findTestObject('Page_Links/b_Created'), created)

WS.sendRequestAndVerify(findTestObject('Page_Links/Created'))

WebUI.click(findTestObject('Page_Links/a_No_content'))

WebUI.waitForElementVisible(findTestObject('Page_Links/p_Link_response'), 2)

WebUI.verifyElementText(findTestObject('Page_Links/b_No_content'), noContent)

WS.sendRequestAndVerify(findTestObject('Page_Links/No Content'))

WebUI.click(findTestObject('Page_Links/a_Moved'))

WebUI.waitForElementVisible(findTestObject('Page_Links/p_Link_response'), 2)

WebUI.verifyElementText(findTestObject('Page_Links/b_Moved_permanently'), movedPermanently)

WS.sendRequestAndVerify(findTestObject('Page_Links/Moved'))

WebUI.click(findTestObject('Page_Links/a_Bad_request'))

WebUI.waitForElementVisible(findTestObject('Page_Links/p_Link_response'), 2)

WebUI.verifyElementText(findTestObject('Page_Links/b_Bad_request'), badRequest)

WS.sendRequestAndVerify(findTestObject('Page_Links/Bad Request'))

WebUI.click(findTestObject('Page_Links/a_Unauthorized'))

WebUI.waitForElementVisible(findTestObject('Page_Links/p_Link_response'), 2)

WebUI.verifyElementText(findTestObject('Page_Links/b_Unauthorized'), unauthorized)

WS.sendRequestAndVerify(findTestObject('Page_Links/Unauthorized'))

WebUI.click(findTestObject('Page_Links/a_Forbidden'))

WebUI.waitForElementVisible(findTestObject('Page_Links/p_Link_response'), 2)

WebUI.verifyElementText(findTestObject('Page_Links/b_Forbidden'), forbidden)

WS.sendRequestAndVerify(findTestObject('Page_Links/Forbidden'))

WebUI.click(findTestObject('Page_Links/a_Not_found'))

WebUI.waitForElementVisible(findTestObject('Page_Links/p_Link_response'), 2)

WebUI.verifyElementText(findTestObject('Page_Links/a_Not_found'), notFound)

WS.sendRequestAndVerify(findTestObject('Page_Links/Not Found'))

