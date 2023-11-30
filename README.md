# CareAndGrow Personal Developed WebApp Automation Testing

## Description

This repository contains my Automated Testing project undertaken as part of the Verification, Validation, and Automated Testing discipline.

## Table of Contents

- [💡Overview](#overview)
- [👀 Serenity BDD report page](https://marcutamas.github.io/CareAndGrow_AutomationTesting/index.html)
- [💜 CareAndGrow WebApp](https://marcutamas.github.io/CareAndGrow/welcome)
- [🛠️ Tools Used](#tools-used)
- [⚙️ Automated Tested Functionalities](#automated-tested-functionalities)
- [📄 How to Run the Tests](#how-to-run-the-tests)
- [©️ License](#license)

## 💡 Overview

The project involves automating tests for the CareAndGrow WebApp using an automation tool. I used SerenityBDD with Selenium and Junit to automate the test for some app functionalities, including valid and/or invalid test cases, as well as parameterized testing.

## 🛠️ Tools Used

- [Maven](https://maven.apache.org/)
- [Serenity BDD JUnit Archetype project](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-junit-archetype)
- [JUnit](https://mvnrepository.com/artifact/junit/junit)
- [Java](https://www.java.com/en/download/)
- [chromedriver](https://googlechromelabs.github.io/chrome-for-testing/)
- [geckodriver](https://github.com/mozilla/geckodriver/releases)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## ⚙️ Automated Tested Functionalities

1. **Accept The Privacy Policy**
   - Testing for invalid accept privacy policy should not initialize the app with mock objects.
   - Testing for valid accept privacy policy should initialize the app with mock objects.

2. **Add Plant Care**
   - Testing for valid add plant care.
   - Testing for invalid add plant care.

3. **Delete Transaction**
   - Testing search to add parameterized.
      - The CSV file contains test data for parameterized testing, covering three test scenarios:
         1. valid;
         2. invalid:
            a. id already exists;
            b. otherwise, API did not find any plant with the given data.
   - Testing search to add not parameterized.
      - Testing for valid search to add plant.
      - Testing for invalid search to add plant, because plant id already exists.
      - Testing for invalid search to add plant, the rest API did not find any plant with the given data.

4. **Update Plant Details**
   - Testing update plant details parameterized.
      - The CSV file contains enough data to cover valid and invalid test scenarios.
   - Testing update plant details not parameterized.
      - Testing for invalid update plant details, because the amount field cannot be 0.
      - Testing for valid update plant details.

## 📄 How To Run the Tests

To run the tests, make sure you have all the dependencies installed and follow the steps outlined in the documentation for each tool used. 
Also, ensure that Java 11 is used for the project.

## ©️ License

This project is licensed under the [MIT License](LICENSE).
