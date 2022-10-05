package com.demoQA.page.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class ResultsModalComponent {
    private final static String TITLE_TEXT = "Thanks for submitting the form";
    public ResultsModalComponent checkVisible(SelenideElement modalDialog, SelenideElement modalTitle){
        modalDialog.should(appear);
        modalTitle.shouldHave(text(TITLE_TEXT));
        return this;
    }
    public ResultsModalComponent checkResult(SelenideElement titleResponsive , String key, String value){
        titleResponsive.$(byText(key))
                .parent().shouldHave((text(value)));
        return this;
    }
}
