package qaguru.owner.config;

import org.aeonbits.owner.Config;
import qaguru.dictionary.Browsers;

public interface WebDriverConfigOwner extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    Browsers getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();
}
