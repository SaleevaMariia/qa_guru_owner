package qaguru.homework.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverHWProvider {

    private WebConfig config;

    public WebDriverHWProvider(String launchType){
        System.setProperty("launchType", launchType);
        this.config = ConfigFactory.create(WebConfig.class, System.getProperties());
    }

    public void setConfigurationForDriver(){
        Configuration.baseUrl="https://demoqa.com";
        Configuration.startMaximized = true;
        switch (config.getBrowser()){
            case FIREFOX: Configuration.browser="firefox"; break;
            case CHROME: Configuration.browser="chrome"; break;
            default: throw new RuntimeException("No such browser:" + config.getBrowser());
        }
        Configuration.remote = config.getRemote();
        Configuration.browserVersion = config.getVersion();
    }


}
