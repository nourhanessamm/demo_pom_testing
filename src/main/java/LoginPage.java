import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By Email = By.className("email");//encapsulation
    private WebElement EmailElement;

    private By Password = By.className("password");
    private WebElement PasswordElement;

    public void EnterEmail(String email)
    {
        EmailElement=driver.findElement(Email);
        SendText(EmailElement,email);
    }
    public void EnterPassword(String pass)
    {
        PasswordElement=driver.findElement(Password);
        SendText(PasswordElement,pass);
    }

}
