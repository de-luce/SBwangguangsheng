package com.deluce.utils;

import com.deluce.service.LoginService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (service.login(inputUsername, inputPassword)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }
}
