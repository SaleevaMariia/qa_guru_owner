package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.PrimitiveTypesConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimitiveTypesTest {

    @Test
    public void testTypes(){
        PrimitiveTypesConfig config =
                ConfigFactory.create(PrimitiveTypesConfig.class, System.getProperties());

        assertThat(config.getBoolean()).isEqualTo(true);
        assertThat(config.getInt()).isEqualTo(1);
        assertThat(config.getLong()).isEqualTo(1l);
        assertThat(config.getDouble()).isEqualTo(1.1);

    }

}
