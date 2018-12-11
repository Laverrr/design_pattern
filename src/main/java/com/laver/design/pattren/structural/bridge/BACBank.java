package com.laver.design.pattren.structural.bridge;

public class BACBank extends Bank {
    public BACBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("open ABCBank account");
        account.openAccount();
        return account;
    }
}
