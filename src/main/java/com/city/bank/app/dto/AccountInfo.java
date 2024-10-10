package com.city.bank.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo implements Serializable {
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private String accountStatus;
    private String branch;
    private String phoneNumber;
    private String panCard;
    private Float balance;
}
