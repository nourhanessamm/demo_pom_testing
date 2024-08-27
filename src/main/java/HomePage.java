import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By registerButton = By.className("ico-register");
    By loginButton = By.className("ico-login");
    WebElement registerButtonElement;
    WebElement loginButtonElement;
    public RegisterPage ClickOnRegisterButton()
    {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);//as it takes web element as a parameter not By
       return new RegisterPage(driver);

    }
    public LoginPage ClickOnLoginButton ()
    {
        loginButtonElement = driver.findElement(loginButton);
        Clicking(loginButtonElement);
        return new LoginPage(driver);


    }
}
