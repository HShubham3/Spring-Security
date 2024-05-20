package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    private String msg;

    @GetMapping("/")
    public String getHome() {
        msg = "Welcome to SHY Bank!";
        return msg;
    }

    @GetMapping("/balance")
    public String getBalance() {
        msg = "Available balance : 450000";
        return msg;
    }

    @GetMapping("/statement")
    public String getStatment() {
        msg = "Last 5 transactions :\n" +
                "Credited:25000 (04/05/2024) \n" +
                " Debited:29789 (08/05/2024) \n" +
                " Debited:28901 (015/05/2024) \n" +
                " Credited:150000 (24/05/2024)";
        return msg;
    }

    @GetMapping("/myloan")
    public String getLoan() {
        msg = "Due Amount : 25000";
        return msg;
    }

    @GetMapping("/contact")
    public String getContact() {
        msg = "Thank you for contacting, We will be back to you soon !";
        return msg;
    }

}
