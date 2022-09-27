package steps;

import io.cucumber.java.ru.И;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @И("^Появляется подсказка об ошибке These credentials do not match our records.$")
    public void errorHintIsVisible(){
        loginPage.errorHintIsVisible();
    }
}
