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
import org.openqa.selenium.Dimension as Dimension

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev2.profescipta.co.id/Security/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_UserName'), 'abasri')

WebUI.verifyElementPresent(findTestObject('Login/Page_ANZ - Flanz-i/input_Sign In_UserName'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_Password'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_Submit'))

WebUI.click(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_Submit'))

// Tunggu hingga halaman login berhasil dimuat
WebUI.verifyElementPresent(findTestObject('Dashboard/Page_ANZ - Flanz-i/div_DASHBOARD                                             OutgoingIncomingAnzo'), 
    10)

def tanggal = new Date().format('dd-MM-yyyy')

WebUI.takeScreenshot(('D:\\2024\\LoginBerhasil_' + tanggal) + '.png')

