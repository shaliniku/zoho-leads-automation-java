package com.zoho.leads.tests;
import com.zoho.leads.pages.Login;
//import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LeadTest {
    private static final Logger log = LoggerFactory.getLogger(LeadTest.class);
    String email = "kumarishalini916@gmail.com";
    String password = "Zohocrm!123@";
    Login login;
    WebDriver driver;
    String ZOHO_CRM_URL = "https://www.zoho.com/crm/";

    @BeforeTest
    public void setUp() {
        // driver = new ChromeDriver();
        System.out.println("excute setup ");

        login = new Login(new ChromeDriver(), ZOHO_CRM_URL);
        driver = login.login(email, password);
    }


    @Test(priority = 1)
    public void createNewLeadTest() throws InterruptedException {
        System.out.println("excute new lead");
        // Wait until the Leads tab is clickable
        WebElement leadsTab = driver.findElement(By.xpath("/html/body/div[18]/div[9]/div[1]/crm-menu/div[1]/crm-tab/div[2]/div[2]/a"));
        leadsTab.click();
        Thread.sleep(5000);

        // Click on the New Lead button By.id("Visible_Leads")
        WebElement newLeadButton = driver.findElement(By.xpath("/html/body/div[18]/div[11]/div/crm-custom-outer-box/div[3]/div[5]/crm-customview-layer/div[6]/lyte-table/div/lyte-yield/lyte-table-structure/lyte-tbody/lyte-tr/lyte-td[3]/span[1]/span/link-to/button"));
        newLeadButton.click();
        Thread.sleep(5000);

        // Fill out the form
        // select salutation dropdown
        WebElement titleDropdown = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_FIRSTNAME_SALUTATION\"]/div/lyte-dropdown/div[1]/lyte-drop-button/lyte-icon"));
        titleDropdown.click();

        //click on salutation as Mr.
        WebElement salutationSelectButton = driver.findElement(By.xpath("//*[@id=\"Lyte_Drop_Item_15\"]"));
        salutationSelectButton.click();

        //fill first name
        WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_FIRSTNAME_LInput\"]"));
        firstNameField.sendKeys("John1");

        //fill last name
        WebElement lastNameField = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_LASTNAME_LInput\"]"));
        lastNameField.sendKeys("Doef");

        //fill company name
        WebElement companyNameField = driver.findElement(By.xpath("/html/body/div[18]/div[11]/div/crm-create-entity/form/crm-create-layout/div[2]/div/crm-create-sections[2]/div/div/div[2]/div[2]/crm-create-fields[1]/div[1]/div[2]/lyte-autocomplete/lyte-dropdown/div[1]/lyte-drop-button/lyte-input/div/input"));
        companyNameField.sendKeys("Pallet");

        //fill email id
        WebElement emailFieldLead = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_EMAIL_LInput\"]"));
        emailFieldLead.sendKeys("xyz@gmail.com");

        // fill mobile number
        WebElement mobileField = driver.findElement(By.xpath("//*[@id=\"Crm_Leads_PHONE_LInput\"]"));
        mobileField.sendKeys("5555555555");

        // Click on Save button
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"crm_create_savebutn\"]"));
        saveButton.click();
        Thread.sleep(5000);
    }


    @Test(priority = 2)
    public void editLeadTest() throws InterruptedException {
            //click on edit button
            WebElement editButton = driver.findElement(By.xpath("//*[@id=\"btn_edit\"]/button/lyte-yield"));
            editButton.click();
            Thread.sleep(2000);

            //add website details
            WebElement websiteField = driver.findElement(By.xpath("/html/body/div[18]/div[11]/div/crm-create-entity/form/crm-create-layout/div[2]/div/crm-create-sections[2]/div/div/div[2]/div[2]/crm-create-fields[5]/div[1]/div[2]/crux-website-component/div/lyte-input/div/input"));
                  //  "//*[@id=\"Crm_Leads_WEBSITE_LInput\"]"));
            websiteField.sendKeys("zoho.com");
            //Thread.sleep;

            // Click on Save button again
            WebElement saveButtonAgain = driver.findElement(By.xpath("//*[@id=\"crm_create_savebutn\"]"));
            saveButtonAgain.click();
            Thread.sleep(5000);

    }


    @Test(priority = 3)
    public void testDeleteLead() throws InterruptedException {
            //Now perform delete operation for the field created
            WebElement moreButton = driver.findElement(By.xpath("//*[@id=\"dv_moreBtn\"]/button"));
            moreButton.click();
            Thread.sleep(3000);

            //select delete option//*[@id="drop_action_delete_754256000000344039"]
            WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"drop_action_delete_750193000000349001\"]"));
            deleteButton.click();
            Thread.sleep(4000);

            //press delete on pop up
            WebElement popUpDeleteButton = driver.findElement(By.xpath("/html/body/lyte-wormhole[6]/lyte-yield/div/div[1]/div[3]/lyte-button[2]/button"));
            //"/html/body/lyte-wormhole[6]/lyte-yield/div/div[1]/div[3]/lyte-button[2]/button/lyte-yield"));
            popUpDeleteButton.click();
            Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void testFilterLeads() throws InterruptedException {
        //go to lead tab again
        WebElement leadsTab = driver.findElement(By.xpath("/html/body/div[18]/div[9]/div[1]/crm-menu/div[1]/crm-tab/div[2]/div[2]/a"));
        leadsTab.click();
        Thread.sleep(5000);

        //click on filter search and search for email
        WebElement searchForFilterField = driver.findElement(By.xpath("//*[@id=\"inputId\"]"));
        searchForFilterField.sendKeys("email");

        //click on email
        WebElement selectEmailCheckBox = driver.findElement(By.xpath("/html/body/div[18]/div[11]/div/crm-custom-outer-box/div[3]/div[6]/crm-custom-filter/div/form/div/crux-smart-filter/div[2]/div[1]/div/lyte-accordion/lyte-yield/lyte-accordion-item[2]/lyte-accordion-body/div/div[10]/div/div/lyte-checkbox/label/input"));
        selectEmailCheckBox.click();

        //pass the email value for filtering
        WebElement emailValue = driver.findElement(By.xpath("//*[@id=\"id_Email\"]/div/input"));
        emailValue.sendKeys("xyz@gmail.com");

    }

@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

