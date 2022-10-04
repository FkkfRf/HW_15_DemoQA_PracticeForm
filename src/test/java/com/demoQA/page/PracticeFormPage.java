package com.demoQA.page;

import com.codeborne.selenide.SelenideElement;
import com.demoQA.page.components.CalendarComponent;
import com.demoQA.page.components.ResultsModal;
import com.demoQA.page.components.SelectListComponent;
import com.demoQA.page.components.UploadFileComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    private CalendarComponent calendarComponent = new CalendarComponent();
    private SelectListComponent selectListComponent = new SelectListComponent();
    private UploadFileComponent uploadFileComponent = new UploadFileComponent();
    private ResultsModal resultsModal = new ResultsModal();
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

    //______Methods
    public PracticeFormPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));

       executeJavaScript("$('footer').remove()");
       executeJavaScript("$('#fixedban').remove()");
        return this;
        }
    public PracticeFormPage setTextField(SelenideElement textFieldSelector , String value){
        textFieldSelector.setValue(value);
        return this;
    }
    public PracticeFormPage clearTextField(SelenideElement textFieldSelector , String value){
        textFieldSelector.clear();
        return this;
    }
    public PracticeFormPage setSubjectText(SelenideElement subjectTextSelector , String value){
        subjectTextSelector.setValue(value).pressEnter();
        return this;
    }
    public PracticeFormPage setCustomControl(SelenideElement wrapperSelector , String value){
        wrapperSelector.$(byText(value)).click();
        return this;
    }
    public PracticeFormPage setSelectedItem(SelenideElement itemSelector , String item){
        selectListComponent.setSelectedItemOfList(itemSelector, item);
        return this;
    }
    public PracticeFormPage setBirthDate(SelenideElement dateSelector, String day, String month, String year){
        dateSelector.clear();
        calendarComponent.setDate(dateSelector, day, month, year);
        return this;
    }
    public PracticeFormPage setUploadFile(SelenideElement filePathSelector , String uploadPath){
        filePathSelector.clear();
        uploadFileComponent.setPathToUploadFile(filePathSelector, uploadPath);
        return this;
    }
    public PracticeFormPage checkResultTableVisible(SelenideElement modalDialog, SelenideElement modalTitle){
        resultsModal.checkVisible(modalDialog, modalTitle);
        return this;
    }
    public PracticeFormPage checkResult(SelenideElement titleResponsive , String key, String value){
        resultsModal.checkResult(titleResponsive , key, value);
        return this;
    }
}
