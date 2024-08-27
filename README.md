# zoho-leads-automation-java

This project automates the testing of the Leads module in the Zoho CRM platform using Playwright.

## Setup

1. Clone the repository:
   git clone https://github.com/your-username/zoho-leads-automation.git
   cd zoho-leads-automation

2. Install dependencies:
   npm install

3. Run the tests:
   mvn clean test


## Test Cases

1. **Create a New Lead**: Tests the ability to create a new lead in the Zoho CRM.
2. **Edit a Lead**: Tests the ability to edit an existing lead.
3. **Filter Leads**: Tests the filtering functionality in the Leads module.
4. **Delete a Lead**: Tests the ability to delete a lead.

## Test Specification

- The tests cover the basic CRUD (Create, Read, Update, Delete) operations for the Leads module.
- The tests are organized using the Page Object Model for maintainability.

## Bonus: Rationale Behind Test Approaches

The test cases are designed to cover the core functionalities of the Leads module in Zoho CRM, ensuring that all critical user actions are validated. The Page Object Model (POM) is used to make the codebase more modular and easier to maintain.
