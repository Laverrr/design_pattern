package com.laver.design.pattren.structural.proxy.db;

public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBtype(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }
    public static String getDBtype(){
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
}
