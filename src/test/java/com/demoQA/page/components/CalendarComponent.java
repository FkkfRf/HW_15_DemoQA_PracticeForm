package com.demoQA.page.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class CalendarComponent {
    public CalendarComponent setDate(SelenideElement dateInput, String day, String month, String year){
        dateInput.click();
        $(".react-datepicker__month-select").selectOption(month);
        $(By.className("react-datepicker__year-select")).selectOption(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month").click();
        return this;
    }
}
