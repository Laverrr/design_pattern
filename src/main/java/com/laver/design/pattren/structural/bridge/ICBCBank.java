package com.laver.design.pattren.structural.bridge;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("open ICBCBank account");
        account.openAccount();
        return account;
    }
}
