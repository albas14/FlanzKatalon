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

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/span_Anzo'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/span_Anzo'), 
    15)

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/h3_CBFT'), 'CBFT')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/h3_RTGS'), 'RTGS')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/h3_SKN  ACH'), 
    'SKN / ACH')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/h3_BKT'), 'BKT')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/h3_Exceed Cut of Time'), 
    'EXCEED CUT OF TIME')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/h3_Percentage Process Transaction_1'), 
    'PERCENTAGE PROCESS TRANSACTION')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/Page_ANZ - Flanz-i/h3_Etax'), 'ETAX')

WebUI.closeBrowser()

