---

# 🚀 FastTrack Web Application Selenium Automation using Java

This repository contains an Automation Testing framework built with **Selenium WebDriver** using **Java**, following best practices like **Page Object Model (POM)**. It integrates **TestNG** for test execution and report generation, **Log4j2** for structured logging.

---

## 📦 Dependencies

* **Selenium WebDriver** – For browser automation
* **TestNG** – For test annotations, execution, and reporting
* **Log4j2** – For logging application behavior.

---

## 🧩 Project Structure

```
DreamPortalAutomation/
├── reports/                   # Auto-generated ExtentReports (.html)
├── screenshots/               # Captured screenshots
├── src/
│   ├── main/
│   │   └── resources/
│   │       └── log4j2.properties
│   └── test/
│       └── java/
│           ├── utils/
│           │   ├── Base.java
│           │   ├── WebDriverHelper.java
│           │   ├── LoggerHandler.java
│           │
│           ├── locators/
│           │   └── *.java
│           │
│           ├── pages/
│           │   ├── HomePage.java
│           │   ├── SalesPage.java
│           │   └── SearchPage.java
│           │
│           └── runner/
│               └── TestRunner.java
│____________________
```

---

## 🔍 Folder & File Details

### ✅ `utils/`

* `Base.java`: Initializes WebDriver and browser config
* `WebDriverHelper.java`: Common WebDriver actions to avoid code duplication
* `LoggerHandler.java`: Centralized logging using Log4j2

### ✅ `locators/`

* Page-specific locators (organized per screen/page)

### ✅ `pages/`

* **HomePage.java**
* **SalesPage.java**
* **SearchPage.java**

> These classes contain the test logic tied to UI functionality and use locators + helpers

### ✅ `runner/`

* **TestRunner.java**: Executes test scenarios using TestNG annotations

  * `@BeforeMethod`, `@Test`, `@AfterMethod`

### ✅ Other Resources

* `log4j2.properties`: Config for logging

---

## 📝 Highlights

* 📄 **Page Object Model** structure
* 💬 Centralized **logging with Log4j2**

---

## 🚀 Getting Started

1. Clone the repository
2. Open in IntelliJ IDEA or Eclipse
3. Run `mvn clean install` to install dependencies
4. Configure WebDriver path if needed
5. Run tests using:

   * `TestRunner.java`

---

