package steps;

import config.UserConfig;
import io.cucumber.java.ru.И;
import pages.BasePage;


public class BaseSteps {
    BasePage basePage = new BasePage();

    @И("^Заполняется поле \"(.+)\" значением \"(.+)\"$")
    public void fillField(String field, String value) {
        basePage.fillField(field, value);
    }

    @И("^Нажимается кнопка \"(.+)\"$")
    public void clickButton(String button) {
        basePage.clickButton(button);
    }

    @И("^Клиент авторизован$")
    public void logIn(){
        basePage.fillField("Email", UserConfig.USER_LOGIN);
        basePage.fillField("Password", UserConfig.USER_PASSWORD);
        basePage.clickButton("Login");
    }
}
