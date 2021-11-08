package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserDetails {

    public static void checkValidFirstName(String firstName) {

        boolean isFirstName;
        String firstNameRegex = "^[A-Z]{1}[a-z]{2,}"; //String pattern to be detected
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);
        // check if it Valid Or Not
        isFirstName = matcher.matches();
        if (isFirstName)
            System.out.println(firstName + " is Valid First Name");
        else
            System.out.println(firstName + " is Invalid First Name");
    }

    public static void checkValidLastName(String lastName) {

        boolean islastName;
        String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        islastName = matcher.matches();
        if (islastName)
            System.out.println(lastName + " is Valid Last Name");
        else
            System.out.println(lastName + " is Invalid Last Name");
    }
}
