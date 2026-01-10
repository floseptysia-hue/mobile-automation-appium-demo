# Mobile Automation Testing – Demo App

## Overview
This project demonstrates **end-to-end mobile automation testing** for a demo e-commerce mobile application (APK).  
The main focus is automating two core flows:

1. **Login Flow** – Verifying that users can successfully log in to the application.  
2. **Add Product to Cart Flow** – Verifying that a user can add a product to the shopping cart.

The project highlights the setup of a robust mobile automation framework using **Java, Appium, TestNG, and Gradle**, while implementing maintainable test structures using the **Page Object Model (POM)**.

---

## Tools & Environment
- **IDE:** IntelliJ IDEA  
- **Build Tool:** Gradle  
- **Testing Framework:** TestNG  
- **Mobile Automation:** Appium  
- **Element Inspector:** Appium Inspector  
- **Device:** Android Emulator  

---

## Project Structure & Implementation

### 1. Automation Framework Setup
- Configured a Java + Appium + TestNG + Gradle project for mobile automation.  
- Integrated Appium server to detect and interact with the Android Emulator.  
- Verified that the demo APK runs correctly on the emulator.

### 2. Login Flow Automation
- Locators for **email**, **password**, and **login button** were identified using Appium Inspector.  
- Implemented `LoginTest` class to automate:
  1. Input valid username/email.  
  2. Input valid password.  
  3. Click the login button.  
  4. Assertion: user is redirected to the main/home screen.  

### 3. Add Product to Cart Automation
- Identified product elements on the main page using stable locators.  
- Implemented `AddToCartTest` class to automate:
  1. Selecting a product.  
  2. Clicking **Add to Cart**.  
  3. Assertion: product is successfully added to the cart (cart count increases or success notification appears).

### 4. Test Design & Reusability
- Created a **BaseTest** class for driver setup and teardown.  
- Applied **Page Object Model (POM)** to separate element locators from actions.  
- Ensured all test code is **readable, reusable, and maintainable** for future scaling.  

---

## Key Insights

### Critical Path Automation
The most critical automation flows in this project are:

1. **Login Flow** – Serves as the entry point to the application. A failed login blocks all subsequent test scenarios, preventing assessment of other features.  
2. **Add to Cart Flow** – Core e-commerce functionality. Failures here may indicate issues with UI interaction, cart state management, or backend API integration, directly impacting user experience and application reliability.

These flows are prioritized because they represent the most essential end-to-end paths that must remain stable in every build.

### Locator Strategy & Test Stability
During automation development, several challenges were observed:

- Some UI elements rely on **long XPaths, indexes, or dynamic attributes**, which are prone to break with minor UI updates.  
- Buttons, product lists, and notifications often have **deep hierarchical structures**, making consistent locator selection difficult.  

**Approach:**  
- Prefer **resource-id** or **accessibility id** for locators as they are stable.  
- Use XPath only as a last resort, ensuring it is concise and specific.  

Proper locator selection directly impacts **test reliability** and reduces flakiness. Unstable locators can cause intermittent test failures, even when the application functions correctly. Using stable locators ensures automation is **reliable, maintainable, and produces accurate regression testing results**.

---

## Deliverables
- Automated tests covering login and add-to-cart flows.  
- Page Object Model-based reusable code.  
- Screen recordings demonstrating successful test execution.  

---

## Notes
- Ensure the Android Emulator is running before executing tests.  
- Update Gradle dependencies and driver configurations if using a different emulator or device.  
- This framework can be extended to cover additional critical flows in the application.  

---

## Reflection Question
https://docs.google.com/document/d/1nfVNEfCtSsmUP3zSNu-m58l_rQpOTzGKFBPd5if23gY/edit?usp=sharing
