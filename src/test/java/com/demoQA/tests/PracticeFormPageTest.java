package com.demoQA.tests;

import com.demoQA.page.PracticeFormPage;
import org.junit.jupiter.api.Test;
import static com.demoQA.page.PracticeFormPage.*;
import static com.demoQA.testData.TestData.*;
import static com.demoQA.testData.TestData.address;

public class PracticeFormPageTest extends BaseTest{
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillFormWithTestData(){
        practiceFormPage.openPage()
                .setTextField(firstNameInput, firstName)
                .setTextField(lastNameInput, lastName)
                .setTextField(userEmailInput, userEmail)
                .setCustomControl(genderWrapperInput, gender)
                .setTextField(userNumberInput, phoneNumber)
                .setBirthDate(birthInput, dayC, monthC, yearC)
                .setSubjectText(subjectInput, subject1)
                .setSubjectText(subjectInput, subject2)
                .setSubjectText(subjectInput, subject3)
                .setCustomControl(hobbiesWrapperInput, hobbies1)
                .setCustomControl(hobbiesWrapperInput, hobbies2)
                .setCustomControl(hobbiesWrapperInput, hobbies3)
                .setSelectedItem(stateItemInput, state)
                .setSelectedItem(cityItemInput, city)
                .setUploadFile(fileUploadInput, fileUpload)
                .setTextField(currentAddressInput, address);

        submitInput.click();

        practiceFormPage.checkResultTableVisible(modalDialogInput, modalTitleInput)
                .checkResult(modalTitleResponsiveInput , "Student Name",firstName+" "+lastName)
                .checkResult(modalTitleResponsiveInput , "Gender",gender)
                .checkResult(modalTitleResponsiveInput , "Student Email",userEmail)
                .checkResult(modalTitleResponsiveInput , "Mobile",phoneNumber)
                .checkResult(modalTitleResponsiveInput , "Date of Birth",dayC + " " + monthC + "," + yearC)
                .checkResult(modalTitleResponsiveInput , "Subjects" ,subject1 +", "+ subject2 +", "+ subject3)
                .checkResult(modalTitleResponsiveInput , "State and City" , state + " " + city)
                .checkResult(modalTitleResponsiveInput , "Hobbies" , hobbies1 + ", " + hobbies2 + ", " + hobbies3)
                .checkResult(modalTitleResponsiveInput , "Picture" , fileUpload)
                .checkResult(modalTitleResponsiveInput , "Address" , address);

    }
}
