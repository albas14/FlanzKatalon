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

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Outgoing'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Outgoing'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Outgoing'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_Filter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/label_Processing Date'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/label_Processing Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/svg'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/svg'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_December 2024'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_December 2024'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_December 2024'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Jan'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_1'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_End_k-input-button k-button k-icon-b_7d5a2d'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_19'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_Search'))

WebUI.closeBrowser()

