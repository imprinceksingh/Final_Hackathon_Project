
# ZIG WHEELS

This is a Selenium based Automation Project on a website named https://www.zigwheels.com/

## Tech Stack

- Java(Maven Project)
- Eclipse (4.30.0)

### It is implemented by integrating Framework: ###

- ApachePOI (5.2.5)
- TestNG and (7.9.0)
- Cucumber (7.15.0)

### along with: ###

- Jenkins (2.426.3)
- ExtentReport (1.14.0)
- Page Object Model Concept

## Folder Structure

```bash
- src/test/java

 Package 1: factory
   Class 1: BaseClass.java
   Class 2: CrossBrowsing.java

 Package 2: pageObjects
   Class 1: BasePage.java
   Class 2: BikeDetailsPage.java
   Class 3: InvalidGoogleLoginPage.java
   Class 4: UsedCarPage.java

  Package 3: stepDefinition
    Class 1: BikeDetailStep.java
    Class 2: Hooks.java
    Class 3: InvalidGoogleLoginStep.java
    Class 4: UsedCarStep.java

  Package 4: testCases
    Class 1: TC001_InvalidGoogleLogin.java
    Class 2: TC002_BikeDetails.java
    Class 3: TC003_UsedCarDetails.java
  
  Package 5: testRunner
    Class 1: TestRunner.java

  Package 6: utilities
    Class 1: ExtentReport.java
    Class 2: WriteExcelData.java

 - src/test/resources
  - FeatureFiles
	E2E.feature
  - Screenshots
	
  Config.properties
  extent.propertiess
  Log4j2.xml
  testdata.xlsx
-       reports

-       screenshots

-       TestOutput

-	test-output

-	CrossBrowserTestng.xml

-       pom.xml

-       runme.bat

-       testng.xml




```

## Test Cases

There are total 3 Test Cases

```bash
  Test Case 1 : Try to 'Login' with google, give invalid account details & capture the error message
```
```bash
  Test Case 2 : Display "Upcoming" bikes details like bike name, price and expected launch date in India, for manufacturer 'Honda' & Bike price should be less than 4Lac.
```
```bash
  Test Case 3 : For Used cars in Chennai, extract all the popular models in a List; Display the same
```


## Running the Project

In order to run the project please make sure you have TestNg and Cucumber plugin installed in your Eclipse.

```bash

### Use- ###
testng.xml:to run Project using chrome with TestNG
### Use-### 
crossBrowsertestng.xml:to run Project using chrome and edge with TestNG serially.
### Use-### 
TestRunner.java:to run Project with Cucumber
### Use-### 
pom.xml:right click and run as Maven Test.

``` 

## Report and Screenshots

```bash
- Extent Report (//reports//Test-Report.html)
- Cucumber Report (//reports//myreport.html)
- TestNG Report(//test-output//index.html)
- screenshots(//screenshots)
- ExcelData(//src//test//resources//testdata.xlsx)
```


## A Result folder is present where I placed all the results of Last run.


## Author

- Prince Kumar(2304002)