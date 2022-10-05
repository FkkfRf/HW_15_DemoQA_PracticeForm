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
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGenderControl(gender)
                .setUserNumber(phoneNumber)
                .setBirthDate(dayC, monthC, yearC)
                .setSubjectText(subject1)
                .setSubjectText(subject2)
                .setSubjectText(subject3)
                .setHobbiesControl(hobbies1)
                .setHobbiesControl(hobbies2)
                .setHobbiesControl(hobbies3)
                .setStateItem(state)
                .setCityItem(city)
                .setUploadFile(fileUpload)
                .setCurrentAddress(address);

        submitInput.click();

        practiceFormPage.checkResultTableVisible()
                .checkResult("Student Name",firstName+" "+lastName)
                .checkResult("Gender",gender)
                .checkResult("Student Email",userEmail)
                .checkResult("Mobile",phoneNumber)
                .checkResult("Date of Birth",dayC + " " + monthC + "," + yearC)
                .checkResult("Subjects" ,subject1 +", "+ subject2 +", "+ subject3)
                .checkResult("State and City" , state + " " + city)
                .checkResult("Hobbies" , hobbies1 + ", " + hobbies2 + ", " + hobbies3)
                .checkResult("Picture" , fileUpload)
                .checkResult("Address" , address);

    }
}
