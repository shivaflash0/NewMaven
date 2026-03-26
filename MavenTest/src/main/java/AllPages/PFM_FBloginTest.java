package AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFM_FBloginTest {
    
    // Locators using @FindBy
    @FindBy(name="email")
    private WebElement UserNameText;

    @FindBy(name="pass")
    private WebElement PasswordText;

    @FindBy(name="login")
    private WebElement loginButton;

    // ✅ Proper constructor (not a void method)
    public PFM_FBloginTest(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Action method
    public void logintopage(String UN, String Pass) {
        UserNameText.sendKeys(UN);
        PasswordText.sendKeys(Pass);
        loginButton.click();
    }
}