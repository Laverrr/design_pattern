package com.laver.design.principle.compositionaggregation;

public class ProductDao  {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("use " + connection + " add product");
    }
}
