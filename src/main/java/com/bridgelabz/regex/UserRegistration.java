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
        // take input first name from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String firstName = scanner.next();
        checkValidFirstName(firstName);
        scanner.close();
    }
}
