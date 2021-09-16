package qaguru.owner.config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import qaguru.dictionary.Browsers;

public class WebDriverProvider {

    private WebDriverConfigOwner config;

    public WebDriverProvider(){
        this.config = ConfigFactory.create(WebDriverConfigOwner.class, System.getProperties());
    }

    public WebDriver createDriver(){
        WebDriver driver = getDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    private WebDriver getDriver(){
        final Browsers browser = config.getBrowser();
        switch (browser){
            case FIREFOX: return new FirefoxDriver();
            case CHROME: return new ChromeDriver();
        }
        throw new RuntimeException("No such browser: " + browser);
    }
}
