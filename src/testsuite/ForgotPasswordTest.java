package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 4. Write down the following test into ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */
public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before //Annotation
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test // Annotation
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[text() = 'Forgot your password? ']")).click();

        //Verify the text ‘Reset Password’
        String expected = "Reset Password";
        WebElement resetPasswordElement = driver.findElement(By.xpath("//h6[text() = 'Reset Password']"));
        String actual = resetPasswordElement.getText();
        Assert.assertEquals(expected, actual);

    }

    //Annotation
    @After
    public void tearDown() {
        driver.close();
    }
}
