import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test
    public void ValidRegisterTc()
    {
       homePage = new HomePage(driver);
   //homePage.ClickOnRegisterButton(); //it returns object from register page
        registerPage=homePage.ClickOnRegisterButton();
        registerPage.ChooseGender();
        registerPage.EnterFirstName("nourhan");
        registerPage.EnterLastName("Essam");
        registerPage.EnterEmail("nourhan@gmail.com");
        registerPage.EnterPassword("1111");
        registerPage.Re_EnterPassword("1111");
        registerPage.register_button();


    }
}
