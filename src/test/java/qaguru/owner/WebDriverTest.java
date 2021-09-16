package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import qaguru.owner.config.WebDriverConfigOwner;
import qaguru.owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebDriverTest {

    private static final String TITLE = "GitHub: Where the world builds software";
    private WebDriver driver = new WebDriverProvider().createDriver();

    @Test
    public void testOpenGitHubPage(){
        //для конкретного теста
        assertTrue(driver.getTitle().contains(TITLE));
        //для каждого теста
        driver.quit();
    }
}
