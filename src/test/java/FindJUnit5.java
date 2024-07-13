import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindJUnit5 {
    @BeforeAll
    static void beforeAll() {
            Configuration.browserSize = "1920x1080";
            Configuration.pageLoadStrategy = "eager";
            Configuration.timeout = 5000;
            Configuration.baseUrl ="https://github.com";
            Configuration.holdBrowserOpen = true;
    }
    @Test
    void findExample() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(byText("Soft assertions")).shouldBe(visible).click();
        $$("div.wiki-content div").get(5).$("a");

    }

}
