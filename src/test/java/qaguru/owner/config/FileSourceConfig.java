package qaguru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:./local.properties",
        "classpath:testing.properties"
})
public interface FileSourceConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("userName")
    String userName();

    @Key("password")
    String password();
}
