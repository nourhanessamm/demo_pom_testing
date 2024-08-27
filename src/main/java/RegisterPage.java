import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {

        super(driver);
    }
    private By genderMale = By.id("gender-male");
     private WebElement gendermaleElement;

    private By firstName = By.id("FirstName");
    private WebElement firstNameElement ;

    private By lastName = By.id("LastName");
    private WebElement lastNameElement ;

    private By emailField = By.id("Email");
    private WebElement emailFieldElement ;

    private By passwordField = By.id("Password");
    private WebElement passwordFieldElement ;

    private By rePasswordField = By.id("ConfirmPassword");
    private WebElement rePasswordFieldElement ;

    private By registerButton = By.id("register-button");
    private WebElement registerButtonElement;

    public void EnterFirstName (String fname)
    {
    firstNameElement=driver.findElement(firstName);
    SendText(firstNameElement,fname);
    }
    public void EnterLastName (String lname)
    {
    lastNameElement=driver.findElement(lastName);
    SendText(lastNameElement,lname);
    }
    public void EnterEmail (String email)
    {
        emailFieldElement=driver.findElement(emailField);
        SendText(emailFieldElement,email);

    }
    public void EnterPassword (String password)
    {
     passwordFieldElement=driver.findElement(passwordField);
     SendText(passwordFieldElement,password);
    }
    public void Re_EnterPassword (String re_pass)
    {
        rePasswordFieldElement=driver.findElement(rePasswordField);
        SendText(rePasswordFieldElement,re_pass);

    }
    public void ChooseGender()
    {
        gendermaleElement = driver.findElement(genderMale);
        Clicking(gendermaleElement);
    }
    public void register_button()
    {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);
    }

}
