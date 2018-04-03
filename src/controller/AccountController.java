/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Account;
import java.util.Scanner;

/**
 *
 * @author DAT
 */
public class AccountController {
    public Account createAccount(){
        Account acc = new Account();
        Scanner scan = new Scanner(System.in);
        System.out.println("Đăng ký tài khoản");
        System.out.println("Tạo tên đăng nhập: ");
        String username = scan.nextLine();
        System.out.println("Tạo mật khẩu: ");
        String password = scan.nextLine();
        acc.setUserName(username);
        acc.setPassWord(password);
        acc.setCreateDate(System.currentTimeMillis());
        acc.setAccountNumber(0);
        acc.setStatus(1);
        return acc;
    }
    
    public Account signIn(){
        Account acc = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đăng nhập tài khoản");
        System.out.println("Tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.println("Mật khẩu đăng nhập: ");
        String password = scanner.nextLine();
        acc.setUserName(username);
        acc.setPassWord(password);
        return acc;
    }
}
