# Android Mobile App Automation Framework

## Overview
This is an Android mobile automation framework built using **Appium**, **Selenium**, and the **Page Object Model (POM)** design pattern. The framework is integrated with **JUnit** for test execution and reporting. It is designed to ensure robust and scalable test automation for Android applications.

---

## Features
- **Cross-device support**: Test Android apps on multiple devices/emulators.
- **Page Object Model (POM)**: Organized and maintainable code structure.
- **JUnit Integration**: Lightweight and efficient test execution.
- **Appium**: For mobile app automation.
- **Selenium WebDriver**: For enhanced web-based interaction when needed.
- **Customizable Test Configuration**: Easily modify desired capabilities and test settings.

---

## Prerequisites
1. **Java Development Kit (JDK)** - Version 11 or above.
2. **Maven** - For dependency management.
3. **Appium Server** - Installed and running.
4. **Android Studio** - With ADB configured for device/emulator connectivity.
5. **Node.js and NPM** - Required for Appium installation.
6. **IntelliJ IDEA** - Recommended IDE (or any Java-supported IDE).

---

## Installation
1. Clone the repository:
   ```bash
   git clone <repository_url>
   cd <repository_folder>

## Troubleshooting

- Appium server not starting: Ensure Node.js is installed and Appium is set up correctly.
- ADB issues: Check that the device is recognized by running adb devices.
- Maven dependency issues: Run mvn clean install -U to force update dependencies.
