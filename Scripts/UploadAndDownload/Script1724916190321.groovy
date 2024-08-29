import java.nio.file.Files
import java.nio.file.Paths
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

Map<String, Object> chromePrefs = new HashMap<String, Object>()

chromePrefs.put('download.default_directory', 'C:\\Users\\melih\\Downloads')

chromePrefs.put('download.prompt_for_download', false)

Map<String, Object> chromeOptions = new HashMap<String, Object>()

chromeOptions.put('prefs', chromePrefs)

WebUI.callTestCase(findTestCase('Elements'), [('baseUrl') : 'https://demoqa.com/'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_UploadAndDownload/span_Upload_and_download'))

WebUI.waitForElementVisible(findTestObject('Page_UploadAndDownload/a_Download_button'), 2)

WebUI.click(findTestObject('Page_UploadAndDownload/a_Download_button'))

WebUI.delay(2)

String downloadFilePath = 'C:\\Users\\melih\\Downloads\\sampleFile.jpeg'

// Dosyanın var olup olmadığını kontrol et
boolean isFileDownloaded = Files.exists(Paths.get(downloadFilePath))

// İndirme doğrulama işlemi
WebUI.verifyEqual(isFileDownloaded, true)

WebUI.uploadFile(findTestObject('Page_UploadAndDownload/input_Upload_file'), 'C:\\Users\\melih\\Downloads\\demoqaExample.txt')

WebUI.waitForElementVisible(findTestObject('Page_UploadAndDownload/p_Uploaded_file_path'), 2)

WebUI.verifyElementVisible(findTestObject('Page_UploadAndDownload/p_Uploaded_file_path'))

