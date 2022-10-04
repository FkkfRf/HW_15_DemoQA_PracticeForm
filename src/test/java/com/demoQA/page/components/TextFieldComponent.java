package com.demoQA.page.components;

import com.codeborne.selenide.SelenideElement;
public class TextFieldComponent {
    public TextFieldComponent setText(SelenideElement textFieldSelector , String value){
        textFieldSelector.setValue(value);
        return this;
    }

    public TextFieldComponent clearText(SelenideElement textFieldSelector){
        textFieldSelector.clear();
        return this;
    }
}
