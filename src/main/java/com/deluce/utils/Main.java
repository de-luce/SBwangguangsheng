package com.deluce.utils;

import com.deluce.entity.Employees;
import com.deluce.service.LoginService;
import com.deluce.service.SelectService;
import com.deluce.service.SendEMRequestService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        SelectService selectService = new SelectService();
        SendEMRequestService sendEMRequestService = new SendEMRequestService();
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            boolean login = loginService.login(inputUsername, inputPassword);
            Employees employee = loginService.getEmployee(inputUsername, inputPassword);
            Integer isadmin = employee.getIsadmin();
            if (login) {
                System.out.println("Login successful!");
                if (isadmin == null) {
                    //进入责任方界面
                    System.out.println("Available Assents");
                    selectService.SelectEM(inputUsername);
                    System.out.println("选择发送紧急维护请求");
                    String sendEMRequest = scanner.nextLine();
                    sendEMRequestService.selectByUsername(inputUsername,sendEMRequest);
                    System.out.println("Request Report");
                    System.out.println("Priority:\n"+"1   General\n"+"2   High\n"+"3   Very High\n");
                    System.out.println("请选择Priority等级");
                    String priority = scanner.nextLine();
                    System.out.println("请输入Description of Emergency\n");
                    String DescriptionEmergency = scanner.nextLine();
                    System.out.println("请输入Other Considerations\n");
                    String OtherConsiderations = scanner.nextLine();

                }
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }
}
