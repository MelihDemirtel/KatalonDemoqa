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

WebUI.click(findTestObject('Object Repository/Page_CheckBox/span_Check Box'))

WebUI.waitForElementVisible(findTestObject('Page_CheckBox/span_Home_checkbox'), 2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CheckBox/span_Home_checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CheckBox/span_Home_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_CheckBox/span_Home_checkbox'))

WebUI.waitForElementVisible(findTestObject('Page_CheckBox/text_Result'), 2)

WebUI.verifyElementVisible(findTestObject('Page_CheckBox/text_Result'))

WebUI.click(findTestObject('Page_CheckBox/span_Home_checkbox'))

WebUI.verifyElementNotPresent(findTestObject('Page_CheckBox/text_Result'), 2)

WebUI.click(findTestObject('Page_CheckBox/button_Toggle'))

WebUI.waitForElementVisible(findTestObject('Page_CheckBox/span_Desktop'), 2)

WebUI.verifyElementVisible(findTestObject('Page_CheckBox/span_Desktop'))

WebUI.verifyElementVisible(findTestObject('Page_CheckBox/span_Documents'))

WebUI.verifyElementVisible(findTestObject('Page_CheckBox/span_Downloads'))

WebUI.click(findTestObject('Page_CheckBox/button_CollapseAll'))

WebUI.verifyElementNotPresent(findTestObject('Page_CheckBox/span_Desktop'), 2)

WebUI.verifyElementNotPresent(findTestObject('Page_CheckBox/span_Documents'), 2)

WebUI.verifyElementNotPresent(findTestObject('Page_CheckBox/span_Downloads'), 2)

WebUI.click(findTestObject('Page_CheckBox/button_ExpandAll'))

WebUI.waitForElementVisible(findTestObject('Page_CheckBox/span_Desktop'), 2)

WebUI.verifyElementVisible(findTestObject('Page_CheckBox/span_Desktop'))

WebUI.verifyElementVisible(findTestObject('Page_CheckBox/span_Documents'))

WebUI.verifyElementVisible(findTestObject('Page_CheckBox/span_Downloads'), FailureHandling.STOP_ON_FAILURE)

