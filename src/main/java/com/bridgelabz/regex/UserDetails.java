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
            System.out.println(firstName + " is a Valid First Name");
        else
            System.out.println(firstName + " is an Invalid First Name");
    }

    public static void checkValidLastName(String lastName) {

        boolean islastName;
        String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        islastName = matcher.matches();
        if (islastName)
            System.out.println(lastName + " is a Valid Last Name");
        else
            System.out.println(lastName + " is an Invalid Last Name");
    }

    public static void checkValidEmail(String email) {

        boolean isEmail;
        String emailRegex = "^[a-z]+[a-z0-9]*[- . + _]?[a-z0-9]+[@]{1}[a-z]+[.]?[a-z]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        isEmail = matcher.matches();
        if (isEmail)
            System.out.println(email + " is a Valid Email Address");
        else
            System.out.println(email + " is an Invalid Email Address");
    }

    public static void checkValidMobileNumber(String mobileNumber) {

        boolean isMobileNumber;
        String mobileNumberRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        isMobileNumber = matcher.matches();

        if (isMobileNumber)
            System.out.println(mobileNumber + " is a Valid Mobile Number");
        else
            System.out.println(mobileNumber + " is an InValid Mobile Number");
    }

    public static void checkValidPassword(String password) {

        boolean isPassword;
        String passwordRegex = "^([a-zA-Z]*[]\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+]*){8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        isPassword = matcher.matches();
        if (isPassword)
            System.out.println(password + " is a Valid Password\n");
        else
            System.out.println(password + " is an Invalid Password");
    }
}
