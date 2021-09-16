package qaguru.homework;

import org.junit.jupiter.api.Test;
import qaguru.homework.config.WebDriverHWProvider;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTests {

    @Test
    public void webLocalTest(){
        WebDriverHWProvider hwProvider = new WebDriverHWProvider("local");
        hwProvider.setConfigurationForDriver();
        open("/automation-practice-form");
        assertThat(title()).isEqualTo("ToolsQA");
    }

    @Test
    public void webRemoteTest(){
        WebDriverHWProvider hwProvider = new WebDriverHWProvider("remote");
        hwProvider.setConfigurationForDriver();
        open("/automation-practice-form");
        assertThat(title()).isEqualTo("ToolsQA");
    }
}
