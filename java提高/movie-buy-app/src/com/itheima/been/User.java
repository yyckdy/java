package com.itheima.been;

/**
 * 用户类（客户和商家的父类）
 */
public class User {
    private String loginName;//登录名 不能重复
    private String userName;//用户名
    private String passWord;
    private char sex;
    private String phone;
    private double money;

    public User(String loginName, String userName, String passWord, char sex, String phone, double money) {
        this.loginName = loginName;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
    }

    public User() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
