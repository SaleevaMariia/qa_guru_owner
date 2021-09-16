package qaguru.homework.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/ProjectsIdea/api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("email")
    String getEmail();

    @Key("password")
    String getPassword();
}
