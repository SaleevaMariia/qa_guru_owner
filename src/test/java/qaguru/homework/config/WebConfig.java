package qaguru.homework.config;

import org.aeonbits.owner.Config;
import qaguru.dictionary.Browsers;


@Config.Sources({
        "classpath:/hw/${launchType}.properties"
})
public interface WebConfig extends Config {
    @DefaultValue("CHROME")
    @Key("browser")
    Browsers getBrowser();

    @Key("version")
    String getVersion();

    @Key("remote")
    String getRemote();
}
