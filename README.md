# POS Malaysia Rate Calculator

This project automates the rate calculator functionality on [POS Malaysia's website](https://www.pos.com.my/send/ratecalculator) using Selenium WebDriver and Java. It fills out destination country, weight, and postcode, then triggers the rate calculation and fetches the output quote.

---

## Technologies Used

- **Java 11+**
- **Selenium WebDriver**
- **WebDriverManager**
- **FirefoxDriver (GeckoDriver)**
- **JUnit/TestNG (optional for testing framework)**
- **Git & GitHub for version control**

---

## Features

- Automates the selection of the destination country (`India`)
- Fills in weight and postcode fields
- Clicks the "Calculate" button
- Waits for the quote to be displayed
- Scrolls down the page for better visibility
- Outputs the final quote result in the console

---

## Prerequisites

- Java JDK installed
- Maven (optional if you're using `pom.xml`)
- Firefox browser
- Eclipse/IntelliJ or any IDE
- Git installed and configured
- GeckoDriver managed via WebDriverManager

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Akshadha-work/assessment_pos.git
