# Alan's Java Cucumber Portfolio
## Description
Automating the login and transaction features on jamtangan.com using Java with Selenium, Cucumber framework, and Courgette extension. We're using Google Chrome as the web browser.

The addition of Courgette extension enables us to re-running a failed scenario one more time and gives a good report format, which can be accessed in:

```
./target/courgette-report/index.html
```

## System Requirements
- Java 11 or higher.
- IntelliJ IDEA Community Edition as the IDE.
- Latest version of Google Chrome as the browser.

## Additional Plugins for IntelliJ IDEA
For a smoother testing experience, you can download additional plugins which can be accessed on IntelliJ IDEA by clicking:

**File -> Settings -> Plugins -> Type these extensions below**

- Gherkin (to highlight Gherkin syntaxes in .feature files).
- Cucumber for Java (to integrate steps in .feature files with the step classes).

## Before You Run the Test

If you are going to run this project for the first time, open the **application.properties** file which can be accessed in:

```
.\src\test\resources\application.properties
```

Fill these data with your jamtangan.com username and password:

```
data-login-email = Fill_with_your_name
data-login-password = Fill_with_your_password
```

For example:

```
data-login-email = testing@jamtangan.com
data-login-password = Password12345!
```

It is suggested to use an account that already stores an address since it will add an address from the 'Select Address' submenu.

## How to Run the test

Open the IntelliJ IDEA terminal in the project directory and type:

```
mvn clean test
```

This will also ensure the previous report will be deleted so you will only have the latest version of the report.

## Folder Structure
Here is the sample of the project's folder structure, not limited to:

```
java-cucumber-portfolio/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/                    # Page Object Model classes for the functionalities
│   └── test/
│       ├── java/
│       │   ├── hooks/                    # Hooks for Cucumber (e.g., setup and teardown)
│       │   ├── steps/                    # Step definitions for Cucumber
│       │   └── suites/                   # Test suites
│       └── resources/
│           ├── features/                 # Feature files for Cucumber
│           └── application.properties    # Application properties file for the input data
├── target/
│   └── courgette-report/                 # Reports generated by Courgette
├── pom.xml                               # Project Object Model file for Maven
└── README.md                             # README file
```

## Contact
For any inquiries, feel free to reach me out at:
- rrachmanalan@gmail.com
- [LinkedIn](https://www.linkedin.com/in/rrachmanalan/)
