package com.city.bank.app.rest.controller;


import com.city.bank.app.dto.AccountInfo;
import com.city.bank.app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/hdfc/accounts")
public class AccountRestController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(path = "/{account-no}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountInfo getAccountDetails(@PathVariable("account-no") String accountNumber, @MatrixVariable("mobile-no") String mobileNo) {
        System.out.println("Rest Controller Called");
        return accountService.getAccountDetails(accountNumber);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createAccount(@RequestBody AccountInfo accountInfo) {
        return "878575";
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountInfo updateAccount(@RequestBody AccountInfo accountInfo) {
        return null;
    }
}

