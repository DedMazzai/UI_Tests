package pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void fillField(String field, String value) {
        $(byXpath("(//*[.//text() = '" + field + "' and .//input])[last()]//input")).setValue(value);
    }

    public void clickButton(String button) {
        $(byXpath("(//*[.//text() = '"+ button +"' and .//button])[last()]//button")).click();
    }
}
