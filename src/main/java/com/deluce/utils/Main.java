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
                    System.out.println("选择发送紧急维护请求SN");
                    String AssetSN = scanner.nextLine();
                    sendEMRequestService.selectByUsername(inputUsername, AssetSN);
                    System.out.println("Request Report");
                    System.out.println("""
                            Priority:
                            1   General
                            2   High
                            3   Very High
                            """);
                    System.out.println("请选择Priority等级ID");
                    String priorityID = scanner.nextLine();
                    System.out.println("请输入Description of Emergency\n");
                    String DescriptionEmergency = scanner.nextLine();
                    System.out.println("请输入Other Considerations\n");
                    String OtherConsiderations = scanner.nextLine();
                    System.out.println("提交" + priorityID + "    " + DescriptionEmergency + "    " + OtherConsiderations);
                    sendEMRequestService.insertReport(DescriptionEmergency, OtherConsiderations, priorityID, AssetSN);
                } else {
                    //进入经历界面
                    System.out.println("Maintenance manager:");
                    System.out.println("1   Emergency Maintenance Management");
                    System.out.println("2   Inventory Management");
                    System.out.println("请输入操作");
                    int operateID = scanner.nextInt();
                    if (operateID == 1) {
                        //Emergency Maintenance Management功能
                        continue;
                    } else {
                        //Inventory Management功能
                        continue;
                    }
                }
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }
}
