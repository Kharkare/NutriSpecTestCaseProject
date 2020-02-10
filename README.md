# NutriSpec Automated Test Cases

This project is a Selenium project developed using [Katalon](https://www.katalon.com/) which is a part of [NutriSpec](https://github.com/nikhilgosavi007/nutrition-web) project developed in TYPO3.

## Prerequisites

This project assumes NutriSpec is up and running in local ddev environment.


## Setup

1. Create an account on [Katalon](https://www.katalon.com/sign-up/)
2. Sign in to your account and download the [Katalon Studio IDE](https://www.katalon.com/download)
3. Extract the zipped file contents to your desired location
4. Move to the location where you extracted the zipped file and start Katalon
5. Upon starting the IDE for the first time you will be asked to activate the IDE. Use your katalon account to activate the copy of your IDE. For detailed steps on activation and proxy settings(if applicable) please see [here](https://docs.katalon.com/katalon-studio/docs/katalon-studio-activation-since-70.html)
6. Clone this repo or download a zip and extract it to a location
7. Go back to Katalon Studio and click on "Open Project" link. Alternatively you can also open a project from File > Open Project
8. Open Project "NutriSpecTestCaseProject" from the cloned repo
9. Open Test suite "Enroll_Add_Prescription_Unroll"
10. Click on run to run the Test suite

### To Generate reports

1. Login to [Katalon Store](https://store.katalon.com/signin) with your Katalon account.
2. Open [Basic Report](https://store.katalon.com/product/59/Basic-Report) and click "Install" button on left panel.
3. Open Katalon Studio and click on "Reload Plugin"
4. After the plugin installs run the Test suite again. The reports are generated within the Project under "Report" folder

### To email reports
Follow the "Email Settings" section on [this](https://docs.katalon.com/katalon-studio/docs/execution-settings.html#emails-settings) page. After the settings run the test suite again.
