package step_defination.Android;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;
import java.util.Set;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import pages.Page;
import java.util.List;
import java.util.Map;

public class HomeSteps extends Page {
    @Given("App should open successfully")
    public void userIsOnHomePageTitleTestingApp()  {
        Assert.assertTrue(getHomePage().getTitle().isDisplayed());
    }
    @When("I enter username and password")
    public void i_enter_username_and_password(){
        WebElement usernameField = getHomePage().Username();
        WebElement passwordField = getHomePage().Password();

        usernameField.clear();
        usernameField.click();
        usernameField.sendKeys("Salmansid19");

        passwordField.clear();
        passwordField.click();
        passwordField.sendKeys("S@lman31");



        //getHomePage().Username().sendKeys("retail198");
        //getHomePage().Password().sendKeys("Admin@4321");
    }

    @And("I click on loginbutton")
    public void i_click_on_loginbutton(){
         WebDriverWait wait = new WebDriverWait(AndroidDriverSetup.getAndroidDriver(), 20);
        //WebDriverWait wait = new WebDriverWait(driver, 20);  // 20 seconds wait time
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(getHomePage().logInButton()));
        // Assert that the login button is displayed
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed");

        // Assert that the login button is enabled
        Assert.assertTrue(loginButton.isEnabled(), "Login button is not enabled");
        loginButton.click();

    }


    @Then("Show balance text is visible")
    public void show_balance(){

        WebDriverWait wait = new WebDriverWait(AndroidDriverSetup.getAndroidDriver(), 200);
        wait.until(ExpectedConditions.visibilityOf(getHomePage().showBalance()));
        Assert.assertTrue(getHomePage().showBalance().isDisplayed());
    }

    @Given("the user is on the home page")
    public void callshow(){
        show_balance();
    }

   /* @When("the user clicks on Al meezan investment")
    public void meezan_investment(){

        getHomePage().Almeezan().click();
        WebDriverWait wait = new WebDriverWait(AndroidDriverSetup.getAndroidDriver(), 60);
        getHomePage().back_arrow().click();
        wait = new WebDriverWait(AndroidDriverSetup.getAndroidDriver(), 50);
        getHomePage().Almeezan().click();


        getHomePage().Invest().click();
        getHomePage().Portfolio().click();

        // Wait for the dialog box to appear, but first switch to the correct context
        Set<String> contextNames = AndroidDriverSetup.getAndroidDriver().getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName); // To identify available contexts
            if (contextName.contains("WEBVIEW")) {
                AndroidDriverSetup.getAndroidDriver().context(contextName);
                break;
            }
        }
        String currentContext = AndroidDriverSetup.getAndroidDriver().getContext();
        Assert.assertTrue(currentContext.contains("WEBVIEW"), "Failed to switch to WebView context");



     wait = new WebDriverWait(AndroidDriverSetup.getAndroidDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='oj-listbox-result-label-6']")));
        element.click();


        WebElement fund= AndroidDriverSetup.getAndroidDriver().findElement(By.xpath("(//a[contains(@class, 'oj-select-arrow oj-component-icon oj-clickable-icon-nocontext oj-select-open-icon')])[2]"));
          fund.click();
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='oj-listbox-result-label-7']")));
        element2.click();

         // Switch back to Native context
        AndroidDriverSetup.getAndroidDriver().context("NATIVE_APP");

    }*/

    @When("the user clicks on {string}")
    public void send_money(String buttontext){

        getHomePage().dynamic(buttontext).click();

    }
    @And("the user clicks on Send money to a new account")
    public void send_money(){

        getHomePage().sendmoneybut().click();

    }
    @And("the user searches for a bank and select the first bank")
    public void banksearch(){
          WebElement searchinput= getHomePage().banksearch();
          searchinput.sendKeys("meezan");

        WebDriverWait wait = new WebDriverWait(AndroidDriverSetup.getAndroidDriver(), 20);
        WebElement bankclick = wait.until(ExpectedConditions.elementToBeClickable(getHomePage().bank()));
        bankclick.click();

    }

    @And("the user enters the account number and click on fetch account details")
    public void accountnoinput() {
        WebElement accountinput = getHomePage().accountinput();
        accountinput.sendKeys("69010108907793");
        getHomePage().accountbutton().click();


    }

    @And("the user click on send now button ")
    public void sendmoney() {

        getHomePage().sendnow().click();
    }


    @And("the user verifies the account details and clicks on the next button")
    public void fetchdetails() {

        getHomePage().accountdetailsbutton().click();


    }

    @And("the user enters the amount to be sent and click on nextbutton")
    public void amountinpkr() {

        WebElement amountfield=getHomePage().amountinput();

        amountfield.click();
        amountfield.sendKeys("1");
        getHomePage().accountdetailsbutton().click();


    }

    @Then("the money should be sent successfully and sucessfull message should appeared")
    public void moneysent() {

        Assert.assertTrue(getHomePage().moneysentmessage().isDisplayed());
    }











    @And("^\\[Home Page\\] Verify the Version Code (.*)$")
    public void verifyTheCode(String versionCode) {
        Assert.assertEquals(getHomePage().getVersionCode().getText(),versionCode,"Verify Version Code");
    }

    @And("^\\[Home Page\\] Verify the Version Name (.*)$")
    public void verifyTheName(String versionName) {
        Assert.assertEquals(getHomePage().getVersionName().getText(),versionName,"Verify Version Name");
        getHomePage().getVersionName().isDisplayed();
    }

    @When("\\[Home Page\\] User tap on Button (.*)$")
    public void homePageUserTapOnButtonXxx(int button) {
        getHomePage().getButton(button).click();
    }

    @Then("[Home Page] Verify the Immediate Update button is visible")
    public void homePageVerifyTheImmediateUpdateButtonIsVisible() {
        getHomePage().getImmediateButton().isDisplayed();
    }

    @When("[Home Page] User tap on Immediate Update Button")
    public void homePageUserTapOnImmediateUpdateButton() {
        getHomePage().getImmediateButton().click();
    }

//    @Then("[Home Page] Verify the three button options")
//    public void updatePageVerifyTheThreeButtonOptions(DataTable dataTable) {
//        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
//        for (Map<String, String> itemData : rows) {
//            if (itemData.containsKey("Button1")) {
//                $(getHomePage().getButton(1)).shouldHave(Condition.exactText(itemData.get("Button1")));
//            }
//            if (itemData.containsKey("Button2")) {
//                $(getHomePage().getButton(2)).shouldHave(Condition.exactText(itemData.get("Button2")));
//            }
//            if (itemData.containsKey("Button3")) {
//                $(getHomePage().getButton(3)).shouldHave(Condition.exactText(itemData.get("Button3")));
//            }
//        }
//    }

    @Then("\\[Home Page\\] Verify that Result (.*) is displayed$")
    public void homePageVerifyThatResul1IsVisible(String number) {
        Assert.assertEquals(getHomePage().getResult().getText(),"RESULT "+number,"Verify Result with Number");
        getHomePage().backButton();
    }

    @When("[Home Page] User tap on Flexible Update Button")
    public void homePageUserTapOnFlexibleUpdateButton() {
        getHomePage().getFlexibleButton().click();
    }

    @Then("[Home Page] Verify the Flexible Update button is visible")
    public void homePageVerifyTheFlexibleUpdateButtonIsVisible() {
        getHomePage().getFlexibleButton().isDisplayed();
    }
}