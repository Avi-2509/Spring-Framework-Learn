package com.springcore;

public class student {
    private int stid;
    private String stuName, stuAddress;

    public student(int stid, String stuName, String stuAddress) {
        this.stid = stid;
        this.stuName = stuName;
        this.stuAddress = stuAddress;
    }

    public student() {
        super();
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public int getStid() {
        return stid;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    @Override
    public String toString() {
        return "student{" +
                "stid=" + stid +
                ", stuName='" + stuName + '\'' +
                ", stuAddress='" + stuAddress + '\'' +
                '}';
    }
}
