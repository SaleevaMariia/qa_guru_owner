package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.DeviceConfig;
import qaguru.owner.config.FileSourceConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class DeviceTest {

    @Test
    public void testAndroid(){
        System.setProperty("type", "android");
        DeviceConfig config = ConfigFactory.create(DeviceConfig.class, System.getProperties());
        assertThat(config.appUrl()).isEqualTo("https://<>/android.apk");

    }

    @Test
    public void testIphone(){
        System.setProperty("type", "ios");
        DeviceConfig config = ConfigFactory.create(DeviceConfig.class, System.getProperties());
        assertThat(config.appUrl()).isEqualTo("https://<>/ios.apk");

    }
}
