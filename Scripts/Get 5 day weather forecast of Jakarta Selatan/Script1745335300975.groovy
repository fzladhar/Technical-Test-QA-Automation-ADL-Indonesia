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

response = WS.sendRequest(findTestObject('Get_5Days_WeatherForecast'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'list.size()', 40)
WS.verifyElementPropertyValue(response, 'city.id', '6754916')
WS.verifyElementPropertyValue(response, 'city.name', 'Rawa Barat')
WS.verifyElementPropertyValue(response, 'city.coord.lon', 106.8061)
WS.verifyElementPropertyValue(response, 'city.coord.lat', -6.2474)
WS.verifyElementPropertyValue(response, 'city.country', 'ID')
WS.verifyElementPropertyValue(response, 'city.timezone', '25200')
