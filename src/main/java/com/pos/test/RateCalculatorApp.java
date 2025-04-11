package com.pos.test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class RateCalculatorApp {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  

            driver.get("https://www.pos.com.my/send/ratecalculator");

            By countryInput = By.id("mat-input-0");
            WebElement countryElement = wait.until(ExpectedConditions.elementToBeClickable(countryInput));
            countryElement.click();
            countryElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            countryElement.sendKeys(Keys.DELETE);

            countryElement.sendKeys("india");
            Thread.sleep(1000); 
            countryElement.sendKeys(Keys.ARROW_DOWN);
            countryElement.sendKeys(Keys.ENTER);

            By weightInput = By.xpath("//input[@placeholder='eg. 0.1kg']");  
            WebElement weightField = wait.until(ExpectedConditions.elementToBeClickable(weightInput));
            weightField.clear();  
            weightField.sendKeys("1");  // Enter weight value

            By postcodeInput = By.xpath("//input[@placeholder='Postcode']");  
            WebElement postcodeField = wait.until(ExpectedConditions.elementToBeClickable(postcodeInput));
            postcodeField.clear();  
            postcodeField.sendKeys("35600");  

            By calculateBtn = By.xpath("//*[@id='contentBody']/div/app-static-layout/app-rate-calculator-v2/div/div[3]/div[2]/a");
            WebElement calcButton = wait.until(ExpectedConditions.elementToBeClickable(calculateBtn));
            calcButton.click();  

            By quoteResult = By.xpath("//*[@id='contentBody']/div/app-static-layout/app-rate-calculator-v2/div/div[4]/div");
            

            WebElement quoteElement = wait.until(ExpectedConditions.visibilityOfElementLocated(quoteResult));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", quoteElement);

            Thread.sleep(4000); 

//            System.out.println("Quote Result: " + quoteElement.getText());
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();  
            }
        }
    }
}
