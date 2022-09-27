package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hoocks {
    @Before
    public void before() {
        System.setProperty("webdriwer.chrome.driwer", "src/main/resources/chromedriver.exe");
        Configuration.timeout = 45000;
        Configuration.browserSize = "1920x1080";
        open("https://app.qase.io/login");
    }

    @After
    public void teardown(){
        closeWindow();
    }

}
