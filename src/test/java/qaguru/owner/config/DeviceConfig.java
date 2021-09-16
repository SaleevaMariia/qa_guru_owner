package qaguru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${type}.properties "
})
public interface DeviceConfig extends Config {

    @Key("platform")
    String platform();

    @Key("device")
    String device();

    @Key("appUrl")
    String appUrl();
}
