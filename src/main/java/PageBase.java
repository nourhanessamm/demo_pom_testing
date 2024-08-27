import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//class includes all the common things between the pages
public class PageBase {
    protected WebDriver driver;
    public PageBase (WebDriver driver) //constructor
    {
        this.driver = driver;
    }
    public static void Clicking(WebElement element)
    {
        element.click();
    }
    public static void SendText(WebElement element,String text)
    {
     element.sendKeys(text);
    }
}
