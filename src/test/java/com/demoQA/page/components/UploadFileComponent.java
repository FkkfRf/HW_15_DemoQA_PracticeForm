package com.demoQA.page.components;

import com.codeborne.selenide.SelenideElement;

public class UploadFileComponent {

    public UploadFileComponent setPathToUploadFile(SelenideElement loadSelector , String fileName){
        loadSelector.uploadFromClasspath(fileName);
        return this;
    }
}
