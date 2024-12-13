package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    private String titleXpath = "//android.view.ViewGroup/android.widget.TextView";
    private String logopath="//android.widget.Image[@text='meezan_logo']";
    private String immediateButtonID = "com.meritnation.store.testingapp:id/btn1";
    private String flexibleButtonID = "com.meritnation.store.testingapp:id/btn2";
    private String versionCodeID ="com.meritnation.store.testingapp:id/ver_code";
    private String versionNameID ="com.meritnation.store.testingapp:id/ver_name";
    private String resultText ="com.meritnation.store.testingapp:id/txt";
    private String username="//android.widget.EditText[@resource-id=\"login_username|input\"]";
    private String Password="//android.widget.EditText[@resource-id=\"login_password|input\"]";
    private String Login="//android.widget.Button[@text=\"Log In\"]";
    private String Location="//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message\"]";
    private String Allow="//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]";
    private String backarrow="//android.widget.Image[@resource-id=\"backArrow\"]";
    private String show="//android.widget.TextView[@text=\"SHOW BALANCE\"]";
    private String sendmoneybutton="//android.widget.Button[@text=\"Send Money To A New Account\"]";
    private String search="//android.widget.EditText";
    private String bank="//android.widget.TextView[@text=\"Meezan Bank\"]";
    private String accountno="//android.widget.EditText[@resource-id=\"mznInput|input\"]";
    private String fetchaccount="//android.widget.Button[@text=\"Fetch Account Details\"]";
    private String nextbutton="//android.widget.Button[@text=\"Next\"]";
    private String pkrfield="//android.widget.EditText[@resource-id=\"specific-amount|input\"]";
    private String sendnowbutton="//android.widget.Button[@text=\"Send Now\"]";
    private String sentmessage="//android.widget.TextView[@text=\"Money Sent Successfully\"]";
    private String almeezan="//android.view.View[@text=\"Click for Al Meezan Investment\"]/android.view.View[1]";
    private String invest="//android.widget.Button[@text=\"Invest\"]";
    private String portfolio="//android.widget.Spinner[@resource-id=\"oj-select-choice-2\"]";

    public HomePage() {
    }

    public WebElement getTitle() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(logopath)));
    }

    public WebElement Username(){

        return ( AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(username)));
    }

    public WebElement Password(){

        return ( AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(Password)));
    }

    public WebElement logInButton(){

        return ( AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(Login)));
    }

    public WebElement locationAlert(){

        return(AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(Location)));

    }

    public WebElement Allow(){

        return(AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(Allow)));

    }


    public WebElement sendmoneybut(){

        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(sendmoneybutton)));
    }

    public WebElement showBalance(){

        return ( AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(show)));
    }

    public WebElement dynamic(String buttontext){
        String dynamicXpath = String.format("//android.widget.TextView[@text=\"%s\"]",buttontext);
        return ( AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(dynamicXpath)));
    }

    public WebElement Almeezan(){

        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(almeezan)));
    }

    public WebElement back_arrow(){

        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(backarrow)));
    }
    public WebElement Invest(){

        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(invest)));
    }

    public WebElement Portfolio(){

        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(portfolio)));
    }




    public WebElement banksearch() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(search)));
    }

    public WebElement accountinput() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(accountno)));
    }
    public WebElement accountbutton() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(fetchaccount)));
    }

    public WebElement bank() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(bank)));
    }

    public WebElement accountdetailsbutton() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(nextbutton)));
    }

    public WebElement amountinput() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(pkrfield)));
    }
    public WebElement sendnow() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(sendnowbutton)));
    }
    public WebElement moneysentmessage() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(sentmessage)));
    }

    public WebElement getVersionCode() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(versionCodeID)));
    }

    public WebElement getVersionName() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(versionNameID)));
    }

    public WebElement getButton(int num) {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id("com.meritnation.store.testingapp:id/btn"+num)));
    }

    public WebElement getImmediateButton() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(immediateButtonID)));
    }

    public WebElement getFlexibleButton() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(flexibleButtonID)));
    }

    public WebElement getResult() {
        return (AndroidDriverSetup.getAndroidDriver().findElement(By.id(resultText)));
    }

    public void backButton() {
         AndroidDriverSetup.getAndroidDriver().navigate().back();
    }
}
