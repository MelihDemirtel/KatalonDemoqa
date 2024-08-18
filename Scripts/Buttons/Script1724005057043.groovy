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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Elements'), [('baseUrl') : 'https://demoqa.com/'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Buttons/span_Buttons'))

WebUI.waitForElementPresent(findTestObject('Page_Buttons/button_Double_click'), 2)

WebUI.doubleClick(findTestObject('Object Repository/Page_Buttons/button_Double_click'))

WebUI.waitForElementPresent(findTestObject('Page_Buttons/p_Double_click_message'), 2)

WebUI.verifyElementText(findTestObject('Page_Buttons/p_Double_click_message'), doubleClickMessage)

WebUI.rightClick(findTestObject('Object Repository/Page_Buttons/button_Right_click'))

WebUI.waitForElementPresent(findTestObject('Page_Buttons/p_Right_click_message'), 2)

WebUI.verifyElementText(findTestObject('Page_Buttons/p_Right_click_message'), RightClickMessage)

clickMeDynamicId = WebUI.getAttribute(findTestObject('Page_Buttons/button_Click'), 'id')

TestObject dynamicButton = new TestObject().addProperty('id', ConditionType.EQUALS, clickMeDynamicId)

WebUI.click(dynamicButton)

WebUI.waitForElementPresent(findTestObject('Page_Buttons/p_Dynamic_click_message'), 2)

WebUI.verifyElementText(findTestObject('Page_Buttons/p_Dynamic_click_message'), ClickMeMessage)

