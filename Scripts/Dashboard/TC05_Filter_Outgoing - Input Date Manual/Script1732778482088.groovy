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

WebUI.callTestCase(findTestCase('Login/TC01_Login_Succes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Outgoing'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Outgoing'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Outgoing'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_Filter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/input_Start_dpDateFromOutgoing'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/input_Start_dpDateFromOutgoing'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/input_Start_dpDateFromOutgoing'), '10/01/2009')

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/input_End_dpDateToOutgoing'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/input_End_dpDateToOutgoing'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/input_End_dpDateToOutgoing'), '19/12/2024')

WebUI.verifyElementClickable(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_Search'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/button_Search'))

