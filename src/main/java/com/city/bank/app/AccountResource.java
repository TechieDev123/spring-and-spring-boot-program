package com.city.bank.app;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/hdfc/accounts")
public class AccountResource {
    @RequestMapping(path = "/{account-no}", method = RequestMethod.GET)
    public String getAccountDetails(@PathVariable("account-no") String accountNo, @MatrixVariable("mobile-no") String mobileNo) {
        System.out.println("Resource Layer");
        return "Testing...";
    }
}

