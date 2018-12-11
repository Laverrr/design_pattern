package com.laver.design.pattren.structural.bridge;

public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("open saving account");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("this is a saving account");
    }
}
