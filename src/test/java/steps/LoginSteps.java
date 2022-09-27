package steps;

import io.cucumber.java.ru.И;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;


public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @И("^Появляется подсказка об ошибке These credentials do not match our records.$")
    public void errorHintIsVisible() {
        loginPage.errorHintIsVisible();
    }

    @И("^Цвет подсказки красный$")
    public void errorHintColorIsRed() {
        Assertions.assertEquals("rgba(208, 1, 27, 1)", loginPage.errorColorCode());
    }
}
