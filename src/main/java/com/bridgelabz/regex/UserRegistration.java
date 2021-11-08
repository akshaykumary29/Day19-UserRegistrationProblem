package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * User Registration Problem using RegEx
 *
 * @author : Akshay
 * @version : 8.0
 * @since : 08/11/2021
 */

public class UserRegistration extends UserDetails {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem.");
        // take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Name: ");
        String firstName = scanner.next();
        checkValidFirstName(firstName);

        System.out.println("Enter Your Last Name: ");
        String lastName = scanner.next();
        checkValidLastName(lastName);

        System.out.println("Enter Your Email Address: ");
        String email = scanner.next();
        checkValidEmail(email);

        System.out.println("Enter Your Mobile Number: ");
        String mobileNumber = scanner.next();
        checkValidMobileNumber(mobileNumber);

        System.out.println("Enter Your Password: ");
        String password = scanner.next();
        checkValidPassword(password);

        System.out.println("Enter Your Password: ");
        String password1 = scanner.next();
        checkValidPassword1(password1);


        System.out.println("Enter Your Password: ");
        String password2 = scanner.next();
        checkValidPassword2(password2);

        System.out.println("Enter Your Password: ");
        String password3 = scanner.next();
        checkValidPassword3(password3);

        scanner.close();
    }
}
