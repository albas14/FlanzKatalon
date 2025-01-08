import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Buka browser dan maksimalkan window
WebUI.openBrowser('')

WebUI.maximizeWindow()

// Akses halaman login
WebUI.navigateToUrl('https://dev2.profescipta.co.id/Security/Login?ReturnUrl=%2F')

// Isi form login dengan data yang salah
WebUI.setText(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_UserName'), 'salahuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

// Klik tombol submit
WebUI.click(findTestObject('Object Repository/Login/Page_ANZ - Flanz-i/input_Sign In_Submit'))

// Verifikasi bahwa elemen alert muncul dan tampilkan pesan sesuai
WebUI.verifyElementVisible(findTestObject('Login/Page_ANZ - Flanz-i/icon X'))

WebUI.verifyElementText(findTestObject('Login/Page_ANZ - Flanz-i/h2_Alert'), 'Alert')

WebUI.verifyElementText(findTestObject('Login/Page_ANZ - Flanz-i/div_Unauthorized'), 'Unauthorized')

// untuk SS
def tanggal = new Date().format('dd-MM-yyyy')

WebUI.takeScreenshot(('D:\\2024\\LoginGagal_' + tanggal) + '.png')

// Klik tombol OK untuk menutup alert
WebUI.click(findTestObject('Login/Page_ANZ - Flanz-i/button_Ok'))

WebUI.click(findTestObject('Login/Page_ANZ - Flanz-i/button_Ok'))

// Tutup browser setelah pengujian
WebUI.closeBrowser()

