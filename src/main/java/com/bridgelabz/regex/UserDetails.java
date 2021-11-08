package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserDetails {

    public static void checkValidFirstName(String firstName) {

        boolean isFirstName;
        String firstNameRegex = "^[A-Z]{1}[a-z]{2}"; //String pattern to be detected
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);
        // check if it Valid Or Not
        isFirstName = matcher.matches();
        if (isFirstName)
            System.out.println(firstName + " is Valid First Name");
        else
            System.out.println(firstName + " is Invalid First Name");
    }
}
