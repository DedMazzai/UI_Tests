package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final SelenideElement errorHint = $x("//div[@data-qase-test=\"login-error\"]");

    public void errorHintIsVisible(){
        errorHint.shouldBe(Condition.visible);
    }

    public String errorColorCode(){
        return errorHint.getCssValue("color");
    }
}
