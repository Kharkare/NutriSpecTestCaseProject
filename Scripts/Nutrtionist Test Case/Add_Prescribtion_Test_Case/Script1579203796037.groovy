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

WebUI.openBrowser("http://nutrition-web.ddev.site/");
WebUI.click(findTestObject('Object Repository/Nutritionist_Home/Nutritionist_home'));

WebUI.click(findTestObject('Object Repository/Nutritionist_Home/Prescribe_Client/Add_Prescribtion'));

WebUI.setText(findTestObject('Object Repository/Nutritionist_Home/Prescribe_Client/Prescribe_title'), 'Test Title');

WebUI.setText(findTestObject('Object Repository/Nutritionist_Home/Prescribe_Client/Prescribe_report'), 'Test Report');

WebUI.click(findTestObject('Object Repository/Nutritionist_Home/Prescribe_Client/Prescribe_Button'));

def pageContent = WebUI.getText(findTestObject('Object Repository/Body_Content'));
WebUI.delay(2);
if(pageContent.contains('presciption submited')){
	WebUI.closeBrowser();
}




