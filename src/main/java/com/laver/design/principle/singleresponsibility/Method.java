package com.laver.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "laver";
        address = "Guangzhou";
    }
    private void updateUsername(String userName){
        userName = "laver";
    }
    private void updateUserAddress(String address){
        address = "Guangzhou";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if (bool){
            //todo something 1 ...
        }else {
            //todo something 2 ...
        }
        userName = "laver";
        address = "Guangzhou";
    }
}
