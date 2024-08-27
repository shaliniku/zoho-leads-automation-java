package com.zoho.leads.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    WebDriver driver;
    String url;
    //"https://www.zoho.com/crm/";


    // @BeforeTest
    public Login(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
        this.driver.get(this.url);
    }
    // Initialize WebDriver

    // @Test
    public WebDriver login(String email, String password) {
        try {
            WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
            // Click on the Sign In button
            WebElement signInButton = driver.findElement(By.linkText("SIGN IN"));
            signInButton.click();

            // Wait for the login form to load and enter email
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_id")));
            WebElement emailField = driver.findElement(By.id("login_id"));
            emailField.sendKeys("kumarishalini916@gmail.com");

            // Click on the Next button
            WebElement nextButton = driver.findElement(By.id("nextbtn"));
            nextButton.click();

            // Wait for the password field and enter password
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Zohocrm!123@");

            // Click on the Sign In button
            WebElement signInSubmitButton = driver.findElement(By.id("nextbtn"));
            signInSubmitButton.click();
            Thread.sleep(3000);

            //click on skip button
            WebElement skipButton = driver.findElement(By.xpath("/html/body/div[7]/div[1]/form[2]/div[3]/button/div"));
            skipButton.click();
            Thread.sleep(3000);

            return this.driver;


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            System.out.println("completed");

            // Close the browser
            // driver.quit();

        }
        return this.driver;

    }

}