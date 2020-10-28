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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ecqa.petco.com.mx/petco/en/login')

WebUI.setText(findTestObject('Object Repository/busqueda/Page_Ingresar  Petco Mexico/input_Direccin de Correo Electrnico_j_username'), 
    'javierdumont@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/busqueda/Page_Ingresar  Petco Mexico/input_Contrasea_j_password'), 
    'NlV8iAafsyYWagnpn4cCvQ==')

WebUI.click(findTestObject('Object Repository/busqueda/Page_Ingresar  Petco Mexico/button_Iniciar Sesin'))

WebUI.setText(findTestObject('Object Repository/busqueda/Page_Petco Mexico  Petco Mxico/input_Royal Canin Maxi Dermacomfort 15.88 kg_text'), 
    'royal-canin')

WebUI.click(findTestObject('Object Repository/busqueda/Page_Petco Mexico  Petco Mxico/span_Royal Canin Maxi Dermacomfort 15.88 kg_1c92bc'))

WebUI.click(findTestObject('Object Repository/busqueda/Page_Search royal-canin  Petco Mexico/img_Califica este producto_lazy-grid img-re_ad3551'))

WebUI.click(findTestObject('Object Repository/busqueda/Page_Royal Canin Maxi Dermacomfort 15.88 kg_7e864a/button_Agregar a carrito'))

WebUI.click(findTestObject('Object Repository/busqueda/Page_Mi Carrito  Petco Mexico/img'))

WebUI.closeBrowser()

