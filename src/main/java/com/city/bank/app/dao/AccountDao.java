package com.city.bank.app.dao;

import com.city.bank.app.dto.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

@Repository
public class AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    ResultSetExtractor<AccountInfo> resultSetExtractor = (ResultSet rs) -> {
        AccountInfo accountInfo = new AccountInfo();
        if (rs.next()) {
            accountInfo.setAccountNumber(rs.getString(2));
            accountInfo.setAccountHolderName(rs.getString(3));
            accountInfo.setAccountType(rs.getString(4));
            accountInfo.setAccountStatus(rs.getString(5));
            accountInfo.setBranch(rs.getString(6));
            accountInfo.setPhoneNumber(rs.getString(7));
            accountInfo.setPanCard(rs.getString(8));
            accountInfo.setBalance(rs.getFloat(9));
        }
        return accountInfo;
    };

    public AccountInfo getAccountDetails(String accountNumber) {
        return jdbcTemplate.query(new PreparedStatementCreatorImpl(accountNumber), resultSetExtractor);
    }
}
