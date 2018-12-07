package com.laver.design.pattren.creational.prototype;


public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("init");
        System.out.println("init mail"+mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("name"+i);
            mailTemp.setEmailAddress("name"+i+"@laver.com");
            mailTemp.setContent("congratulation");
            MailUtil.sendMail(mailTemp);
            System.out.println("clone mail"+mailTemp);

        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
