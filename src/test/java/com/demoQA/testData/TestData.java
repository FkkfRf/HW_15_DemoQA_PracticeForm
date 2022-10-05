package com.demoQA.testData;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

import static com.demoQA.utils.GenerateRandomDataUtils.*;

public class TestData {
    private static final Faker fakerRu = new Faker(new Locale("ru"));
    private static final Faker faker = new Faker();
   private static final String[] subjectArr = new String[] {"Maths" , "Accounting",
            "Arts" , "Social Studies" ,
            "Biology" , "Physics" ,
            "Chemistry" , "Computer Science" ,
            "Commerce" , "Economics" ,
            "Civics" , "Hindi" ,
            "English" , "History"};
  private static final String[] stateArr = new String[] {"NCR" , "Uttar Pradesh" , "Haryana" , "Rajasthan" };
   private static final String[] cityArr = new String[] {"Delhi" , "Agra", "Karnal", "Jaipur" };
   private static final int arr = (int) (Math.random() * 4 );
   private static final LocalDate randomD = randomBirthday();

   public static String firstName = fakerRu.name().firstName(),
            lastName = fakerRu.name().lastName(),
            gender = "Female",
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            userEmail = faker.internet().emailAddress(),
            dayC = randomDay(randomD),
            monthC = randomMonth(randomD),
            yearC = randomYear(randomD),
            subject1 = subjectArr[(int) (Math.random() * 5 )],
            subject2 = subjectArr[(int) (Math.random() * 5 + 5)],
            subject3 = subjectArr[(int) (Math.random() * 5 + 10)],
            state = stateArr[arr],
            city = cityArr[arr],
            fileUpload = "ForDemoQA.txt",
            hobbies1 = "Sports",
            hobbies2 = "Music",
            hobbies3 = "Reading",
            address = faker.address().streetAddress();

}
