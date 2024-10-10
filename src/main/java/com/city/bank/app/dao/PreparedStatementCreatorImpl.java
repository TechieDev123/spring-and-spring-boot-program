package com.city.bank.app.dao;

import org.springframework.jdbc.core.PreparedStatementCreator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementCreatorImpl implements PreparedStatementCreator {
    private final String accountNo;

    public PreparedStatementCreatorImpl(String accountNo) {
        this.accountNo=accountNo;
    }

    @Override
    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
        con.setAutoCommit(false);
        PreparedStatement preparedStatement= con.prepareStatement("select * from accounts where accountNo=?");
        preparedStatement.setString(1,accountNo);
        return preparedStatement;
    }
}
