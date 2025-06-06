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

// Langkah 1: Klik menu Security
WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/a_Security'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/a_Security'))

// Langkah 2: Klik submenu User
WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/a_User'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input_Keyword_tbKeyword'), 
    5)

// Langkah 3: Input keyword pencarian
WebUI.setText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input_Keyword_tbKeyword'), 'ALI')

WebUI.verifyElementPresent(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input_Keyword_tbKeyword'), 
    5)

WebUI.verifyElementVisible(findTestObject('Security/user/Page_ANZ - Flanz-i/div_Status Active                                                                                                                                                -- ALL --'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Security/user/Page_ANZ - Flanz-i/select_-- ALL --                                                    Yes                                                    No'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Security/user/Page_ANZ - Flanz-i/select_-- ALL --                                                    Yes                                                    No'), 
    FailureHandling.STOP_ON_FAILURE)

// Langkah 4: Klik tombol Search
WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Search'))
// Screenshot
def tanggal = new Date().format('dd-MM-yyyy')

WebUI.takeScreenshot(('D:\\2024\\SearchBerhasil_' + tanggal) + '.png')

