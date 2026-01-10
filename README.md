# Mobile Automation Testing – Demo App

---

## Overview
This project demonstrates **end-to-end mobile test automation** for a demo e-commerce application (APK). The focus of this project is on automating critical flows such as **login** and **adding a product to the cart**.  

The project showcases a professional approach to mobile test automation using **Java, Appium, TestNG, and Gradle**, implementing **Page Object Model (POM)** for better code reusability and maintainability.  

---

## Project Structure
mobile-automation-appium/
│
├── src/
│ ├── main/
│ │ └── java/
│ │ └── pages/ # Page Object classes
│ │ └── utils/ # BaseTest, driver setup
│ │
│ └── test/
│ └── java/
│ └── tests/ # Test classes (LoginTest, AddToCartTest)
│
├── apk/ # Demo APK for testing
├── build.gradle
└── README.md
 
---

## Prerequisites

Before running the automation tests, make sure the following tools are installed and configured:

- **Java JDK 11+**
- **Gradle 8+** (or Gradle wrapper included in project)
- **Appium 2.x**  
- **Appium Inspector** (for locator analysis)
- **Android SDK**  
- **Android Emulator** (configured and running)
- **IntelliJ IDEA** (recommended IDE)  

**Environment Variables** (Mac example):

```bash
export ANDROID_HOME=/Users/your-username/Library/Android/sdk
export ANDROID_SDK_ROOT=/Users/your-username/Library/Android/sdk
export PATH=$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools:$PATH

echo $ANDROID_HOME
echo $ANDROID_SDK_ROOT
adb devices
```
---

Setup Instructions

1. Clone the repository
git clone https://github.com/your-username/mobile-automation-appium.git
cd mobile-automation-appium

2. Install dependencies
If using Gradle wrapper:
./gradlew clean build

3. Start Appium server
Launch Appium server via GUI or CLI:
appium

4. Launch Android Emulator
Make sure the emulator is running and connected:
adb devices

5. Configure APK path
- Ensure the demo APK exists in apk/ folder
- Update test config if using a different APK path

---

Running Tests
Option 1: Using Gradle (CLI)
./gradlew test

Option 2: Using IntelliJ IDEA
- Open project in IntelliJ IDEA
- Navigate to src/test/java/tests/LoginTest.java or AddToCartTest.java
- Right-click → Run

 --- 

Test Reports

After running, TestNG reports are generated at:
build/reports/tests/test/index.html
Open in a browser to view detailed test results.

---

Key Automation Highlights

1. Critical Flows Covered
- Login Automation: Ensures user can access all features. Failure here blocks the entire workflow.
- Add to Cart Automation: Core e-commerce flow; failure indicates issues in UI, cart management, or backend API.

2. Locator Strategy
- Prefer resource-id or accessibility id for stability
- Use XPath only as a last resort, keeping it short and specific
- Minimizes flaky tests and improves reliability of automation

3. Reusable Architecture
- BaseTest handles driver setup/teardown
- Page Object Model separates page actions from tests
- Tests are clean, modular, and easy to maintain

---

Notes
## Reflection Question
https://docs.google.com/document/d/1nfVNEfCtSsmUP3zSNu-m58l_rQpOTzGKFBPd5if23gY/edit?usp=sharing
