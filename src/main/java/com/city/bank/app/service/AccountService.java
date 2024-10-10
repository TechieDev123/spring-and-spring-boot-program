package com.city.bank.app.service;

import com.city.bank.app.dto.AccountInfo;
import com.city.bank.app.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public AccountInfo getAccountDetails(String accountNumber) {
        return accountDao.getAccountDetails(accountNumber);
    }
}
