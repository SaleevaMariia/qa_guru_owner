package qaguru.owner.config;

import org.aeonbits.owner.Config;

public interface PrimitiveTypesConfig extends Config {

    @DefaultValue("1")
    long getLong();

    @DefaultValue("1")
    int getInt();

    @DefaultValue("1.1")
    double getDouble();

    @DefaultValue("true")
    boolean getBoolean();
}
