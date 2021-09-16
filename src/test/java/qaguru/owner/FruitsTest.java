package qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.FruitsConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    @Test
    public void testFruits(){
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsList()).contains("banana", "orange");
        assertThat(config.getFruitsArray()).contains("banana", "apple");
    }
}
