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

randomNumber = CustomKeywords.'customKeyword.randomizer.generateRandomNumber'()

switch (randomNumber) {
    case 1:
		GlobalVariable.searchKeyword = 'HP Elitepad'
		GlobalVariable.fullItemName = 'HP ElitePad 1000 G2 Tablet'
        break
	case 2:
		GlobalVariable.searchKeyword = 'Proteus'
		GlobalVariable.fullItemName = 'Logitech G502 Proteus Core'
		break
	case 3:
		GlobalVariable.searchKeyword = 'Beats'
		GlobalVariable.fullItemName = 'Beats Studio 2 Over-Ear Matte Black Headphones'
		break
	case 4:
		GlobalVariable.searchKeyword = 'HP S9500'
		GlobalVariable.fullItemName = 'HP S9500 Bluetooth Wireless Speaker'
		break
	case 5:
		GlobalVariable.searchKeyword = 'HP ZBook'
		GlobalVariable.fullItemName = 'HP ZBook 17 G2 Mobile Workstation'
		break
}

Mobile.startApplication('C:\\Main Storage\\Downloads\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/Record/Search File/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Record/Search File/android.widget.TextView - LOGIN'), 0)

Mobile.setText(findTestObject('Object Repository/Record/Search File/android.widget.EditText'), username, 0)

Mobile.setText(findTestObject('Object Repository/Record/Search File/android.widget.EditText (1)'), password, 0)

Mobile.tap(findTestObject('Object Repository/Record/Search File/android.widget.Button - LOGIN'), 0)

Mobile.delay(4)

Mobile.setText(findTestObject('Record/Search File/android.widget.EditText - Search'), GlobalVariable.searchKeyword, 0)

Mobile.tap(findTestObject('Object Repository/Record/Search File/android.widget.ImageView (1)'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Record/Search File/android.widget.RelativeLayout'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Record/Search File/android.widget.Button - ADD TO CART'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Record/Search File/android.widget.ImageView (2)'), 0)

Mobile.delay(4)

Mobile.verifyElementText(findTestObject('Object Repository/Record/Search File/android.widget.TextView - HP Pavilion 15z Touch Laptop'), 
    GlobalVariable.fullItemName)

Mobile.closeApplication()

