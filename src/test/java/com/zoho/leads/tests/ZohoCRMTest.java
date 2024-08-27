//package com.zoho.leads.tests;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//
//public class ZohoCRMTest {
//
//    public static void main(String[] args) throws InterruptedException {
//        // Set the path for the ChromeDriver
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        // Initialize WebDriverWait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        try {
//            // Navigate to Zoho CRM login page
//            driver.get("https://www.zoho.com/crm/");
//
//            // Click on the Sign In button
//            WebElement signInButton = driver.findElement(By.linkText("SIGN IN"));
//            signInButton.click();
//
//            // Wait for the login form to load and enter email
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_id")));
//            WebElement emailField = driver.findElement(By.id("login_id"));
//            emailField.sendKeys("kumarishalini916@gmail.com");
//
//            // Click on the Next button
//            WebElement nextButton = driver.findElement(By.id("nextbtn"));
//            nextButton.click();
//
//            // Wait for the password field and enter password
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
//            WebElement passwordField = driver.findElement(By.id("password"));
//            passwordField.sendKeys("Zohocrm!123@");
//
//            // Click on the Sign In button
//            WebElement signInSubmitButton = driver.findElement(By.id("nextbtn"));
//            signInSubmitButton.click();
//            Thread.sleep(3000);
//
//            //click on skip button
//            WebElement skipButton = driver.findElement(By.xpath("/html/body/div[7]/div[1]/form[2]/div[3]/button/div"));
//            skipButton.click();
//           Thread.sleep(3000);
//
//            // Wait until the Leads tab is clickable
//            //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[2]")));
//            WebElement leadsTab = driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[2]"));
//            leadsTab.click();
//            Thread.sleep(5000);
//
//            // Click on the New Lead button By.id("Visible_Leads")
//            WebElement newLeadButton = driver.findElement(By.xpath("//*[@id=\"table_row_1\"]/lyte-td[3]/span[1]/span/link-to/button"));
//            newLeadButton.click();
//            Thread.sleep(5000);
//
//            // Fill out the form
//
//            // select salutation dropdown
//            WebElement titleDropdown = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_FIRSTNAME_SALUTATION\"]/div/lyte-dropdown/div[1]/lyte-drop-button/lyte-icon"));
//            titleDropdown.click();
//
//            //click on salutation as Mr.
//            WebElement salutationSelectButton = driver.findElement(By.xpath("//*[@id=\"Lyte_Drop_Item_15\"]"));
//            salutationSelectButton.click();
//
//            //fill first name
//            WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_FIRSTNAME_LInput\"]"));
//            firstNameField.sendKeys("John1");
//
//            //fill last name
//            WebElement lastNameField = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_LASTNAME_LInput\"]"));
//            lastNameField.sendKeys("Doeyq");
//
//            //fill company name
//            WebElement companyNameField = driver.findElement(By.xpath("/html/body/div[18]/div[11]/div/crm-create-entity/form/crm-create-layout/div[2]/div/crm-create-sections[2]/div/div/div[2]/div[2]/crm-create-fields[1]/div[1]/div[2]/lyte-autocomplete/lyte-dropdown/div[1]/lyte-drop-button/lyte-input/div/input"));
//            companyNameField.sendKeys("Pallet");
//
//            //fill email id
//            WebElement emailFieldLead = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_EMAIL_LInput\"]"));
//            emailFieldLead.sendKeys("xyz@gmail.com");
//
//            // fill mobile number
//            WebElement mobileField = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_PHONE_LInput\"]"));
//            mobileField.sendKeys("5555555555");
//
//            // Click on Save button
//            WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"crm_create_savebutn\"]"));
//            saveButton.click();
//            Thread.sleep(5000);
//
//              //edit part
//            // click on edit button
//            WebElement editButton = driver.findElement(By.xpath("//*[@id=\"btn_edit\"]/button/lyte-yield"));
//            editButton.click();
//            Thread.sleep(2000);
//
//            //add website details
//            WebElement websiteField = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_WEBSITE_LInput\"]"));
//            websiteField.sendKeys("zoho.com");
//            //Thread.sleep;
//
//            // Click on Save button again
//            WebElement saveButtonAgain = driver.findElement(By.xpath("//*[@id=\"crm_create_savebutn\"]"));
//            saveButtonAgain.click();
//            Thread.sleep(5000);
//
//            /*
//            //Now perform delete operation for the field created
//            WebElement moreButton = driver.findElement(By.xpath("//*[@id=\"dv_moreBtn\"]/button"));
//            moreButton.click();
//            Thread.sleep(3000);
//
//            //select delete option//*[@id="drop_action_delete_754256000000344039"]
//            WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"drop_action_delete_750193000000349001\"]"));
//            deleteButton.click();
//            Thread.sleep(4000);
//
//            //press delete on pop up
//            WebElement popUpDeleteButton = driver.findElement(By.xpath("/html/body/lyte-wormhole[6]/lyte-yield/div/div[1]/div[3]/lyte-button[2]/button"));
//                    //"/html/body/lyte-wormhole[6]/lyte-yield/div/div[1]/div[3]/lyte-button[2]/button/lyte-yield"));
//            popUpDeleteButton.click();
//            Thread.sleep(5000);
//
//
///*
//            // Navigate to Leads tab again
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='Leads_tab']")));
//            leadsTab.click();
//
//            // Select the first lead and click on it
//            WebElement firstLead = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='leads_table']//tr[1]/td[1]//a")));
//            firstLead.click();
//
//            // Click on Edit button
//            WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Edit')]")));
//            editButton.click();
//
//            // Change last name to Fernandis
//            WebElement lastNameEditField = driver.findElement(By.id("Crm_Leads_LASTNAME"));
//            lastNameEditField.clear();
//            lastNameEditField.sendKeys("Fernandis");
//
//            // Click on Save button
//            WebElement saveEditButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
//            saveEditButton.click();
//
//            // Navigate to Leads tab again
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='Leads_tab']")));
//            leadsTab.click();
//
//            // Select the first lead again and click on it
//            firstLead = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='leads_table']//tr[1]/td[1]//a")));
//            firstLead.click();
//
//            // Click on 3 dots and delete lead
//            WebElement moreOptions = driver.findElement(By.xpath("//button[contains(@class, 'more-actions')]"));
//            moreOptions.click();
//
//            WebElement deleteOption = driver.findElement(By.xpath("//a[text()='Delete']"));
//            deleteOption.click();
//
//            // Confirm delete in pop-up
//            WebElement confirmDeleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
//            confirmDeleteButton.click();
//
// */
//
//
//
//
//
//
//
//            // Verification of lead creation can be added here if needed
//            System.out.println("Lead created and edited successfully.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Close the browser
//            driver.quit();
//        }
//    }
//}
