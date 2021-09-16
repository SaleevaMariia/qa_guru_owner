package qaguru.owner.config;

public class WebDriverConfig {

    public String getBrowser(){
        final String browser = System.getProperty("browser");
        return browser == null ? "chrome" : browser;
    }

    public String getBaseUrl(){
        String baseURL = System.getProperty("baseUrl");
        return baseURL == null ? "https://github.com" : baseURL;
    }
}
