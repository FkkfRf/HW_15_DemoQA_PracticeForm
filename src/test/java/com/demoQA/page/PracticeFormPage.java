package com.demoQA.page;

import com.codeborne.selenide.SelenideElement;
import com.demoQA.page.components.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    private TextFieldComponent textFieldComponent = new TextFieldComponent();
    private CalendarComponent calendarComponent = new CalendarComponent();
    private SelectListComponent selectListComponent = new SelectListComponent();
    private UploadFileComponent uploadFileComponent = new UploadFileComponent();
    private ResultsModalComponent resultsModalComponent = new ResultsModalComponent();
    private final static String TITLE_TEXT = "Student Registration Form";
    public static SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            genderWrapperInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userEmailInput = $("#userEmail"),
            birthInput = $("#dateOfBirthInput"),
            subjectInput = $("#subjectsInput"),
            stateItemInput = $("#state"),
            cityItemInput = $("#city"),
            fileUploadInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            hobbiesWrapperInput = $("#hobbiesWrapper"),
            modalDialogInput = $(".modal-dialog"),
            modalTitleInput = $(".modal-title"),
            modalTitleResponsiveInput = $(".table-responsive"),
            submitInput = $("#submit");

    //_____________________Methods
    public PracticeFormPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));

       executeJavaScript("$('footer').remove()");
       executeJavaScript("$('#fixedban').remove()");
        return this;
        }
    public PracticeFormPage setFirstName(String value){
        textFieldComponent.setText(firstNameInput , value);
        return this;
    }
    public PracticeFormPage setLastName(String value){
        textFieldComponent.setText(lastNameInput , value);
        return this;
    }
    public PracticeFormPage setUserEmail(String value){
        textFieldComponent.setText(userEmailInput , value);
        return this;
    }
    public PracticeFormPage setUserNumber(String value){
        textFieldComponent.setText(userNumberInput , value);
        return this;
    }
    public PracticeFormPage setCurrentAddress(String value){
        textFieldComponent.setText(currentAddressInput , value);
        return this;
    }
    public PracticeFormPage setGenderControl(String value) {
        genderWrapperInput.$(byText(value)).click();
        return this;
    }
    public PracticeFormPage setBirthDate( String day, String month, String year){
        birthInput.clear();
        calendarComponent.setDate(birthInput, day, month, year);
        return this;
    }
    public PracticeFormPage setSubjectText( String value){
        subjectInput.setValue(value).pressEnter();
        return this;
    }
    public PracticeFormPage setHobbiesControl(String value){
        hobbiesWrapperInput.$(byText(value)).click();
        return this;
    }
    public PracticeFormPage setUploadFile(String uploadPath){
        fileUploadInput.clear();
        uploadFileComponent.setPathToUploadFile(fileUploadInput , uploadPath);
        return this;
    }
        public PracticeFormPage setStateItem(String value){
            selectListComponent.setSelectedItemOfList(stateItemInput, value);
            return this;
        }
    public PracticeFormPage setCityItem(String value){
        selectListComponent.setSelectedItemOfList(cityItemInput, value);
        return this;
    }

    public PracticeFormPage checkResultTableVisible(){
        resultsModalComponent.checkVisible(modalDialogInput, modalTitleInput);
        return this;
    }
    public PracticeFormPage checkResult(String key, String value){
        resultsModalComponent.checkResult( modalTitleResponsiveInput , key, value);
        return this;
    }
}
