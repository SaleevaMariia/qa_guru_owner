package qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config{

    @Separator(",")
    @DefaultValue("banana, orange")
    List<String> getFruitsList();

    @Separator("/")
    @DefaultValue("banana/apple")
    String[] getFruitsArray();
}
