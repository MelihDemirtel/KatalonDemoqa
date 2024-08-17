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

WebUI.click(findTestObject('Object Repository/Page_WebTables/span_Web Tables'))

WebUI.waitForElementVisible(findTestObject('Page_WebTables/div_WebTables'), 2)

WebUI.click(findTestObject('Object Repository/Page_WebTables/button_Add'))

WebUI.waitForElementVisible(findTestObject('Page_WebTables/div_Modal'), 2)

WebUI.setText(findTestObject('Page_WebTables/input_First_name'), firstName)

WebUI.setText(findTestObject('Page_WebTables/input_Last_name'), lastName)

WebUI.setText(findTestObject('Page_WebTables/input_Email'), email)

WebUI.setText(findTestObject('Page_WebTables/input_Age'), age)

WebUI.setText(findTestObject('Page_WebTables/input_Salary'), salary)

WebUI.setText(findTestObject('Page_WebTables/input_Department'), department)

WebUI.click(findTestObject('Object Repository/Page_WebTables/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Page_WebTables/div_Row5'), 2)

