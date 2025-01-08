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

WebUI.click(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Incoming'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/span_Incoming'), 20)

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/h3_OUR'), 'OUR')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/h3_VA'), 'VA')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/h3_MT 942'), 'MT 942')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/h3_MT 950'), 'MT 950')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/h3_Incoming Transaction List'), 'INCOMING TRANSACTION LIST')

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/Page_ANZ - Flanz-i/h3_Percentage Process Transaction'), 
    'PERCENTAGE PROCESS TRANSACTION')

WebUI.closeBrowser()

