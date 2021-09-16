package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.FileSourceConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class FileSourceTest {

    @Test
    public void testFromFileInClasspath(){
        FileSourceConfig config = ConfigFactory.create(FileSourceConfig.class, System.getProperties());

        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.userName()).isEqualTo("classpath-user");
        assertThat(config.password()).isEqualTo("classpath-pass");

    }

    @Test
    public void testFromFileInHomeDirectory(){
        FileSourceConfig config = ConfigFactory.create(FileSourceConfig.class, System.getProperties());

        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.userName()).isEqualTo("local-user");
        assertThat(config.password()).isEqualTo("local-pass");

    }


}
