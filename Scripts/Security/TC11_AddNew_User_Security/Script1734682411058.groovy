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

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/a_Security'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/a_User'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Add New'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Username'))

WebUI.setText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input__UserName'), 'QA TEST')

WebUI.setText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input__FullName'), 'TEST QA ROFES')

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Full Name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Title'))

WebUI.setText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input_Title_Title'), 'QA')

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Department'))

WebUI.setText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input__DepartmentName'), 'QA')

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Branch Code'))

WebUI.click(findTestObject('Security/user/Page_ANZ - Flanz-i/span_-- SELECT ONE --Branch Code'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_0309 - ANZ BALIKPAPAN BRANCH'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Last Update'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Is Active'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/input_Is Active_IsActive'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Group'))

WebUI.click(findTestObject('Security/user/Page_ANZ - Flanz-i/span_-- SELECT ONE --_Group'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/li_ADMINISTRATOR'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_ADMINISTRATOR_Add'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.verifyElementText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_Action_Group'), 'Action')

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_Group Name_Group'))

WebUI.verifyElementText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/td_ADMINISTRATOR'), 'ADMINISTRATOR')

WebUI.scrollToElement(findTestObject('Security/user/Page_ANZ - Flanz-i/label_Addtional Branch'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Addtional Branch'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_-- SELECT ONE --Branch'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_Indonesia Private Bank'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/i_Indonesia Private Bank_mdi mdi-plus-box-o_118bd6'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_Action_Branch'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_Branch Name'))

WebUI.verifyElementText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/td_Indonesia Private Bank'), 
    'Indonesia Private Bank')

WebUI.verifyElementVisible(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/label_Transaction Type'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_-- SELECT ONE --TransactionType'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/li_BKT'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_BKT_Add'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_Action_TransactionType'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/span_Transaction Name'))

WebUI.verifyElementText(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/td_BKT'), 'BKT')

WebUI.scrollToElement(findTestObject('Security/user/Page_ANZ - Flanz-i/input_BKT_Submit'), 5)

WebUI.verifyElementClickable(findTestObject('Security/user/Page_ANZ - Flanz-i/input_BKT_Submit'))

WebUI.click(findTestObject('Security/user/Page_ANZ - Flanz-i/input_BKT_Submit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.click(findTestObject('Object Repository/Security/user/Page_ANZ - Flanz-i/button_Ok_add_user'))

WebUI.scrollToElement(findTestObject('Security/user/Page_ANZ - Flanz-i/span_Full Name'), 5)

def tanggal = new Date().format('dd-MM-yyyy')

def waktu = new Date().format('HH-mm-ss' // Menambahkan jam, menit, dan detik
    )


WebUI.takeScreenshot(((('C:\\ALIBAS PROJECT\\SS_Katalon_Flanz\\User\\add_user_succes_' + tanggal) + '_') + waktu) + '.png')

WebUI.closeBrowser()

